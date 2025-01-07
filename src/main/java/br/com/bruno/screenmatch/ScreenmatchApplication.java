package br.com.bruno.screenmatch;


import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import principal.Principal;

@SpringBootApplication
public class ScreenmatchApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(ScreenmatchApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Principal principal = new Principal();
		principal.exibeMenu();
//		List<DadosTemporada> temporadas = new ArrayList<>();
//		
//		for(int i =1; i<= dadosSerie.totalTemporadas(); i++) {
//			json = consumoApi.obterDados("https://www.omdbapi.com/?t=Game%20of%20Thrones&season=" + i + "&apikey=e0398308");
//			DadosTemporada dadosTemporada = conversor.obterDados(json, DadosTemporada.class);
//			temporadas.add(dadosTemporada);
//		}
//		
//		temporadas.forEach(System.out::println);
		
		
	}

}
