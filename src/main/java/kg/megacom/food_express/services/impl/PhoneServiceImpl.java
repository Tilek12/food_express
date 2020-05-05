package kg.megacom.food_express.services.impl;

import kg.megacom.food_express.database.PhoneRepository;
import kg.megacom.food_express.mappers.PhoneMapper;
import kg.megacom.food_express.models.dto.PhoneDto;
import kg.megacom.food_express.models.entity.Phone;
import kg.megacom.food_express.services.PhoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PhoneServiceImpl implements PhoneService {

    @Autowired
    PhoneRepository phoneRepository;

    @Override
    public PhoneDto savePhone(PhoneDto phoneDto) {

        Phone phone = PhoneMapper.INSTANCE.phoneDtoToPhone(phoneDto);
        phone = phoneRepository.save(phone);
        phoneDto = PhoneMapper.INSTANCE.phoneToPhoneDto(phone);

        return phoneDto;
    }

    @Override
    public List<PhoneDto> findAllPhone() {

        return phoneRepository.findAll()
                .stream()
                .map(PhoneMapper.INSTANCE::phoneToPhoneDto)
                .collect(Collectors.toList());
    }
}
