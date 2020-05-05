package kg.megacom.food_express.models.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "restaurants")
public class Restaurant {

    @Id
    @GeneratedValue
    @Column(name = "restaurant_id")
    private Long id;

    private String name;
    private boolean isActive;

    @OneToMany (mappedBy = "restaurant")
    List<RestaurantOrder> restaurantOrderList;
}
