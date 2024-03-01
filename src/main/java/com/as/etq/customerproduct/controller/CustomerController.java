package com.as.etq.customerproduct.controller;

import com.as.etq.customerproduct.dto.CustomerDTO;
import com.as.etq.customerproduct.entity.Customer;
import com.as.etq.customerproduct.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping(path = "/getAllCust")
    public ResponseEntity<List<Customer>> getAllCustomer() {
        return new ResponseEntity<>(customerService.getAllCustomer(), HttpStatus.OK);
    }

    @GetMapping(path = "/getCustById")
    public ResponseEntity<Optional<Customer>> getCustomerById(@RequestParam Integer custId) {
        return new ResponseEntity<>(customerService.getCustomerById(custId), HttpStatus.OK);
    }

    @PostMapping(path = "/addCust")
    public ResponseEntity<Customer> addCustomer(@RequestBody CustomerDTO customerDTO) {
        return new ResponseEntity<>(customerService.addCustomer(customerDTO), HttpStatus.OK);
    }

    @DeleteMapping(path = "/deleteCust")
    public ResponseEntity<Boolean> deleteCustomer(@RequestParam Integer customerId) {
        return new ResponseEntity<>(customerService.deleteCustomer(customerId), HttpStatus.OK);
    }

    @PutMapping(path = "/updateCust")
    public ResponseEntity<Customer> updateCustomer(@RequestBody CustomerDTO customerDTO) {
        return new ResponseEntity<>(customerService.updateCustomer(customerDTO), HttpStatus.OK);
    }

}
