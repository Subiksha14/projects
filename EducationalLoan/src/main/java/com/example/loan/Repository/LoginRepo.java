package com.example.loan.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.loan.Model.LoginModel;

@Repository

public interface LoginRepo extends JpaRepository<LoginModel, String>
{

}
