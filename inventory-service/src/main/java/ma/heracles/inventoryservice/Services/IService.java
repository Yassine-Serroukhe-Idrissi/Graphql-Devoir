package ma.heracles.inventoryservice.Services;

import ma.heracles.inventoryservice.dtos.CreatorDTO;
import ma.heracles.inventoryservice.dtos.VideoDTO;
import ma.heracles.inventoryservice.entities.Creator;
import ma.heracles.inventoryservice.entities.Video;

import java.util.List;

public interface IService {
    CreatorDTO CreatorById(Long Id);
    Creator saveCreator(CreatorDTO creatorDTO);
    List<CreatorDTO> ListCreator();
    Video saveVideo(VideoDTO videoDTO);
    VideoDTO VideoById(Long Id);
    List<VideoDTO> ListVideo();
}
