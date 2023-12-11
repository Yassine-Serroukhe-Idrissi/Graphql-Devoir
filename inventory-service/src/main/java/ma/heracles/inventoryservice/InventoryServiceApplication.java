package ma.heracles.inventoryservice;

import ma.heracles.inventoryservice.dao.entities.Creator;
import ma.heracles.inventoryservice.dao.entities.Video;
import ma.heracles.inventoryservice.mappers.ModelMapperConfig;
import ma.heracles.inventoryservice.dao.repository.CreatorRepository;
import ma.heracles.inventoryservice.dao.repository.VideoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;

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
			Creator c1 = creatorRepository.save(Creator.builder().name("yassine").email("yassine.serroukhe@gmail.com").build());
			creatorRepository.save(Creator.builder().name("Asaad").email("asaad.jnini@gmail.com").build());
			videoRepository.save(Video.builder().name("First Video").url("0.0.0.1:8086").description("video number One").datePublication(new Date()).creator(c1).build());
		};
	}

}
