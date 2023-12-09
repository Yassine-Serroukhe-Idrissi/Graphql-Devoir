package ma.heracles.inventoryservice.entities;

import java.util.Date;
import jakarta.persistence.*;
import lombok.*;

@Entity @Data @Builder
@NoArgsConstructor @AllArgsConstructor
public class Video {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String url;
    private String description;
    private Date datePublication;
    @ManyToOne
    private Creator creator;
}