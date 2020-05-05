package kg.megacom.food_express.services;

import kg.megacom.food_express.models.dto.PriceDto;

import java.util.List;

public interface PriceService {

    PriceDto savePrice(PriceDto priceDto);

    List<PriceDto> findAllPrice();
}
