package com.bellinfo.apartmentrental.controller;


import com.bellinfo.apartmentrental.model.ApartmentRent;
import com.bellinfo.apartmentrental.service.ApartmentServicecrud;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping(value="/ApartmentRent")
public class ApartmentController {
    Logger logger= LoggerFactory.getLogger(ApartmentController.class);

    @Autowired
    ApartmentServicecrud apartmentServicecrud;

    @RequestMapping(value = "/", method= RequestMethod.GET)
    public String getIndex(Model model) {
        ApartmentRent apartmentRent = new ApartmentRent();
        logger.info("ApartmentRent adding in / request", apartmentRent);
        model.addAttribute("apartmentRent", apartmentRent);
        return "login";

    }
    @RequestMapping(value = "/index", method= RequestMethod.GET)
    public String getIndexPage(Model model) {
        ApartmentRent apartmentRent = new ApartmentRent();
        logger.info("ApartmentRent adding in / request", apartmentRent);
        model.addAttribute("apartmentRent", apartmentRent);
        return "login";

    }
    @RequestMapping(value = "/add", method= RequestMethod.GET)
    public String addApartmentRents(Model model) {
        ApartmentRent apartmentRent = new ApartmentRent();
        logger.info("ApartmentRent adding in / request",apartmentRent);
        model.addAttribute("apartmentRent", apartmentRent);
        return "ApartmentRent-login";
    }

    @RequestMapping(value = "/add", method= RequestMethod.POST)
    public String addApartmentRent(Model model) {
        ApartmentRent apartmentRent = new ApartmentRent();
        logger.info("ApartmentRent adding in / request", apartmentRent);
        model.addAttribute("apartmentRent", apartmentRent);
        return "login";
    }

    @RequestMapping(value = "/list", method= RequestMethod.GET)
    public String getApartmentRents(@PathVariable int id, Model model) {
        List<ApartmentRent> list =apartmentServicecrud.getApartmentRents();
        logger.info("Team list in /list request",list);
        model.addAttribute("list", list);
        return "login";

    }
    @RequestMapping(value = "/edit/{id}", method= RequestMethod.GET)
    public String editApartmentRent(@PathVariable int id, Model model) {
        ApartmentRent apartmentRent =apartmentServicecrud.getApartmentRents(id);
        model.addAttribute("apartmentRent",apartmentRent );
        return "login";


    }
    @RequestMapping(value = "/edit/{id}", method= RequestMethod.POST)
    public String editApartmentRent(@ModelAttribute ApartmentRent apartmentRent, @PathVariable int id, Model model) {
        apartmentServicecrud.updateApartmentRent(apartmentRent);
        List<ApartmentRent> list = apartmentServicecrud.getApartmentRents();
        model.addAttribute("list", list);
        return "login";
    }


    @RequestMapping(value = "/delete/{id}", method= RequestMethod.GET)
    public String deleteApartmentRent(@PathVariable int id, Model model) {
        apartmentServicecrud.deleteApartmentRent(id);
        List<ApartmentRent> list = apartmentServicecrud.getApartmentRents();
        model.addAttribute("list",list);
        return "login";
    }
}
