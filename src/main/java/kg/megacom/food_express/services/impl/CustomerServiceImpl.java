package kg.megacom.food_express.services.impl;

import kg.megacom.food_express.database.CustomerRepository;
import kg.megacom.food_express.mappers.CustomerMapper;
import kg.megacom.food_express.models.dto.CustomerDto;
import kg.megacom.food_express.models.entity.Customer;
import kg.megacom.food_express.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    CustomerRepository customerRepository;

    @Override
    public CustomerDto saveCustomer(CustomerDto customerDto) {

        Customer customer = CustomerMapper.INSTANCE.customerDtoToCustomer(customerDto);
        customer = customerRepository.save(customer);
        customerDto = CustomerMapper.INSTANCE.customerToCustomerDto(customer);

        return customerDto;
    }

    @Override
    public List<CustomerDto> findAllCustomers() {
        return customerRepository.findAll()
                .stream()
                .map(CustomerMapper.INSTANCE::customerToCustomerDto)
                .collect(Collectors.toList());
    }
}
