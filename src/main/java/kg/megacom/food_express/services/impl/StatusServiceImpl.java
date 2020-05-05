package kg.megacom.food_express.services.impl;

import kg.megacom.food_express.database.StatusRepository;
import kg.megacom.food_express.mappers.StatusMapper;
import kg.megacom.food_express.models.dto.StatusDto;
import kg.megacom.food_express.models.entity.Status;
import kg.megacom.food_express.services.StatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class StatusServiceImpl implements StatusService {

    @Autowired
    StatusRepository statusRepository;

    @Override
    public StatusDto saveStatus(StatusDto statusDto) {

        Status status = StatusMapper.INSTANCE.statusDtoToStatus(statusDto);
        status = statusRepository.save(status);
        statusDto = StatusMapper.INSTANCE.statusToStatusDto(status);

        return statusDto;
    }

    @Override
    public List<StatusDto> findAllStatus() {

        return statusRepository.findAll()
                .stream()
                .map(StatusMapper.INSTANCE::statusToStatusDto)
                .collect(Collectors.toList());
    }
}
