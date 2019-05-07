package com.tedu.sp09.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.tedu.sp01.pojo.Item;
import com.tedu.web.util.JsonResult;
/**
 *调用接口的getItems()方法时
 *根据SpringMVC注解会调用localhost:8001
 *服务器的/{orderId}和商品微服务的控制器定义代码一致即可 
 *
 */
@FeignClient(name="item-service",fallback=ItemFeignServiceFB.class)
public interface ItemFeignService {
	
	@GetMapping("/{orderId}")
	public JsonResult<List<Item>> getItems(@PathVariable String orderId);
	
	@PostMapping("/decreaseNumber")
	public JsonResult decreaseNumber(@RequestBody List<Item> items);
}






