package com.BankApi.BankController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.BankApi.BankEntity.BankEntity;
import com.BankApi.BankService.BankService;

@RestController
@RequestMapping(value="/bank")
public class BankController {

	@Autowired
	BankService bs;
	
	@PostMapping(value="/post")
	public String Post( @RequestBody BankEntity a)
	{
		return bs.Post(a);
	}
	
	@GetMapping(value="/Get/{a}")
	public String GetAll(@PathVariable  String a)
	{
		return bs.GetAll(a);
	}
}
