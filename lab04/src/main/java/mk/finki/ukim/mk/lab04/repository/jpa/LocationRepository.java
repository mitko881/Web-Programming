package mk.finki.ukim.mk.lab04.repository.jpa;

import mk.finki.ukim.mk.lab04.model.Location;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LocationRepository extends JpaRepository<Location, Long> {
}
