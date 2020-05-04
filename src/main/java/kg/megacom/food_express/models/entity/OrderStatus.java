package kg.megacom.food_express.models.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Data
@Entity
@Table(name = "order_statuses")
public class OrderStatus {

    @Id
    @GeneratedValue
    @Column(name = "order_statuses_id")
    private Long id;

    private Date startDate;
    private Date endDate;

    @OneToMany
    @JoinColumn(name = "user_id")
    private List<User> userList;

    @ManyToOne
    @JoinColumn(name = "status_id")
    private Status status;

    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order order;

}
