package com.contaapp.service;

import com.contaapp.dto.AddressDto;
import com.contaapp.exception.AddressNotFoundException;
import com.contaapp.model.Address;
import com.contaapp.repository.AddressRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class AddressService {
    private final AddressRepository addressRepository;
    private final ModelMapper mapper;

    @Autowired
    public AddressService(AddressRepository addressRepository,ModelMapper mapper) {
        this.addressRepository = addressRepository;
        this.mapper=mapper;
    }
    public AddressDto add(AddressDto addressDto) {
        Address address = fromDto(addressDto);
        address.setId(UUID.randomUUID());
        return toDto(addressRepository.save(address));
    }

    public List<AddressDto> findAll() {
        List<Address>adresses = addressRepository.findAll();
        return adresses.stream()
                .map(this::toDto)
                .toList();
    }

    public AddressDto update(AddressDto addressDto) {
        Address address = fromDto(addressDto);
        return toDto(addressRepository.save(address));
    }
    public void remove(UUID id) {
        addressRepository.deleteById(id);
    }
    public AddressDto findById(UUID id) {
        return toDto(addressRepository.findById(id).orElseThrow(() -> new AddressNotFoundException("User by id" + id + "not found")));
    }

    private Address fromDto(AddressDto addressDto) {
        return mapper.map(addressDto,Address.class);
    }

    private AddressDto toDto(Address address) {
        return mapper.map(address,AddressDto.class);
    }

}
