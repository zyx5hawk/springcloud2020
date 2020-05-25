package com.zyx.springcloud.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.zyx.springcloud.entities.CommonResult;
import com.zyx.springcloud.entities.Payment;

@Component
@FeignClient(value = "CLOUD-PAYMENT-SERVICE")
public interface PaymentFeignService {
	@PostMapping(value = "/payment/create")
	public CommonResult<Payment> create();

	@GetMapping(value = "/payment/get/{id}")
	public CommonResult<Payment> get(@PathVariable("id") Long id);

	@GetMapping(value = "/payment/getlist")
	public CommonResult<List<Payment>> getList();
}
