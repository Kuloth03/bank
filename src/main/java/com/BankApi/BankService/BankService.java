package com.BankApi.BankService;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BankApi.BankDao.BankDao;
import com.BankApi.BankEntity.BankEntity;

@Service
public class BankService {

	@Autowired
	BankDao bd;

	public String Post(BankEntity a) {
		
		return bd.Post(a);
	}

	public String  GetAll(String a) {
		
		return bd.GetAll(a);
	}
}
