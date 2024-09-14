package com.musimarc.rental.api;

import com.musimarc.rental.data.entity.Bikes;
import com.musimarc.rental.data.entity.Cars;
import com.musimarc.rental.manager.RentalCarsManager;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/rental")
public class RentalApi {

    private RentalCarsManager test;

    @GetMapping("/all")
    public Iterable<Cars> getall() {
        return test.findAll();
    }

    @GetMapping
    public Optional<Cars> getById(@RequestParam int index) {
        return test.findById(index);
    }

    @PostMapping
    public void addCar(@RequestBody Cars car) {
        test.save(car);
    }

    @PutMapping
    public void updateCar(@RequestBody Cars car) {
        test.save(car);
    }

    @DeleteMapping
    public void deleteCar(@RequestParam int index) {
        test.deleteById(index);
    }
}
