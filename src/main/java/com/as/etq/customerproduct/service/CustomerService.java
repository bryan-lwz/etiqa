package com.as.etq.customerproduct.service;

import com.as.etq.customerproduct.dto.CustomerDTO;
import com.as.etq.customerproduct.entity.Customer;

import java.util.List;
import java.util.Optional;

public interface CustomerService {
    List<Customer> getAllCustomer();
    Optional<Customer> getCustomerById(Integer id);
    Customer addCustomer(CustomerDTO customerDTO);
    Boolean deleteCustomer(Integer customerId);
    Customer updateCustomer(CustomerDTO customerDTO);
}
