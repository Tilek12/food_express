package kg.megacom.food_express.models.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "accounts")
public class Account {

    @Id
    @GeneratedValue
    @Column(name = "account_id")
    private Long id;

    private String login;
    private String password;

    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;

}
