package ma.heracles.inventoryservice.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;


@Entity @Data @Builder
@NoArgsConstructor @AllArgsConstructor
@Table
public class Creator {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    @OneToMany(mappedBy = "creator")
    private List<Video> videos;
}
