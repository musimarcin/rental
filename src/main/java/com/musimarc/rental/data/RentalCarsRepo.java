package com.musimarc.rental.data;

import com.musimarc.rental.data.entity.Cars;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RentalCarsRepo extends CrudRepository<Cars, Integer> {
}
