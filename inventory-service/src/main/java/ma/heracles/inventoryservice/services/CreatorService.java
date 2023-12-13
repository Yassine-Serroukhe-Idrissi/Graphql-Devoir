package ma.heracles.inventoryservice.services;

import ma.heracles.inventoryservice.dao.entities.Creator;
import ma.heracles.inventoryservice.dtos.CreatorDTO;

public interface CreatorService {
    // getCreatorById(id: Float) : CreatorDTO
    public CreatorDTO getCreatorById(Long id);
    // saveCreator(creatorDto: CreatorDTOInput) : CreatorDTO
    public CreatorDTO saveCreator(CreatorDTO creatorDTO);
}
