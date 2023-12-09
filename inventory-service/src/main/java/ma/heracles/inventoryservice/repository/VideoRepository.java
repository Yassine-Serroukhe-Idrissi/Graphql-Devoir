package ma.heracles.inventoryservice.repository;

import ma.heracles.inventoryservice.entities.Video;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VideoRepository extends JpaRepository<Video,Long> {
}
