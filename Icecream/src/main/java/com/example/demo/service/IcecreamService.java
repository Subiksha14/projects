package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
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
	public List<Icecream> sortIcecreams(String field)
	{
		return iceRepository.findAll(Sort.by(field));
	}
	public List<Icecream> pagingIcecreams(int offset,int pageSize)
	 {
		 Pageable paging=PageRequest.of(offset,pageSize);
		 Page<Icecream> iceData=iceRepository.findAll(paging);
		 List<Icecream>iceList=iceData.getContent();
		 return iceList;
	 }

	 public List<Icecream> pagingAndSortingCreams(int offset,int pageSize,String field)
	 {
		 Pageable paging = PageRequest.of(offset,pageSize).withSort(Sort.by(field));
		 Page<Icecream> ice=iceRepository.findAll(paging);
		 return ice.getContent();
	 }
}