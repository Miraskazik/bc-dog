package cz.rb.bcdog.model;

import cz.rb.projectcommon.model.dog.GenderEnum;
import lombok.*;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Dog {

    private Long id;
    private String name;
    private String breed;
    private GenderEnum gender;
    private String details;
    private Long ownerId;
}
