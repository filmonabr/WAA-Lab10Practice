package edu.mum.cs.service;

import edu.mum.cs.domain.Address;
import edu.mum.cs.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public interface AddressService {

  Iterable<Address> findAll();
}
