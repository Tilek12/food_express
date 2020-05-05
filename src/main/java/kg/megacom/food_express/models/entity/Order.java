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

    @Column(name = "create_date")
    private Date createDate;

    private double cost;

    @OneToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

    @OneToMany (mappedBy = "order")
    List<RestaurantOrder> restaurantOrderList;

    @OneToMany (mappedBy = "order")
    List<OrderDetail> orderDetailList;

    @OneToMany (mappedBy = "order")
    List<OrderStatus> orderStatusList;
}
