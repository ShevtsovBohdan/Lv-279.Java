package ua.softserve.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import ua.softserve.data.entity.Academy;
import ua.softserve.service.AcademyService;


@Controller
@RequestMapping("/")
public class AcademyController {
    @Autowired
    AcademyService academyService;

    @RequestMapping(value = "/user/{userId}",method = RequestMethod.GET, produces = {"application/json"})
    public ResponseEntity<Academy> getUser(@PathVariable Integer userId) {
        return new ResponseEntity<Academy>(academyService.getById(userId), HttpStatus.OK);
    }

    @RequestMapping(value = "/user",method = RequestMethod.GET)
    public String getAllAcademies(Model model) {
        List<Academy> list = academyService.getAllAcademys();
        model.addAttribute("list", list);
        return "allAcademies";
    }

}

