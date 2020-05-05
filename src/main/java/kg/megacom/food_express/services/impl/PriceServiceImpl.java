package kg.megacom.food_express.services.impl;

import kg.megacom.food_express.database.PriceRepository;
import kg.megacom.food_express.mappers.PriceMapper;
import kg.megacom.food_express.models.dto.PriceDto;
import kg.megacom.food_express.models.entity.Price;
import kg.megacom.food_express.services.PriceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PriceServiceImpl implements PriceService {

    @Autowired
    PriceRepository priceRepository;

    @Override
    public PriceDto savePrice(PriceDto priceDto) {

        Price price = PriceMapper.INSATANCE.priceDtoToPrice(priceDto);
        price = priceRepository.save(price);
        priceDto = PriceMapper.INSATANCE.priceToPriceDto(price);

        return priceDto;
    }

    @Override
    public List<PriceDto> findAllPrice() {

        return priceRepository.findAll()
                .stream()
                .map(PriceMapper.INSATANCE::priceToPriceDto)
                .collect(Collectors.toList());
    }
}
