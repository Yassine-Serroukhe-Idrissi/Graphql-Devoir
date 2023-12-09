package ma.heracles.inventoryservice.mappers;

import ma.heracles.inventoryservice.dtos.CreatorDTO;
import ma.heracles.inventoryservice.dtos.VideoDTO;
import ma.heracles.inventoryservice.entities.Creator;
import ma.heracles.inventoryservice.entities.Video;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class ModelMapperConfig {
    private final ModelMapper modelMapper = new ModelMapper();

    public CreatorDTO fromCreator(Creator creator){
        return this.modelMapper.map(creator,CreatorDTO.class);
    }
    public Creator fromCreatorDto(CreatorDTO creatorDTO){
        return this.modelMapper.map(creatorDTO, Creator.class);
    }

    public VideoDTO fromVideo(Video video){
        return this.modelMapper.map(video,VideoDTO.class);
    }
    public Video fromVideoDto(VideoDTO videoDTO){
        return this.modelMapper.map(videoDTO, Video.class);
    }

}
