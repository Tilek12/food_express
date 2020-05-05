package kg.megacom.food_express.services.impl;

import kg.megacom.food_express.database.PositionRepository;
import kg.megacom.food_express.mappers.PositionMapper;
import kg.megacom.food_express.models.dto.PositionDto;
import kg.megacom.food_express.models.entity.Position;
import kg.megacom.food_express.services.PositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PositionServiceImpl implements PositionService {

    @Autowired
    PositionRepository positionRepository;

    @Override
    public PositionDto savePosition(PositionDto positionDto) {

        Position position = PositionMapper.INSTANCE.positionDtoToPosition(positionDto);
        position = positionRepository.save(position);
        positionDto = PositionMapper.INSTANCE.positionToPositionDto(position);

        return positionDto;
    }

    @Override
    public List<PositionDto> findAllPosition() {

        return positionRepository.findAll()
                .stream()
                .map(PositionMapper.INSTANCE::positionToPositionDto)
                .collect(Collectors.toList());
    }
}
