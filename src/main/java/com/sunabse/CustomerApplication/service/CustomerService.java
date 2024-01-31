package com.sunabse.CustomerApplication.service;

import com.sunabse.CustomerApplication.model.Customer;
import com.sunabse.CustomerApplication.repo.ICustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.awt.*;
import java.util.List;

@Service
public class CustomerService {
    @Autowired
    private ICustomerRepo customerRepo;
    public String createCustomer(Customer customer) {
        customerRepo.save(customer);
        return "Customer added !!";
    }

    public Customer getCustomerById(Long id) {
       return customerRepo.findById(id).orElseThrow();
    }

    public String deleteCustomer(Long id) {
        Customer existingCustomer = customerRepo.findById(id).orElseThrow(()-> new RuntimeException("Customer Not found"));
        customerRepo.deleteById(id);
        return "Customer deleted !!";

    }
    public String updateCustomer(Long id, String address) {
        Customer customer=customerRepo.findById(id).orElseThrow(()->new RuntimeException("id not found"));
        customer.setAddress(address);
        return "customer updated";
    }

    public List<Customer> getCustomers(int pageNumber,int pageSize) {

        Pageable pageable= PageRequest.of(pageNumber,pageSize);
        Page<Customer> customerPage=customerRepo.findAll(pageable);
        List<Customer> content=customerPage.getContent();
        return content;
    }
}
