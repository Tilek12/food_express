package kg.megacom.food_express.services;

import kg.megacom.food_express.models.dto.PriceDto;
import kg.megacom.food_express.models.dto.StatusDto;

import java.util.List;

public interface StatusService {

    StatusDto saveStatus(StatusDto statusDto);

    List<StatusDto> findAllStatus();
}
