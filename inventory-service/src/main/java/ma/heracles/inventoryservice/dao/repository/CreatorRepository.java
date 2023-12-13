package ma.heracles.inventoryservice.dao.repository;

import ma.heracles.inventoryservice.dao.entities.Creator;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CreatorRepository extends JpaRepository<Creator,Long> {
}
