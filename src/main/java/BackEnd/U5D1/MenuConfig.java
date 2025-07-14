package BackEnd.U5D1;

import BackEnd.U5D1.entities.Articolo;
import BackEnd.U5D1.entities.Bevanda;
import BackEnd.U5D1.entities.Pizza;
import BackEnd.U5D1.entities.Topping;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class MenuConfig {

    @Bean
    public Topping ananas(){
        return new Topping(" Ananas",100,"Carboidrati 20 g, Vitamina C");
    }

    @Bean
    public Topping prosciutto(){
        return new Topping(" Prosciutto", 1.5,"Proteine 10 g, Grassi 6 g");

    }

    @Bean
    public Topping doppioProsciutto(){
        return new Topping(" Doppio prosciutto ", 2.50,"Proteine 20g, grassi 12g");

    }

    @Bean
    public Pizza margherita(){
        return new Pizza("Marghertita", 4,"Grassi 5 g, Carboidrati: Circa 46,26 g","");
    }

    @Bean
    public Pizza hawaiian(){
        return new Pizza ("Hawaiian Pizza", 100, "Grassi 10g, Carboidrati circa 103g","Prosciutto e ananas");

    }

    @Bean
    public Bevanda cocaCola(){
        return new Bevanda("Coca Cola",2,"calorie: 150 kcal");
    }

    @Bean
    public Bevanda acqua(){
        return new Bevanda("Acqua Minerale", 1 ,"");
    }

    @Bean
    public List<Articolo> menu(){
        List<Articolo> listaMenu= new ArrayList<>();

        listaMenu.add(margherita());
        listaMenu.add(hawaiian());

        listaMenu.add(cocaCola());
        listaMenu.add(acqua());

        return listaMenu;
    }

}
