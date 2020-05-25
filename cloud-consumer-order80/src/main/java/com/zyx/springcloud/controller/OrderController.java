package com.zyx.springcloud.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.zyx.springcloud.entities.CommonResult;
import com.zyx.springcloud.entities.Payment;

@RestController
@RequestMapping("/consumer")
public class OrderController {

	private String Payment_Url = "http://CLOUD-PAYMENT-SERVICE/payment";

	@Resource
	private RestTemplate restTemplate;

	@GetMapping("/create")
	public CommonResult<Payment> create() {
		return restTemplate.postForObject(Payment_Url + "/create", null, CommonResult.class);
	}

	@GetMapping(value = "/get/{id}")
	public CommonResult<Payment> get(@PathVariable("id") Long id) {
		return restTemplate.getForObject(Payment_Url + "/get/" + id, CommonResult.class);
	}

	@GetMapping(value = "/getlist")
	public CommonResult<List<Payment>> getList() {
		return restTemplate.getForObject(Payment_Url + "/getlist", CommonResult.class);
	}

}
