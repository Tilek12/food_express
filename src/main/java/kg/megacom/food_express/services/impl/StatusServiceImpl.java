package kg.megacom.food_express.services.impl;

import kg.megacom.food_express.mappers.StatusMapper;
import kg.megacom.food_express.models.dto.StatusDto;
import kg.megacom.food_express.models.entity.Status;
import kg.megacom.food_express.services.StatusService;
import org.springframework.stereotype.Service;

@Service
public class StatusServiceImpl implements StatusService {
    @Override
    public StatusDto saveStatus(StatusDto statusDto) {

        Status status = StatusMapper.INSTANCE.statusDtoToStatus(statusDto);

        statusDto = StatusMapper.INSTANCE.statusToStatusDto(status);

        return statusDto;
    }
}
