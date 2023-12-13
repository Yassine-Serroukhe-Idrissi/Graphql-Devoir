package ma.heracles.inventoryservice.Web;

import lombok.AllArgsConstructor;
import ma.heracles.inventoryservice.dtos.CreatorDTO;
import ma.heracles.inventoryservice.services.CreatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

@Controller
public class CreatorGraphQLController {
    @Autowired
    public CreatorService creatorService;

    // getCreatorById(id: Float) : CreatorDTO
    @QueryMapping
    public CreatorDTO getCreatorById(@Argument Long id){
        return creatorService.getCreatorById(id);
    }

    //saveCreator(creatorDto: CreatorDTOInput) : CreatorDTO
    @MutationMapping
    public CreatorDTO saveCreator(@Argument CreatorDTO creatorDto){
        return creatorService.saveCreator(creatorDto);
    }
}
