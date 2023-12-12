package ma.heracles.inventoryservice.services;

import ma.heracles.inventoryservice.dao.entities.Creator;
import ma.heracles.inventoryservice.dao.entities.Video;
import ma.heracles.inventoryservice.dao.repository.CreatorRepository;
import ma.heracles.inventoryservice.dtos.CreatorDTO;
import ma.heracles.inventoryservice.mappers.ModelMapperConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CreatorService {
    @Autowired
    private CreatorRepository creatorRepository;
    @Autowired
    private ModelMapperConfig Mapper;

    public CreatorDTO creatoById(Long Id){
        Creator creator = creatorRepository.findById(Id).get();
        return this.Mapper.fromCreator(creator);
    }

    public CreatorDTO addCreator(CreatorDTO creatorDTO){
        Creator creator = Mapper.fromCreatorDto(creatorDTO);
        creatorRepository.save(creator);
        CreatorDTO creatorDTO1 = Mapper.fromCreator(creator);
        return creatorDTO1;
    }

    public List<CreatorDTO> creatorList(){
        List<Creator> creatorList = creatorRepository.findAll();
        List<CreatorDTO> creatorDTOList = new ArrayList<>();
        for(Creator c : creatorList) {
            creatorDTOList.add(Mapper.fromCreator(c));
        }
        return creatorDTOList;
    }

}