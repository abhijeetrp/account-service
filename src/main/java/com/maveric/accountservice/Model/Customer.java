package com.maveric.accountservice.Model;


import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;




@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Document(collection="customer")
public class Customer
{

    private String type;
    @Id
    private String customerId;


}
