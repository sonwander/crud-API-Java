package com.objetivar.crud.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.objetivar.crud.repository.AddressRepository;
import com.objetivar.crud.model.Address;

import java.util.List;

@Service
public class AddressService {
    private final AddressRepository addressRepository;

    @Autowired
    public AddressService(AddressRepository addressRepository) {
        this.addressRepository = addressRepository;
    }

    public Address createAddress(Address address) {
        return addressRepository.save(address);
    }

    public Address getAddressById(Long id) {
        return addressRepository.findById(id).orElse(null);
    }

    public List<Address> getAllAddresses() {
        return addressRepository.findAll();
    }

    public Address updateAddress(Long id, Address updatedAddress) {
        Address existingAddress = addressRepository.findById(id).orElse(null);
        if (existingAddress != null) {
            existingAddress.setCity(updatedAddress.getCity());
            existingAddress.setState(updatedAddress.getState());
            existingAddress.setZipCode(updatedAddress.getZipCode());
            existingAddress.setDescription(updatedAddress.getDescription());
            existingAddress.setAddress(updatedAddress.getAddress());
            existingAddress.setNumber(updatedAddress.getNumber());
            existingAddress.setComplement(updatedAddress.getComplement());
            existingAddress.setComplementoEndereco(updatedAddress.getComplementoEndereco());
            existingAddress.setBairro(updatedAddress.getBairro());
            addressRepository.save(existingAddress);
        }
        return existingAddress;
    }

    public void deleteAddress(Long id) {
        addressRepository.deleteById(id);
    }
}
