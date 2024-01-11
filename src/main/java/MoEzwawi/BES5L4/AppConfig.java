package MoEzwawi.BES5L4;

import MoEzwawi.BES5L4.entities.Beverage;
import MoEzwawi.BES5L4.entities.Menu;
import MoEzwawi.BES5L4.entities.Pizza;
import MoEzwawi.BES5L4.entities.Topping;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;
import java.util.List;

@Configuration
public class AppConfig {
    @Bean(name = "tomatoSauce")
    public Topping getTomatoSauce(){
        return new Topping("tomato sauce",30,0);
    }
    @Bean(name = "mozzarella")
    public Topping getMozzarella(){
        return new Topping("mozzarella",100,1.50);
    }
    @Bean(name = "margherita")
    public Pizza getMargherita(){
        return new Pizza("Margherita", Arrays.asList(getTomatoSauce(),getMozzarella()),false);
    }
    @Bean(name = "ham")
    public Topping getHam(){
        return new Topping("Ham",45,1.50);
    }
    @Bean(name = "pizzaProsciutto")
    public Pizza getPizzaProsciutto(){
        return new Pizza("Prosciutto", Arrays.asList(getTomatoSauce(),getMozzarella()), true);
    }
    @Bean(name = "water")
    public Beverage getWater(){
        return new Beverage("Water",0,2.00);
    }
    @Bean(name = "wine")
    public Beverage getWine(){
        return new Beverage("Wine",500, 4.00);
    }
    @Bean(name = "menu")
    public Menu getMenu(){
        List<Pizza> pizzaList = Arrays.asList(getMargherita(),getPizzaProsciutto());
        List<Topping> toppingList = Arrays.asList(getMozzarella(),getHam());
        List<Beverage> beverageList = Arrays.asList(getWater(),getWine());
        return new Menu(pizzaList,toppingList,beverageList);
    }
}