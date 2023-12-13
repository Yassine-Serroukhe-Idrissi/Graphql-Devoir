package ma.heracles.inventoryservice.services;


import ma.heracles.inventoryservice.dao.entities.Creator;
import ma.heracles.inventoryservice.dao.repository.CreatorRepository;
import ma.heracles.inventoryservice.dtos.CreatorDTO;
import ma.heracles.inventoryservice.mappers.CreatorMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CreatorServiceImp implements CreatorService{
    @Autowired
    public CreatorRepository creatorRepository;
    @Autowired
    public CreatorMapper creatorMapper;
    @Override
    public CreatorDTO getCreatorById(Long id) {
        return creatorMapper.fromCreatorToCreatoDTO(creatorRepository.findById(id).get());
    }
    @Override
    public CreatorDTO saveCreator(CreatorDTO creatorDTO) {
        try {
            return creatorMapper.fromCreatorToCreatoDTO(creatorRepository.save(creatorMapper.fromCreatorDTOToCreator(creatorDTO)));
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }

    }
    @Override
    public List<CreatorDTO> getCreatorList() {
        List<Creator> creators = creatorRepository.findAll();
        List<CreatorDTO> creatorDTOS = creators.stream().map(creatorMapper::fromCreatorToCreatoDTO).toList();
        return creatorDTOS;
    }
}