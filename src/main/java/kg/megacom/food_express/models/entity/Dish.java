package kg.megacom.food_express.models.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "dishes")
public class Dish {

    @Id
    @GeneratedValue
    @Column(name = "dish_id")
    private Long id;

    private String name;
    private double size;
    private boolean isActive;

    @ManyToOne
    @JoinColumn(name = "menu_id")
    private Menu menu;

    @OneToMany //(mappedBy = "dishes")
    List<OrderDetail> orderDetailList;

}
