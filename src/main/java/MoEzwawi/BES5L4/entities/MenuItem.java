package MoEzwawi.BES5L4.entities;

import jakarta.persistence.*;
import lombok.*;

@NoArgsConstructor
@Getter
@Setter
@ToString
public abstract class MenuItem {

    public MenuItem(String name, int calories, double price) {
        this.name = name;
        this.calories = calories;
        this.price = price;
    }

    protected String name;
    protected int calories;
    protected double price;
}
