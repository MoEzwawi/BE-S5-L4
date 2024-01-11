package MoEzwawi.BES5L4;

import MoEzwawi.BES5L4.dao.services.MenuItemService;
import MoEzwawi.BES5L4.entities.Topping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyRunner implements CommandLineRunner {
    @Autowired
    private MenuItemService itemService;
    @Override
    public void run(String... args) throws Exception {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(BeS5L4Application.class);
        Topping mozzarella = (Topping) ctx.getBean("mozzarella");
        itemService.save(mozzarella);

    }
}
