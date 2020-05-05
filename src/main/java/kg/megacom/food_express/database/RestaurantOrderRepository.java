package kg.megacom.food_express.database;

import kg.megacom.food_express.models.entity.RestaurantOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RestaurantOrderRepository extends JpaRepository<RestaurantOrder, Long> {
}
