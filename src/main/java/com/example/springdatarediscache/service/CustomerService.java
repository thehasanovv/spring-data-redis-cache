package com.example.springdatarediscache.service;

import com.example.springdatarediscache.dao.repository.CustomerRepository;
import com.example.springdatarediscache.modlel.request.CustomerRequestDto;
import com.example.springdatarediscache.modlel.response.CustomerResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CustomerService {
    private final CustomerRepository customerRepository;

    public CustomerResponseDto createCustomer(CustomerRequestDto customerDto) {
        return null;
    }

    public CustomerResponseDto updateCustomer(Long id, CustomerRequestDto customerDto) {
        return null;
    }

    public CustomerResponseDto getCustomerById(Long id) {
        return null;
    }

    public List<CustomerResponseDto> getAllCustomer() {
        return null;
    }

    public void deleteCustomer(Long id) {
    }
}
