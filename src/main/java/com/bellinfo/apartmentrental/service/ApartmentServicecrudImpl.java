package com.bellinfo.apartmentrental.service;

import com.bellinfo.apartmentrental.model.ApartmentRent;
import com.bellinfo.apartmentrental.repository.AptRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ApartmentServicecrudImpl implements ApartmentServicecrud {

    @Autowired
    AptRepository aptRepository;

    @Override
    public void addApartmentRent(ApartmentRent apartmentRent){
        aptRepository.addApartmentRent(apartmentRent);
    }

    @Override
    public void updateApartmentRent(ApartmentRent apartmentRent){
        aptRepository.updateApartmentRent(apartmentRent);
    }

    @Override
    public List<ApartmentRent> getApartmentRents(){
        List<ApartmentRent> list = aptRepository.getApartmentRents();
        return list;
    }

    @Override
    public ApartmentRent getApartmentRents(int id){
        ApartmentRent apartmentRent = aptRepository.getApartmentRents(id);
        return apartmentRent;

    }

    @Override
    public void deleteApartmentRent(int id){
        aptRepository.deleteApartmentRent(id);
    }


}
