package kg.megacom.food_express.services;

import kg.megacom.food_express.models.dto.CustomerDto;

import java.util.List;

public interface CustomerService {

    CustomerDto saveCustomer(CustomerDto customerDto);

    List<CustomerDto> findAllCustomers();

}
