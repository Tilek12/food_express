package kg.megacom.food_express.models.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "phones")
public class Phone {

    @Id
    @GeneratedValue
    @Column(name = "phone_id")
    private Long id;

    private String phone;
    private boolean isActive;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

}
