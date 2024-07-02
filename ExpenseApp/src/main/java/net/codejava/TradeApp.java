package net.codejava;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TradeApp implements CommandLineRunner {

	@Autowired
	TradeRepository repository;
	
	public static void main(String[] args) {
		SpringApplication.run(TradeApp.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		repository.save(new Trade(12L, "ert101", "breakfast", "02024", new Date(02 / 02 / 2024), new Date(23 / 04 / 2024)));
		repository.save(new Trade(14L,"ert104","breakfast","02024", new Date(02/05/2024), new Date(23/06/2024)));
		repository.save(new Trade(15L,"ert106","breakfast","02026", new Date(02/06/2024), new Date(23/06/2024)));;
		repository.save(new Trade(17L,"ert107","breakfast","02024", new Date(02/02/2024), new Date(23/04/2024)));
		repository.save(new Trade(19L, "ert101", "breakfast", "02024", new Date(02 / 07 / 2024), new Date(20 / 07 / 2024)));
		
		Iterable<Trade> iterator = repository.findAll();
		
		System.out.println("All trade items: ");
		iterator.forEach(item -> System.out.println(item));
		
		List<Trade> breakfast = repository.findByTradeId(14L);
		System.out.println("\n my trade details?: ");
		breakfast.forEach(item -> System.out.println(item));
		
		List<Trade> expensiveItems = repository.findByCounterPartyId("ert106");
		System.out.println("\nExpensive Items: ");
		expensiveItems.forEach(item -> System.out.println(item));
		
	}
}
