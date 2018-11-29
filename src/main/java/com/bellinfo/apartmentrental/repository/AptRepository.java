package com.bellinfo.apartmentrental.repository;

import com.bellinfo.apartmentrental.model.ApartmentRent;

import java.util.List;

public interface AptRepository {

    void addApartmentRent(ApartmentRent apartmentRent);
    void updateApartmentRent(ApartmentRent apartmentRent );
    List<ApartmentRent> getApartmentRents();
    ApartmentRent getApartmentRents(int id);
    void deleteApartmentRent(int id);
}
