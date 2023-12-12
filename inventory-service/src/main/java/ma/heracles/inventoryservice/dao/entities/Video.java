package ma.heracles.inventoryservice.dao.entities;

import java.util.Date;
import jakarta.persistence.*;
import lombok.*;

@Entity @Data @Builder
@NoArgsConstructor @AllArgsConstructor @ToString
public class Video {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String url;
    private String description;
    private String datePublication;
    @ManyToOne
    private Creator creator;
}
