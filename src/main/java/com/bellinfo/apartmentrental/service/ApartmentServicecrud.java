package com.bellinfo.apartmentrental.service;

import com.bellinfo.apartmentrental.model.ApartmentRent;

import java.util.List;

public interface ApartmentServicecrud {

    void addApartmentRent(ApartmentRent apartmentRent);

    void updateApartmentRent(ApartmentRent apartmentRent);

    List<ApartmentRent> getApartmentRents();

    ApartmentRent getApartmentRents(int id);

    void  deleteApartmentRent(int id);
}
