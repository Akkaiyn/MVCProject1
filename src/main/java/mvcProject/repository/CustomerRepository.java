package mvcProject.repository;

import mvcProject.entity.Customer;

public interface CustomerRepository {

    void saveCustomer(Customer customer);

    Customer getCustomerById(Long id);


}
