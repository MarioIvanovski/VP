package mk.ukim.finki.wp.lab.bootstrap;

import jakarta.annotation.PostConstruct;
import mk.ukim.finki.wp.lab.model.Chef;
import mk.ukim.finki.wp.lab.model.Dish;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class DataHolder {
    public static List<Chef> chefs = new ArrayList<>();
    public static List<Dish> dishes = new ArrayList<>();

    @PostConstruct
    public void init() {
        // Updated chefs
        chefs.add(new Chef(0L, "Alice", "Waters", "Pioneer of California cuisine.", new ArrayList<>()));
        chefs.add(new Chef(1L, "Thomas", "Keller", "Famous for French Laundry.", new ArrayList<>()));
        chefs.add(new Chef(2L, "Massimo", "Bottura", "Renowned Italian chef from Modena.", new ArrayList<>()));
        chefs.add(new Chef(3L, "Heston", "Blumenthal", "Known for molecular gastronomy.", new ArrayList<>()));
        chefs.add(new Chef(4L, "Anne-Sophie", "Pic", "Michelin-starred French chef.", new ArrayList<>()));

        // Updated dishes
        dishes.add(new Dish("dish_0", "Ratatouille", "French", 40));
        dishes.add(new Dish("dish_1", "Coq au Vin", "French", 50));
        dishes.add(new Dish("dish_2", "Margherita Pizza", "Italian", 20));
        dishes.add(new Dish("dish_3", "Sushi Platter", "Japanese", 60));
        dishes.add(new Dish("dish_4", "Paella Valenciana", "Spanish", 55));
    }
}
