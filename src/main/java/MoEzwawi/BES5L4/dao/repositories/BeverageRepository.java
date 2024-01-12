package MoEzwawi.BES5L4.dao.repositories;


import MoEzwawi.BES5L4.entities.Beverage;
import MoEzwawi.BES5L4.entities.MenuItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BeverageRepository extends JpaRepository<Beverage,Long> {
}
