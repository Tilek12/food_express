package kg.megacom.food_express.models.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "prices")
public class Price {

    @Id
    @GeneratedValue
    @Column(name = "price_id")
    private Long id;

    private double price;
    private Date startDate;
    private Date endDate;

    @ManyToOne
    @JoinColumn(name = "dish_id")
    private Dish dish;
}
