package com.zyx.springcloud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zyx.springcloud.entities.CommonResult;
import com.zyx.springcloud.entities.Payment;
import com.zyx.springcloud.service.IPaymentService;

import lombok.extern.slf4j.Slf4j;

@RestController()
@Slf4j
@RequestMapping("/payment")
public class PaymentController {
	@Autowired
	private IPaymentService service;

	@PostMapping(value = "/create")
	public CommonResult<Payment> create() {
		Payment pay = service.create();
		log.info("insert success");
		return new CommonResult<Payment>(200, "success", pay);
	}

	@GetMapping(value = "/get/{id}")
	public CommonResult<Payment> get(@PathVariable("id") Long id) {
		Payment pay = service.get(id);
		if (pay != null)
			return new CommonResult<Payment>(200, "success", pay);
		else
			return new CommonResult<Payment>(400, "fail", null);
	}

	@GetMapping(value = "/getlist")
	public CommonResult<List<Payment>> getList() {
		return new CommonResult<List<Payment>>(200, "success", service.getList());
	}

}
