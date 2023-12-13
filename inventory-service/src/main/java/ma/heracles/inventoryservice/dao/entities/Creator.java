package ma.heracles.inventoryservice.dao.entities;

import jakarta.persistence.*;
import lombok.*;
import java.util.List;

@Entity @Getter @Setter @Builder
@NoArgsConstructor @AllArgsConstructor @ToString
public class Creator {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    @OneToMany(mappedBy = "creator")
    private List<Video> videos;
}
