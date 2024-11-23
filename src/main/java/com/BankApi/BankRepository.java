package com.BankApi;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.BankApi.BankEntity.BankEntity;

public interface BankRepository extends JpaRepository<BankEntity,Integer> {

	
	
	@Query(value="select bankname from bankapi where ifsccode like ?",nativeQuery=true)
	
	public String  GetAll(String a);
}


