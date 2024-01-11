package MoEzwawi.BES5L4.entities;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public abstract class MenuItem {
    protected String name;
    protected int calories;
    protected double price;
}
