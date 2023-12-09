package ma.heracles.inventoryservice.repository;

import ma.heracles.inventoryservice.entities.Creator;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface CreatorRepository extends JpaRepository<Creator,Long> {
}
