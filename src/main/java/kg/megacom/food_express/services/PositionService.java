package kg.megacom.food_express.services;

import kg.megacom.food_express.models.dto.PositionDto;

import java.util.List;

public interface PositionService {

    PositionDto savePosition(PositionDto positionDto);

    List<PositionDto> findAllPosition();
}
