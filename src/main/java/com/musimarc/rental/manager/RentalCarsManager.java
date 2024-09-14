package com.musimarc.rental.manager;

import com.musimarc.rental.data.RentalCarsRepo;
import com.musimarc.rental.data.entity.Cars;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class RentalCarsManager {

    private RentalCarsRepo rentalCarsRepo;

    @Autowired
    public RentalCarsManager(RentalCarsRepo rentalCarsRepo) {
        this.rentalCarsRepo = rentalCarsRepo;
    }

    public Optional<Cars> findById(int id) {
        return rentalCarsRepo.findById(id);
    }

    public Iterable<Cars> findAll() {
        return rentalCarsRepo.findAll();
    }

    public Cars save(Cars car) {
        return rentalCarsRepo.save(car);
    }

    public void deleteById(int id) {
        rentalCarsRepo.deleteById(id);
    }

    @EventListener(ApplicationReadyEvent.class)
    public void filltest() {
        save(new Cars(1, "Mazda", "3", 2005, 1.6));
    }

}
