package com.java.developer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PriceController {
@Autowired
private PriceService service;
@GetMapping(value="/price")
public List<Crypto>list()
{
return service. listAll();
}
}
