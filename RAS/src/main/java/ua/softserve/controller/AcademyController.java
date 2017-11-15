package ua.softserve.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import ua.softserve.data.entity.Academy;
import ua.softserve.service.Impl.AcademyServiceImpl;

@RestController
public class AcademyController {
    @Autowired
    AcademyServiceImpl academyService;

    @RequestMapping(value = "/academy/{academyId}",method = RequestMethod.GET, produces = {"application/json"})
    public ResponseEntity<Academy> getUser(@PathVariable Integer academyId) {
        return new ResponseEntity<Academy>(academyService.getById(academyId), HttpStatus.OK);
    }
}

