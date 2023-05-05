package com.example.demo.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.model.IcecreamshopModel;



@Repository
public interface IcecreamshopRepository extends JpaRepository<IcecreamshopModel,Integer> 
{
	@Modifying

	@Query("delete from IcecreamshopModel i where i.dailysale=?1")

	public int deleteByDailysale(String dailysale);

}
