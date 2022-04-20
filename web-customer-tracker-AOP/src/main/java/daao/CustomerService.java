package daao;

import springdemo.entity.Customer;

import java.util.List;

public interface CustomerService {
    public  List<Customer> getCustomers();

    void saveCustomer(Customer customer);

    Customer updateCustomer(int theId);

    void deleteCustomer(int id);
}
