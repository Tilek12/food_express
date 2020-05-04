package kg.megacom.food_express.mappers;

import kg.megacom.food_express.models.dto.StatusDto;
import kg.megacom.food_express.models.entity.Status;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface StatusMapper {

    StatusMapper INSTANCE = Mappers.getMapper(StatusMapper.class);

    Status statusDtoToStatus(StatusDto statusDto);

    StatusDto statusToStatusDto(Status status);
}
