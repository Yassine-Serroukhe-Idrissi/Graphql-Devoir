package ma.heracles.inventoryservice;

import ma.heracles.inventoryservice.dtos.CreatorDTO;
import ma.heracles.inventoryservice.entities.Creator;
import ma.heracles.inventoryservice.entities.Video;
import ma.heracles.inventoryservice.mappers.ModelMapperConfig;
import ma.heracles.inventoryservice.repository.CreatorRepository;
import ma.heracles.inventoryservice.repository.VideoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;
import java.util.stream.Collectors;

@SpringBootApplication
public class InventoryServiceApplication {

	@Autowired
	private ModelMapperConfig Mapper;

	public static void main(String[] args) {
		SpringApplication.run(InventoryServiceApplication.class, args);
	}

	 @Bean
	CommandLineRunner start(CreatorRepository creatorRepository, VideoRepository videoRepository){
		return args -> {

		};
	}

}
