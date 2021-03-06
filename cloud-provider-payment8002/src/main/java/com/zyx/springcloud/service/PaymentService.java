package com.zyx.springcloud.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.zyx.springcloud.entities.Payment;

@Component
public class PaymentService implements IPaymentService {
	private static int count = 0;
	private static List<Payment> datas = new ArrayList<Payment>();

	@Value("${server.port}")
	private String port;

	public Payment create() {
		count++;
		Payment pay = new Payment();
		pay.setId(count);
		pay.setSerial(port);
		datas.add(pay);
		return pay;
	}

	public Payment get(Long id) {
		for (Payment payment : datas) {
			if (payment.getId() == id)
				return payment;
		}
		return null;
	}

	public List<Payment> getList() {
		return datas;
	}
}
