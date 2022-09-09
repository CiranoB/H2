package com.gftstart.bookkeeperservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gftstart.bookkeeperservice.VO.ResponseTemplateVO;
import com.gftstart.bookkeeperservice.model.Pay;
import com.gftstart.bookkeeperservice.service.PayService;

@RestController
@CrossOrigin("*")
@RequestMapping("/pay")
public class PayController {
	
	@Autowired
	private PayService payService;
	
	@PostMapping("/")
	public Pay savePay(@RequestBody Pay pay) {
		return payService.savePay(pay);
	}
	
	@GetMapping("/{uuid}")
	public Pay findByuuidPay(@PathVariable("uuid") Pay pay) {
		return payService.findByuuidPay(pay);
	}

	
}
