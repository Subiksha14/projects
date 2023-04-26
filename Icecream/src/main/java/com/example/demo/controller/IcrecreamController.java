package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Icecream;
import com.example.demo.service.IcecreamService;

@RestController
public class IcrecreamController {
	
	@Autowired
	IcecreamService ice; 
	
	@PostMapping(value="/saveIcecream")
	public 	Icecream saveIcecream(@RequestBody Icecream i )
	{
		return ice.saveIcecream(i);
	}
	
	@PutMapping(value="/updateIcecream")
	public Icecream updateIcecream(@RequestBody Icecream i)
	{
		return ice.updateIcecream(i);
	}
	
	@DeleteMapping(value="/deleteIcecream/{id}")
	public String deleteIcecream(@PathVariable("id") int id)
	{
		ice.deleteSIcecream(id);
		return "deleted";
	}
	
	@GetMapping(value="/getIcecream/{id}")
	public Icecream getIcecream(@PathVariable("id")int id)
	{
		return ice.getIcecream(id);
	}

}
