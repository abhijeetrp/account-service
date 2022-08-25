package com.maveric.accountservice.Controller;


import com.maveric.accountservice.Model.Customer;
import com.maveric.accountservice.Repository.customerrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/customer")
public class customerController
{

@Autowired
    private customerrepository repository;
@PostMapping
public ResponseEntity<?> addCustomer(@RequestBody Customer cstmr)
{
    Customer save = this.repository.save(cstmr);
    return ResponseEntity.ok(save);
}

    @GetMapping
    public ResponseEntity<?> getCustomer()
    {
        return ResponseEntity.ok(this.repository.findAll());
    }



}

