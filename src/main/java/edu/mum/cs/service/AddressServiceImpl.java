package edu.mum.cs.service;

import edu.mum.cs.domain.Address;
import edu.mum.cs.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressServiceImpl implements AddressService {

    @Autowired
    AddressRepository addressRepository;

    @Override
    public List<Address> findAll(){

        return (List<Address>)addressRepository.findAll();
    }
}
