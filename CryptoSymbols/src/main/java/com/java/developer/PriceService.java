package com.java.developer;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class PriceService  {
@Autowired
private PriceRepository repo;

public Crypto get(Integer rateusd) {
	
	return repo.findById(rateusd).get();
}

}
