package kg.megacom.food_express.services.impl;

import kg.megacom.food_express.mappers.PositionMapper;
import kg.megacom.food_express.models.dto.PositionDto;
import kg.megacom.food_express.models.entity.Position;
import kg.megacom.food_express.services.PositionService;
import org.springframework.stereotype.Service;

@Service
public class PositionServiceImpl implements PositionService {
    @Override
    public PositionDto savePosition(PositionDto positionDto) {

        Position position = PositionMapper.INSTANCE.positionDtoToPosition(positionDto);

        positionDto = PositionMapper.INSTANCE.positionToPositionDto(position);

        return positionDto;
    }
}
