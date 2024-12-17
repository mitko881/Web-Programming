package mk.finki.ukim.mk.lab04.service.implementation;

import mk.finki.ukim.mk.lab04.model.Location;
import mk.finki.ukim.mk.lab04.repository.jpa.LocationRepository;
import mk.finki.ukim.mk.lab04.service.LocationService;
import org.springframework.stereotype.Service;
import java.util.ArrayList;

import java.util.List;

@Service
public class LocationServiceImpl implements LocationService {
    private final LocationRepository locationRepository;

    public LocationServiceImpl(LocationRepository locationRepository) {
        this.locationRepository = locationRepository;
    }

    @Override
    public List<Location> findAll() {
        return this.locationRepository.findAll();
    }

}
