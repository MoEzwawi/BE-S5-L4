package MoEzwawi.BES5L4.dao.services;

import MoEzwawi.BES5L4.dao.repositories.BeverageRepository;
import MoEzwawi.BES5L4.entities.Beverage;
import MoEzwawi.BES5L4.entities.MenuItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BeverageService {
    @Autowired
    private BeverageRepository itemRepository;
    public void save(Beverage menuItem){
        itemRepository.save(menuItem);
    }
}
