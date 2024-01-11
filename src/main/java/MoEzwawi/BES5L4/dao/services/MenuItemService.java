package MoEzwawi.BES5L4.dao.services;

import MoEzwawi.BES5L4.dao.repositories.MenuItemRepository;
import MoEzwawi.BES5L4.entities.MenuItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MenuItemService {
    @Autowired
    private MenuItemRepository itemRepository;
    public void save(MenuItem menuItem){
        itemRepository.save(menuItem);
    }
}
