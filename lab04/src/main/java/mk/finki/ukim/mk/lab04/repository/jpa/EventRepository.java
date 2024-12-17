package mk.finki.ukim.mk.lab04.repository.jpa;

import mk.finki.ukim.mk.lab04.model.Event;
import org.springframework.stereotype.Repository;


@Repository
public interface EventRepository extends JpaSpecificationRepository<Event, Long> {

}
