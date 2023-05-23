package mvcProject.repository;

import mvcProject.entity.Agency;
import mvcProject.entity.Customer;

import java.util.List;

public interface CustomerRepository {

    void saveCustomer(Customer customer);

    Customer getCustomerById(Long id);

    List<Customer> getAllCustomers();

   String updateCustomer(Long id, Customer customer);
   void deleteCustomer(Long id);

}
