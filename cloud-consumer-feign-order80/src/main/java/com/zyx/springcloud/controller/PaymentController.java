package com.zyx.springcloud.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zyx.springcloud.entities.CommonResult;
import com.zyx.springcloud.entities.Payment;
import com.zyx.springcloud.service.PaymentFeignService;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
@RequestMapping("/openfeign")
public class PaymentController {

	@Resource
	private PaymentFeignService service;

//	@PostMapping(value = "/create")
	@GetMapping(value = "/create")
	public CommonResult<Payment> create() {
		return service.create();
	}

	@GetMapping(value = "/get/{id}")
	public CommonResult<Payment> get(@PathVariable("id") Long id) {
		return service.get(id);
	}

	@GetMapping(value = "/getlist")
	public CommonResult<List<Payment>> getList() {
		return service.getList();
	}
}
