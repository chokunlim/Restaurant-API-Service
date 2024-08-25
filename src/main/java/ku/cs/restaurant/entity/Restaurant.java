package ku.cs.restaurant.entity;
// 6510450844 Puri Limwongrujirat

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;


import java.util.UUID;


@Data
@Entity
public class Restaurant {


    @Id
    @GeneratedValue
    private UUID id;

    private String name;
    private double rating;
    private String location;
}
