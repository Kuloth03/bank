package com.BankApi.BankDao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.BankApi.BankRepository;
import com.BankApi.BankEntity.BankEntity;

@Repository
public class BankDao {
@Autowired
BankRepository br;

public String Post(BankEntity a) {

	 br.save(a);
	 return "Success";
}

public String GetAll(String a) {
	
	return br.GetAll(a);
}

//    http://localhost:8080/bank/Get



}
