package ma.heracles.inventoryservice.dtos;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.*;
import ma.heracles.inventoryservice.entities.Creator;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class VideoDTO {
    private String name;
    private String url;
    private String description;
    private Date datePublication;
    private CreatorDTO creatorDTO;
}
