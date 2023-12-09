package ma.heracles.inventoryservice.Web;

import ma.heracles.inventoryservice.Services.IService;
import ma.heracles.inventoryservice.dtos.CreatorDTO;
import ma.heracles.inventoryservice.dtos.VideoDTO;
import ma.heracles.inventoryservice.entities.Creator;
import ma.heracles.inventoryservice.entities.Video;
import ma.heracles.inventoryservice.mappers.ModelMapperConfig;
import ma.heracles.inventoryservice.repository.CreatorRepository;
import ma.heracles.inventoryservice.repository.VideoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;
import java.util.stream.Collectors;

@Controller
public class VideoGraphQlController {
    private IService iService;
    private ModelMapperConfig Mapper;

    VideoGraphQlController(IService iService,ModelMapperConfig Mapper){
        this.iService = iService;
        this.Mapper = Mapper;
    }

    @QueryMapping
    public List<VideoDTO> videoList(){
        return iService.ListVideo();
    }

    @QueryMapping
    public List<CreatorDTO> creatorsList(){
        return iService.ListCreator();
    }

    @QueryMapping
    public CreatorDTO creatorById(@Argument Long id) {
        return iService.CreatorById(id);
    }

    @QueryMapping
    public VideoDTO videoById(@Argument Long id){
        return iService.VideoById(id);
    }

    @MutationMapping
    public Video addVideo(@Argument VideoDTO videoDTO){
        return iService.saveVideo(videoDTO);
    }

    @MutationMapping
    public Creator addCreator(@Argument CreatorDTO creatorDTO){
        return iService.saveCreator(creatorDTO);
    }

}
