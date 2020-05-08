package com.zyx.springcloud.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.zyx.springcloud.entities.CommonResult;
import com.zyx.springcloud.entities.Payment;

@RestController
public class OrderController {

	private String Payment_Url = "http://localhost:8001";

	@Resource
	private RestTemplate restTemplate;

	@GetMapping("/consumer/create")
	public CommonResult<Payment> create() {
		return restTemplate.postForObject(Payment_Url + "/payment/create", null, CommonResult.class);
	}

	@GetMapping(value = "/consumer/get/{id}")
	public CommonResult<Payment> get(@PathVariable("id") Long id) {
		return restTemplate.getForObject(Payment_Url + "/payment/get/" + id, CommonResult.class);
	}

	@GetMapping(value = "/consumer/getlist")
	public CommonResult<List<Payment>> getList() {
		return restTemplate.getForObject(Payment_Url + "/payment/getlist", CommonResult.class);
	}

}
