package kg.megacom.food_express.mappers;

import kg.megacom.food_express.models.dto.PhoneDto;
import kg.megacom.food_express.models.entity.Phone;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface PhoneMapper {

    PhoneMapper INSTANCE = Mappers.getMapper(PhoneMapper.class);

    Phone phoneDtoToPhone(PhoneDto phoneDto);

    PhoneDto phoneToPhoneDto(Phone phone);
}
