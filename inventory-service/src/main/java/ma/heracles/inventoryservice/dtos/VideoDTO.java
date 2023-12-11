package ma.heracles.inventoryservice.dtos;

import lombok.*;

@Getter @Setter @AllArgsConstructor @NoArgsConstructor @Builder
@ToString
public class VideoDTO {
    private String name;
    private String url;
    private String description;
    private CreatorDTO creatorDTO;
}
