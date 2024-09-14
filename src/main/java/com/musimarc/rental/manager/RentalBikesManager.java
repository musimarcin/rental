package com.musimarc.rental.manager;

import com.musimarc.rental.data.RentalBikeRepo;
import com.musimarc.rental.data.entity.Bikes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class RentalBikesManager {

    private RentalBikeRepo rentalBikeRepo;

    @Autowired
    public RentalBikesManager(RentalBikeRepo rentalBikeRepo) {
        this.rentalBikeRepo = rentalBikeRepo;
    }

    public Optional<Bikes> findById(int id) {
        return rentalBikeRepo.findById(id);
    }

    public Iterable<Bikes> findAll(int id) {
        return rentalBikeRepo.findAll();
    }

    public Bikes save(Bikes bike) {
        return rentalBikeRepo.save(bike);
    }

    public void deleteById(int id) {
        rentalBikeRepo.deleteById(id);
    }

    @EventListener(ApplicationReadyEvent.class)
    public void filltest() {
        save(new Bikes(1, "Big", "Bike", 1999));
    }

}
