package com.java.developer;

import java.util.ArrayList;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class PriceService  {
@Autowired
private PriceRepository repo;
public List<Crypto> listAll(){
	ArrayList <Integer> prices =new ArrayList <Integer>();
	prices.add( (int)123.312);
	prices.add((int)0281.123);
	prices.add((int)82.88);
	prices.add((int)82.91);
	prices.add((int)17.830);
	prices.add((int)77.95);
	prices.add((int)41.26);
	prices.add((int)26.82);
	prices.add((int)33.35);

	return repo.findAll();
}

}
