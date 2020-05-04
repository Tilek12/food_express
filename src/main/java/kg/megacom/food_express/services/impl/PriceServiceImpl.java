package kg.megacom.food_express.services.impl;

import kg.megacom.food_express.mappers.PriceMapper;
import kg.megacom.food_express.models.dto.PriceDto;
import kg.megacom.food_express.models.entity.Price;
import kg.megacom.food_express.services.PriceService;
import org.springframework.stereotype.Service;

@Service
public class PriceServiceImpl implements PriceService {
    @Override
    public PriceDto savePrice(PriceDto priceDto) {

        Price price = PriceMapper.INSATANCE.priceDtoToPrice(priceDto);

        priceDto = PriceMapper.INSATANCE.priceToPriceDto(price);

        return priceDto;
    }
}
