package ma.heracles.inventoryservice.mappers;

import ma.heracles.inventoryservice.dao.entities.Creator;
import ma.heracles.inventoryservice.dtos.CreatorDTO;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class CreatorMapper {
    private final ModelMapper modelMapper = new ModelMapper();

    public CreatorDTO fromCreatorToCreatoDTO(Creator creator){
        return this.modelMapper.map(creator,CreatorDTO.class);
    }

    public Creator fromCreatorDTOToCreator(CreatorDTO creatorDTO){
        return this.modelMapper.map(creatorDTO,Creator.class);
    }
}
