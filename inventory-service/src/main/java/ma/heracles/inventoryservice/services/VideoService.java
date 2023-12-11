package ma.heracles.inventoryservice.services;

import ma.heracles.inventoryservice.dao.entities.Creator;
import ma.heracles.inventoryservice.dao.entities.Video;
import ma.heracles.inventoryservice.dao.repository.CreatorRepository;
import ma.heracles.inventoryservice.dao.repository.VideoRepository;
import ma.heracles.inventoryservice.dtos.CreatorDTO;
import ma.heracles.inventoryservice.dtos.VideoDTO;
import ma.heracles.inventoryservice.mappers.ModelMapperConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
public class VideoService {

    @Autowired
    private CreatorRepository creatorRepository;
    @Autowired
    private VideoRepository videoRepository;
    @Autowired
    private ModelMapperConfig Mapper;

    public List<Video> videoList(){
        return videoRepository.findAll();
    }
    public Video addVideo(VideoDTO videoDTO){
        CreatorDTO creatorDTO = videoDTO.getCreatorDTO();
        Creator creator = Mapper.fromCreatorDto(creatorDTO);
        Video video = Mapper.fromVideoDto(videoDTO);
        video.setCreator(creator);
        return videoRepository.save(video);
    }
    public Video findById(Long Id){
        return  videoRepository.findById(Id).get();
    }

}
