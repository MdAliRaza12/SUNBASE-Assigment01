package com.sunabse.CustomerApplication.repo;

import com.sunabse.CustomerApplication.model.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICustomerRepo extends JpaRepository<Customer,Long> {
}
