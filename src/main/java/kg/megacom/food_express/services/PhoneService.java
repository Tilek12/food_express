package kg.megacom.food_express.services;

import kg.megacom.food_express.models.dto.PhoneDto;

import java.util.List;

public interface PhoneService {

    PhoneDto savePhone(PhoneDto phoneDto);

    List<PhoneDto> findAllPhone();
}
