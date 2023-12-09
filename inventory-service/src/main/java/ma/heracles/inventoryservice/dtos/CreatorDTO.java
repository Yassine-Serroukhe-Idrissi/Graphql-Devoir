package ma.heracles.inventoryservice.dtos;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.*;
import ma.heracles.inventoryservice.entities.Video;

import java.util.List;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreatorDTO {
    private String name;
    private String email;
}
