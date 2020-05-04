package kg.megacom.food_express.mappers;

import kg.megacom.food_express.models.dto.PositionDto;
import kg.megacom.food_express.models.entity.Position;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface PositionMapper {

    PositionMapper INSTANCE = Mappers.getMapper(PositionMapper.class);

    Position positionDtoToPosition(PositionDto positionDto);

    PositionDto positionToPositionDto(Position position);
}
