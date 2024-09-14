package com.musimarc.rental.data;

import com.musimarc.rental.data.entity.Bikes;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RentalBikeRepo extends CrudRepository<Bikes, Integer> {
}
