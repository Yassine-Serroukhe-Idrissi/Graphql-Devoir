package ma.heracles.inventoryservice.dtos;

import lombok.*;


@Getter @Setter @AllArgsConstructor @NoArgsConstructor @Builder
@ToString
public class CreatorDTO {
    private String name;
    private String email;
}
