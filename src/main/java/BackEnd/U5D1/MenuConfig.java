package BackEnd.U5D1;

import BackEnd.U5D1.entities.Topping;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

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

}
