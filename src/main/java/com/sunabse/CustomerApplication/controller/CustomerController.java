package com.sunabse.CustomerApplication.controller;

import com.sunabse.CustomerApplication.model.Customer;
import com.sunabse.CustomerApplication.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/admin")
public class CustomerController {

    @Autowired
    CustomerService customerService;

    // http://localhost:8081/admin/create-customer
    @PostMapping("/create-customer")
    public String createCustomer(@RequestBody Customer customer){
        return customerService.createCustomer(customer);
    }

    @GetMapping("/customer/{id}")
    public Customer getCustomerById(@PathVariable Long id){
        return customerService.getCustomerById(id);
    }

    @DeleteMapping("/customer/{id}")
    public String deleteCustomer(@PathVariable Long id) {

        // Delete the customer
       return customerService.deleteCustomer(id);
    }

    @GetMapping("/all-customers")
    public List<Customer> getCustomers(@RequestParam(value = "pageNumber",defaultValue = "0",required = false) int pageNumber,@RequestParam(value = "pageSize",defaultValue = "5",required = false) int pageSize) {
        return customerService.getCustomers(pageNumber, pageSize);
    }
    @PutMapping("/Customer/{id}/{address}")
    public String updateCustomer(@PathVariable Long id,@PathVariable String address){
        return customerService.updateCustomer(id,address);
    }

}
