package com.maveric.accountservice.Repository;

import com.maveric.accountservice.Model.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface customerrepository extends MongoRepository<Customer, Integer>
{
  //  static void ok(Customer cd) {
    //}
}
