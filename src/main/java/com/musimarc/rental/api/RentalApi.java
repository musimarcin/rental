package com.musimarc.rental.api;

import com.musimarc.rental.data.RentalBikeRepo;
import com.musimarc.rental.data.entity.Bikes;
import com.musimarc.rental.data.entity.Cars;
import com.musimarc.rental.manager.RentalBikesManager;
import com.musimarc.rental.manager.RentalCarsManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

@RestController
@RequestMapping("/api/rental")
public class RentalApi {

    private RentalCarsManager testcar;
    private RentalBikesManager testbike;

    @Autowired
    public RentalApi(RentalCarsManager rentalCarsManager, RentalBikesManager rentalBikesManager) {
       this.testcar = rentalCarsManager;
       this.testbike = rentalBikesManager;
    }

    @GetMapping("/all")
    public ResponseEntity<HashMap<String, Object>> getAll() {
        Iterable<Cars> cars = testcar.findAll();
        Iterable<Bikes> bikes = testbike.findAll();

        HashMap<String, Object> res = new HashMap<>();
        res.put("cars: ", cars);
        res.put("bikes: ", bikes);

        return ResponseEntity.ok(res);
    }

    @GetMapping("/all/car")
    public Iterable<Cars> getAllCars() {
        return testcar.findAll();
    }
    @GetMapping("/all/bike")
    public Iterable<Bikes> getAllBikes() {
        return testbike.findAll();
    }
    @GetMapping("/all/car/{id}")
    public Optional<Cars> getCarById(@PathVariable int id) {
        return testcar.findById(id);
    }
    @GetMapping("/all/bike/{id}")
    public Optional<Bikes> getBikeById(@PathVariable int id) {
        return testbike.findById(id);
    }

    @PostMapping("/add/car")
    public void addCar(@RequestBody Cars car) {
        testcar.save(car);
    }
    @PostMapping("/add/bike")
    public void addBike(@RequestBody Bikes bike) {
        testbike.save(bike);
    }

    @PutMapping("/update/car")
    public void updateCar(@RequestBody Cars car) {
        testcar.save(car);
    }
    @PutMapping("/update/bike")
    public void updateBike(@RequestBody Bikes bike) {
        testbike.save(bike);
    }

    @DeleteMapping("delete/car/{id}")
    public void deleteCar(@PathVariable int id) {
        testcar.deleteById(id);
    }
    @DeleteMapping("/delete/bike/{id}")
    public void deleteBike(@PathVariable int id) {
        testbike.deleteById(id);
    }

}
