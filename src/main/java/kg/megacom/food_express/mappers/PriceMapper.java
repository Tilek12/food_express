package kg.megacom.food_express.mappers;

import kg.megacom.food_express.models.dto.PriceDto;
import kg.megacom.food_express.models.entity.Price;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface PriceMapper {

    PriceMapper INSATANCE = Mappers.getMapper(PriceMapper.class);

    Price priceDtoToPrice(PriceDto priceDto);

    PriceDto priceToPriceDto(Price price);
}
