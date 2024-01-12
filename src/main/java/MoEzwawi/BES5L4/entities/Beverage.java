package MoEzwawi.BES5L4.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Entity
@Table(name = "beverages")
public class Beverage{
    @Id
    @GeneratedValue
    protected long id;
    private String name;
    private int calories;
    private double price;
    public Beverage(String name, int calories, double price){
        this.name = name;
        this.calories=calories;
        this.price=price;
    }
}
