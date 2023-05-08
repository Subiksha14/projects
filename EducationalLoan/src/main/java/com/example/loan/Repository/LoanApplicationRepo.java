package com.example.loan.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.loan.Model.LoanApplicationModel;

@Repository
public interface LoanApplicationRepo extends JpaRepository<LoanApplicationModel,Integer>{

}