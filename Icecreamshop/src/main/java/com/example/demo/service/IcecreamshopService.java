package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import com.example.demo.model.IcecreamshopModel;

import com.example.demo.repository.IcecreamshopRepository;

import jakarta.transaction.Transactional;

@Service
public class IcecreamshopService {
 @Autowired
 IcecreamshopRepository rep;
 public List<IcecreamshopModel> getAllIcecreamshops()
 {
List<IcecreamshopModel>iceList=rep.findAll();
return iceList;
 }
 public IcecreamshopModel saveIcecreamshop(IcecreamshopModel s)
 {
	 IcecreamshopModel obj=rep.save(s);
return obj;
 }
 
 public List<IcecreamshopModel> sortIcecreamshops(String name)
 {
  return rep.findAll(Sort.by(name));
 }
 public List<IcecreamshopModel> pagingIcecreamshops(int offset,int pageSize)
 {
  Pageable paging=PageRequest.of(offset,pageSize);
  Page<IcecreamshopModel> iceData=rep.findAll(paging);
  List<IcecreamshopModel>iceList=iceData.getContent();
  return iceList;
 }
 public List<IcecreamshopModel> PagingAndSorting(int offset,int pageSize,String field)
 {
Pageable paging =PageRequest.of(offset, pageSize).withSort(Sort.by(field));
Page<IcecreamshopModel> ice=rep.findAll(paging);
return ice.getContent();
 }
 @Transactional
 public int deleteIcecreamshopByDailysale(String dailysale)
 {
  return rep.deleteByDailysale(dailysale);
 }
 public List<IcecreamshopModel> fetchAll()
 {
return rep.findAll();
 }
 public IcecreamshopModel saveAll(IcecreamshopModel s)
 {
return rep.save(s);
 }

}