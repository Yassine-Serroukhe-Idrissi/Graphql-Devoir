package ma.heracles.inventoryservice.Web;

import lombok.AllArgsConstructor;
import ma.heracles.inventoryservice.dtos.CreatorDTO;
import ma.heracles.inventoryservice.dtos.VideoDTO;
import ma.heracles.inventoryservice.dao.entities.Creator;
import ma.heracles.inventoryservice.dao.entities.Video;
import ma.heracles.inventoryservice.mappers.ModelMapperConfig;
import ma.heracles.inventoryservice.dao.repository.CreatorRepository;
import ma.heracles.inventoryservice.dao.repository.VideoRepository;
import ma.heracles.inventoryservice.services.CreatorService;
import ma.heracles.inventoryservice.services.VideoService;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
@AllArgsConstructor
public class VideoGraphQlController {
    private CreatorService creatorService;
    private VideoService videoService;


    @QueryMapping
    public CreatorDTO creatorById(@Argument Long Id) {
        return creatorService.creatoById(Id);
    }

    @MutationMapping
    public Creator addCreator(@Argument CreatorDTO creatorDTO){
        return creatorService.addCreator(creatorDTO);
    }

    @QueryMapping
    public List<Video> videoList(){
        return videoService.videoList();
    }

    @QueryMapping
    public Video videoById(@Argument Long Id){
        return videoService.findById(Id);
    }

    @MutationMapping
    public Video addVideo(@Argument VideoDTO videoDTO) {
        return videoService.addVideo(videoDTO);
    }



}
