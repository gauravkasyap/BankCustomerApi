package org.bank_customer_api.controller;

import org.bank_customer_api.model.Customer;
import org.bank_customer_api.service.CustomerService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class customerController {
  private final CustomerService customerService;

    public customerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("/public/customer")
    public ResponseEntity<List<Customer>> getAllCustomerDetails(){
    return ResponseEntity.ok(customerService.getAllCustomerDetails());
    }

    @GetMapping("/public/customer/{customerId}")
    public ResponseEntity<Customer> getCustomerDetailsById(@PathVariable Long customerId){
        return customerService.getCustomerById(customerId)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping("/public/customer")
    public ResponseEntity<Customer> createCustomer(@RequestBody Customer customer){
        return ResponseEntity.ok(customerService.creatCustomer(customer));
    }

   @DeleteMapping("/public/customer/{customerId}")
   public ResponseEntity<String> deleteCustomer(@PathVariable Long customerId) {
        try{
            customerService.deleteCustomer(customerId);
            return ResponseEntity.ok("Customer deleted Successfully");
        }catch (RuntimeException e){
            return ResponseEntity.notFound().build();
        }
    }

    @PutMapping("/public/customer/{customerId}")
    public ResponseEntity<Customer> update(@RequestBody Customer customer,@PathVariable Long customerId){
        try {
            return ResponseEntity.ok(customerService.updateCustomer(customer,customerId));
        } catch (RuntimeException e) {
            return ResponseEntity.notFound().build();
        }
    }
}
