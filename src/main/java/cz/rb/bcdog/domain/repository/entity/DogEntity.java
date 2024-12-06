package cz.rb.bcdog.domain.repository.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "all_dogs")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class DogEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "dog_name", length = 50, nullable = false)
    private String name;

    @Column(name = "dog_breed", length = 50, nullable = false)
    private String breed;

    @Column(name = "dog_gender", length = 6, nullable = false)
    private String gender;

    @Column(name = "dog_details", length = 255, nullable = false)
    private String details;

    @Column(name = "dog_owner_id", length = 15, nullable = false)
    private Long ownerId;

}
