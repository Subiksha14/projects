package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.model.IcecreamshopModel;
import com.example.demo.service.IcecreamshopService;

@RestController
public class IcecreamshopController {
   @Autowired
   IcecreamshopService ice;
   @GetMapping(value="fetchIcecreamshops")
   public List<IcecreamshopModel> getAllIcecreamshops()
   {
  List<IcecreamshopModel>iceList=ice.getAllIcecreamshops();
  return iceList;
   }
   @PostMapping(value="/saveIcecreamshop")
   public IcecreamshopModel saveIcecreamshop(@RequestBody IcecreamshopModel s)
   {
  return ice.saveIcecreamshop(s);
   }
  
   @GetMapping("/sortIcecreamshops/{name}")
   public List<IcecreamshopModel>sortIcecreamshops(@PathVariable String name)
   {
  return ice.sortIcecreamshops(name);
   }
   ///pagination
   // http://localhost:8080/pageIcecreamshops/0/1
   @GetMapping("/pagingI cecreamshops/{offset}/{pageSize}")
   public List<IcecreamshopModel> pagingIcecreamshops(@PathVariable int offset,@PathVariable int pageSize)
   {
  return ice.pagingIcecreamshops(offset,pageSize);
   }
   @GetMapping(value="/pagingAndSorting/{offset}/{pageSize}/{field}")
   public List<IcecreamshopModel> PagingAndSorting(@PathVariable int offset,@PathVariable int pageSize,@PathVariable String field)
   {
  return ice.PagingAndSorting(offset, pageSize, field);
   }
   @DeleteMapping("/deleteIcecreamshopBySale/{dailysale}")
   public String deleteIcecreamshopByDailysale(@PathVariable String dailysale)
   {
   int result=ice.deleteIcecreamshopByDailysale(dailysale) ;
   if(result >0)
    return "Icecreamshop record deleted";
   else
    return "Problem occured while deleting";
   }
   @GetMapping("/fetchAll")
   public List<IcecreamshopModel> fetchAll()
   {
 return  ice.fetchAll();
   }  
   @PostMapping("/saveAll")
   public IcecreamshopModel saveAll(@RequestBody IcecreamshopModel s)
   {
  return ice.saveAll(s);
   }
  
   
}
