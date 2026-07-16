package org.bank_customer_api.service;

import org.bank_customer_api.model.Customer;
import org.bank_customer_api.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {
    private final CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }


    public Customer creatCustomer(Customer customer) {
       return customerRepository.save(customer);
    }


    public List<Customer> getAllCustomerDetails() {
        return customerRepository.findAll();
    }

    public Optional<Customer> getCustomerById(Long id){
        return customerRepository.findById(id);
    }


    public void deleteCustomer(Long customerId) {
       if (!customerRepository.existsById(customerId)){
           throw new RuntimeException("Customer not found with id "+customerId);
       }
       customerRepository.deleteById(customerId);
    }


    public Customer updateCustomer(Customer updatedCustomer, Long customerId) {
       return customerRepository.findById(customerId).map(existing ->{
           existing.setFirstName(updatedCustomer.getFirstName());
           existing.setLastName(updatedCustomer.getLastName());
           existing.setEmail(updatedCustomer.getEmail());
           existing.setPhoneNumber(updatedCustomer.getPhoneNumber());
           return customerRepository.save(existing);
       }).orElseThrow(()->new RuntimeException("Customer not found with id "+ customerId));
    }
}
