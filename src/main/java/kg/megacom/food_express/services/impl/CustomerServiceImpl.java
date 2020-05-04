package kg.megacom.food_express.services.impl;

import kg.megacom.food_express.mappers.AccountMapper;
import kg.megacom.food_express.mappers.CustomerMapper;
import kg.megacom.food_express.models.dto.CustomerDto;
import kg.megacom.food_express.models.entity.Account;
import kg.megacom.food_express.models.entity.Customer;
import kg.megacom.food_express.services.CustomerService;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Override
    public CustomerDto saveCustomer(CustomerDto customerDto) {

        Customer customer = CustomerMapper.INSTANCE.customerDtoToCustomer(customerDto);

        customerDto = CustomerMapper.INSTANCE.customerToCustomerDto(customer);

        return customerDto;
    }
}
