package com.gftstart.bookkeeperservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gftstart.bookkeeperservice.model.Pay;
import com.gftstart.bookkeeperservice.repository.PayRepository;

@Service
public class PayService {

	@Autowired
	private PayRepository payRepository;

	public Pay savePay(Pay pay) {
		return payRepository.save(pay);
	}

	public Pay findByuuidPay(Pay pay) {
		return payRepository.findByuuidPay(pay);
	}
	
	
}
