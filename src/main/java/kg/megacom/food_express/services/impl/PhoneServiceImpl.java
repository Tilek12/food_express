package kg.megacom.food_express.services.impl;

import kg.megacom.food_express.mappers.PhoneMapper;
import kg.megacom.food_express.models.dto.PhoneDto;
import kg.megacom.food_express.models.entity.Phone;
import kg.megacom.food_express.services.PhoneService;
import org.springframework.stereotype.Service;

@Service
public class PhoneServiceImpl implements PhoneService {
    @Override
    public PhoneDto savePhone(PhoneDto phoneDto) {

        Phone phone = PhoneMapper.INSTANCE.phoneDtoToPhone(phoneDto);

        phoneDto = PhoneMapper.INSTANCE.phoneToPhoneDto(phone);

        return phoneDto;
    }
}
