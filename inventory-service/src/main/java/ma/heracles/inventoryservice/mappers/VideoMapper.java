package ma.heracles.inventoryservice.mappers;

import ma.heracles.inventoryservice.dao.entities.Video;
import ma.heracles.inventoryservice.dtos.VideoDTO;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class VideoMapper {
    private final ModelMapper modelMapper = new ModelMapper();
    public VideoDTO fromVideoToVideoDTO(Video video){
        return  this.modelMapper.map(video,VideoDTO.class);
    }
    public Video fromVideoDTOToVideo(VideoDTO videoDTO){
        return this.modelMapper.map(videoDTO, Video.class);
    }
}
