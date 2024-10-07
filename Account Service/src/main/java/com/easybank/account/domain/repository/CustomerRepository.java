package com.easybank.account.domain.repository;

/**
 * Author :  Ahmmed Jubayer Rumman
 * Created at : 07 Oct 2024
 */

import com.easybank.account.domain.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

    Optional<Customer> findByMobileNumber(String mobileNumber);


}
