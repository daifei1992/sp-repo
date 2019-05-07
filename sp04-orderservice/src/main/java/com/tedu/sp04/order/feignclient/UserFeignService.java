package com.tedu.sp04.order.feignclient;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name="user-service",fallback=UserFeignServiceFB.class)
public interface UserFeignService {

}
