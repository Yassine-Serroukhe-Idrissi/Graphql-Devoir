package ma.heracles.inventoryservice.services;

import ma.heracles.inventoryservice.dao.entities.Creator;
import ma.heracles.inventoryservice.dao.repository.CreatorRepository;
import ma.heracles.inventoryservice.dtos.CreatorDTO;
import ma.heracles.inventoryservice.mappers.ModelMapperConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

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

    public Creator addCreator(CreatorDTO creatorDTO){
        Creator creator = Mapper.fromCreatorDto(creatorDTO);
        return creatorRepository.save(creator);
    }
}