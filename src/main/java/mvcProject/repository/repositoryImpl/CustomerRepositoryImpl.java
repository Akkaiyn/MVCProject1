package mvcProject.repository.repositoryImpl;

import mvcProject.entity.Customer;
import mvcProject.repository.CustomerRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository

public class CustomerRepositoryImpl implements CustomerRepository {

    @Override
    public void saveCustomer(Customer customer) {

    }

    @Override
    public Customer getCustomerById(Long id) {
        return null;
    }

    @Override
    public List<Customer> getAllCustomers() {
        return null;
    }

    @Override
    public String updateCustomer(Long id, Customer customer) {
        return null;
    }

    @Override
    public void deleteCustomer(Long id) {

    }
}
