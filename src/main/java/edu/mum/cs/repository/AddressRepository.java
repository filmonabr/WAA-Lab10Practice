package edu.mum.cs.repository;

import edu.mum.cs.domain.Address;
import org.springframework.data.repository.CrudRepository;

public interface AddressRepository extends CrudRepository<Address, Integer> {
}
