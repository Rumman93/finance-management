package com.easybank.account.common.mapper;

import com.easybank.account.domain.dto.CustomerDto;
import com.easybank.account.domain.entity.Customer;

/**
 * Author :  Ahmmed Jubayer Rumman
 * Created at : 07 Oct 2024
 */
public class CustomerMapper {

    public static CustomerDto mapToCustomerDto(Customer customer, CustomerDto customerDto) {
        customerDto.setName(customer.getName());
        customerDto.setEmail(customer.getEmail());
        customerDto.setMobileNumber(customer.getMobileNumber());
        return customerDto;
    }

    public static Customer mapToCustomer(CustomerDto customerDto, Customer customer) {
        customer.setName(customerDto.getName());
        customer.setEmail(customerDto.getEmail());
        customer.setMobileNumber(customerDto.getMobileNumber());
        return customer;
    }

}
