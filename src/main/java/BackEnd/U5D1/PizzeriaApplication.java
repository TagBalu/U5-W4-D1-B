package BackEnd.U5D1;

import BackEnd.U5D1.entities.Articolo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class PizzeriaApplication {

	public static void main(String[] args) {

		ApplicationContext context =SpringApplication.run(PizzeriaApplication.class, args);
		List<Articolo> menu= context.getBean("menu",List.class);

		System.out.println("=== Menù della Pizzeria ===");
		for (Articolo articolo : menu){
			System.out.println(articolo.toString());
		}
	}

}
