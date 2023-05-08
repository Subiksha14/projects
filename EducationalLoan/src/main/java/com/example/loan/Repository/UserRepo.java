package com.example.loan.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.loan.Model.UserModel;

@Repository

public interface UserRepo extends JpaRepository<UserModel, Integer>
{

}
