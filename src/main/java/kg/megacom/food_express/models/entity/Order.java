package kg.megacom.food_express.models.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.List;
import java.util.Set;

@Data
@Entity
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue
    @Column(name = "order_id")
    private Long id;

    private Date createDate;
    private double cost;

    @OneToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

    @OneToMany(mappedBy = "orders")
    List<RestaurantOrder> restaurantOrderList;

    @OneToMany(mappedBy = "orders")
    List<OrderDetail> orderDetailList;

    @OneToMany(mappedBy = "orders")
    List<OrderStatus> orderStatusList;
}
