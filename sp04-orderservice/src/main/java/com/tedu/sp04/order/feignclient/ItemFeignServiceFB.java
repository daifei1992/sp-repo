package com.tedu.sp04.order.feignclient;

import java.util.List;

import org.springframework.stereotype.Component;

import com.tedu.sp01.pojo.Item;
import com.tedu.web.util.JsonResult;
@Component
public class ItemFeignServiceFB implements ItemFeignService {

	@Override
	public JsonResult<List<Item>> getItems(String orderId) {
		
		return JsonResult.err("获取商品订单列表失败");
	}

	@Override
	public JsonResult decreaseNumber(List<Item> items) {
		
		return JsonResult.err("无法修改商品库存");
	}

}
