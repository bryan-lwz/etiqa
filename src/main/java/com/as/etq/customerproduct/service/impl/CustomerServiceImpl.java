package com.as.etq.customerproduct.service.impl;

import com.as.etq.customerproduct.dto.CustomerDTO;
import com.as.etq.customerproduct.entity.Customer;
import com.as.etq.customerproduct.exception.DataNotFoundException;
import com.as.etq.customerproduct.repository.CustomerRepository;
import com.as.etq.customerproduct.service.CustomerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerServiceImpl implements CustomerService {

    private static final Logger logger = LoggerFactory.getLogger(CustomerServiceImpl.class);

    @Autowired
    private CustomerRepository customerRepository;

    public List<Customer> getAllCustomer() {
        return customerRepository.findAll();
    }

    public Optional<Customer> getCustomerById(Integer id) {
        return customerRepository.findById(id);
    }

    public Customer addCustomer(CustomerDTO customerDTO) {
        logger.info(customerDTO.toString());
        Customer customer = new Customer();
        customer.setFirstName(customerDTO.getFirstName());
        customer.setLastName(customerDTO.getLastName());
        customer.setOfficeEmail(customerDTO.getOfficeEmail());
        customer.setPersonalEmail(customerDTO.getPersonalEmail());
        customer.setMobilePhone(customerDTO.getMobilePhone());
        return customerRepository.saveAndFlush(customer);
    }

    public Boolean deleteCustomer(Integer customerId) {
        Customer customer = customerRepository.findById(customerId)
                .orElseThrow(() -> new DataNotFoundException("Customer data not found with id : " + customerId));
        customerRepository.deleteById(customerId);
        return true;
    }

    public Customer updateCustomer(CustomerDTO customerDTO) {
        Customer customer = new Customer();
        customer.setId(customerDTO.getId());
        customer.setFirstName(customerDTO.getFirstName());
        customer.setLastName(customerDTO.getLastName());
        customer.setOfficeEmail(customerDTO.getOfficeEmail());
        customer.setPersonalEmail(customer.getPersonalEmail());
        customer.setMobilePhone(customer.getMobilePhone());
        return customerRepository.saveAndFlush(customer);
    }
}
