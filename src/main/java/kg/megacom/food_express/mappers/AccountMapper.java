package kg.megacom.food_express.mappers;

import kg.megacom.food_express.models.dto.AccountDto;
import kg.megacom.food_express.models.entity.Account;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface AccountMapper {

    AccountMapper INSTANCE = Mappers.getMapper(AccountMapper.class);

    Account accountDtoToAccount (AccountDto accountDto);

    AccountDto accountToAccountDto (Account account);
}
