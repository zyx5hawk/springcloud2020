package com.zyx.springcloud.service;

import java.util.List;

import com.zyx.springcloud.entities.Payment;

public interface IPaymentService {
	Payment create();

	Payment get(Long id);

	List<Payment> getList();
}
