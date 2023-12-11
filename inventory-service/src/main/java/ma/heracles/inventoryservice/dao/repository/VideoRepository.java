package ma.heracles.inventoryservice.dao.repository;

import ma.heracles.inventoryservice.dao.entities.Video;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VideoRepository extends JpaRepository<Video,Long> {
    public Video findByName(String name);
}
