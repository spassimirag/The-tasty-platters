package com.example.tastyplatters;

import com.example.tastyplatters.domain.OrderEntity;
import com.example.tastyplatters.domain.PlatterEntity;
import com.example.tastyplatters.repository.OrderRepository;
import com.example.tastyplatters.repository.PlatterRepository;
import com.example.tastyplatters.service.PlatterServiceImpl;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
@EnableScheduling
public class TheTastyPlatterApplication implements CommandLineRunner {

	@Autowired
	public PlatterRepository platterRepository;

	@Autowired
	public OrderRepository orderRepository;
    @Autowired
    private PlatterServiceImpl platterServiceImpl;

	public static void main(String[] args) {
		SpringApplication.run(TheTastyPlatterApplication.class, args);

		}

	@Transactional
	@Override
	public void run(String... args) throws Exception {

//		PlatterEntity platter = PlatterEntity.builder().title("Tasty").price(10.55).description("Mandja").build();
//		PlatterEntity platter2 = PlatterEntity.builder().title("New wave").price(13.55).description("Vkusno").build();
//		PlatterEntity platter3 = PlatterEntity.builder().title("Fruity").price(13.55).description("vegan").build();
//
//
//		OrderEntity order = OrderEntity.builder().address("Han Asparuh").status("pending")
//				.username("pesho").platters(Set.of(platter, platter2)).build();
//
//platterRepository.save(platter);
//platterRepository.save(platter2);
//platterRepository.save(platter3);
//
//orderRepository.save(order);

	}
}

