package kg.megacom.food_express.models.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "statuses")
public class Status {

    @Id
    @GeneratedValue
    @Column (name = "status_id")
    private Long id;

    private String name;
    private boolean isActive;

}
