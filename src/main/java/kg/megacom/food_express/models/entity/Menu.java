package kg.megacom.food_express.models.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "menu")
public class Menu {

    @Id
    @GeneratedValue
    @Column(name = "menu_id")
    private Long id;

    private String name;

    @OneToOne
    @JoinColumn(name = "restaurant_id")
    private Restaurant restaurant;

}
