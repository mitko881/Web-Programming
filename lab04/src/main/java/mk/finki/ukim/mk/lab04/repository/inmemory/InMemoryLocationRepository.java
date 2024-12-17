package mk.finki.ukim.mk.lab04.repository.inmemory;

import mk.finki.ukim.mk.lab04.bootstrap.DataHolder;
import mk.finki.ukim.mk.lab04.model.Location;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class InMemoryLocationRepository {
    public List<Location> findAll() {
        return DataHolder.locations;
    }
}
