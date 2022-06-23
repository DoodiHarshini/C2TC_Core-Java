package com.java.developer;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class PriceController {
@Autowired
private PriceService service;


@GetMapping("/price/{rateusd}")
public ResponseEntity<Crypto>get(@PathVariable Integer rateusd)
{
	try {
		Crypto crypto =service.get(rateusd);
		return new  ResponseEntity<Crypto>(crypto,HttpStatus.OK);
	} 
	catch (Exception e) 
	{
		return new  ResponseEntity<Crypto>(HttpStatus.NOT_FOUND);
	}
}
}
