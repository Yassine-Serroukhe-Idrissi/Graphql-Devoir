package ma.heracles.inventoryservice.Services;

import ma.heracles.inventoryservice.dtos.CreatorDTO;
import ma.heracles.inventoryservice.dtos.VideoDTO;
import ma.heracles.inventoryservice.entities.Creator;
import ma.heracles.inventoryservice.entities.Video;
import ma.heracles.inventoryservice.mappers.ModelMapperConfig;
import ma.heracles.inventoryservice.repository.CreatorRepository;
import ma.heracles.inventoryservice.repository.VideoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class ServiceImpl implements IService{
    @Autowired
    private ModelMapperConfig Mapper;
    @Autowired
    private CreatorRepository creatorRepository;
    @Autowired
    private VideoRepository videoRepository;

    @Override
    public CreatorDTO CreatorById(Long Id) {
        Creator creator = creatorRepository.findById(Id)
                .orElseThrow(()->new RuntimeException(String.format("Creator %s not found",Id)));
        return Mapper.fromCreator(creator);
    }

    @Override
    public Creator saveCreator(CreatorDTO creatorDTO) {
        Creator creator = Mapper.fromCreatorDto(creatorDTO);
        return creatorRepository.save(creator);
    }

    @Override
    public List<CreatorDTO> ListCreator() {
        List<Creator> creators = creatorRepository.findAll();
        List<CreatorDTO> creatorDTOS = creators.stream().map(Mapper::fromCreator).toList();
        return creatorDTOS;
    }

    @Override
    public Video saveVideo(VideoDTO videoDTO) {
        Video video = Mapper.fromVideoDto(videoDTO);
        creatorRepository.save(video.getCreator());
        return videoRepository.save(video);
    }

    @Override
    public VideoDTO VideoById(Long Id) {
        Video video = videoRepository.findById(Id)
                .orElseThrow(()->new RuntimeException(String.format("Video %s not found",Id)));
        return Mapper.fromVideo(video);
    }

    @Override
    public List<VideoDTO> ListVideo() {
        List<Video> videos = videoRepository.findAll();
        List<VideoDTO> videoDTOS = videos.stream().map(Mapper::fromVideo).toList();
        return videoDTOS;
    }
}
