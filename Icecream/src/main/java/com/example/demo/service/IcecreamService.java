package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Icecream;
import com.example.demo.repository.IcecreamRepository;


@Service
public class IcecreamService {

	@Autowired
	IcecreamRepository iceRepository;
	public List<Icecream> getAllIcecreams()
	{
		List<Icecream> iceList=iceRepository.findAll();
		return iceList;
	}
	public Icecream saveIcecream(Icecream s)
	{
		Icecream obj=iceRepository.save(s);
		return obj;
		//return iceRepository.save(s);
	}
	public Icecream updateIcecream(Icecream s)
	{
		  Icecream obj=iceRepository.save(s);
		return obj;
		//return iceRepository.save(s);
	}
	public void deleteSIcecream(int id)
	{
		iceRepository.deleteById(id);
	}
	public Icecream getIcecream(int id)
	{
		Icecream s=iceRepository.findById(id).get();
		return s;
	}
}
