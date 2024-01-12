package MoEzwawi.BES5L4;

import MoEzwawi.BES5L4.dao.services.BeverageService;
import MoEzwawi.BES5L4.entities.Beverage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyRunner implements CommandLineRunner {
    @Autowired
    private BeverageService itemService;
    @Override
    public void run(String... args) throws Exception {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(BeS5L4Application.class);
        Beverage mozzarella = (Beverage) ctx.getBean("water");
        itemService.save(mozzarella);
        Beverage vino = new Beverage("Vino",400,4.50);
        itemService.save(vino);
    }
}
