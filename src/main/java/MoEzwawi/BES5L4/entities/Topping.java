package MoEzwawi.BES5L4.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class Topping extends MenuItem{
    public Topping(String name, int calories, double price) {
        super(name, calories, price);
    }
}
