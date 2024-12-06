package mk.finki.ukim.mk.lab.repository.inmemory;

import mk.finki.ukim.mk.lab.bootstrap.DataHolder;
import mk.finki.ukim.mk.lab.model.Location;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class InMemoryLocationRepository {
    public List<Location> findAll() {
        return DataHolder.locations;
    }
}
