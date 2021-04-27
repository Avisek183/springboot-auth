package com.abhishek.surveybackend.survey.controllers;
import com.abhishek.surveybackend.survey.models.Surveydetails;
import com.abhishek.surveybackend.survey.service.SurveydetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@CrossOrigin
@RestController
@RequestMapping("/api/surveytable")
public class SurveydetailsController {
    @Autowired
    SurveydetailsService surveydetailsService;


    @GetMapping("")
    public List<Surveydetails> list() {
        return surveydetailsService.listAllUser();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Surveydetails> get(@PathVariable Integer id) {
        try {
            Surveydetails surveydetails = surveydetailsService.getUser(id);
            return new ResponseEntity<Surveydetails>(surveydetails, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<Surveydetails>(HttpStatus.NOT_FOUND);
        }
    }
    @CrossOrigin
    @PostMapping("/add")
    public void add(@RequestBody Surveydetails surveydetails) {
        surveydetailsService.saveUser(surveydetails);
    }
    @PutMapping("/{id}")
    public ResponseEntity<?> update(@RequestBody Surveydetails surveydetails, @PathVariable Integer id) {
        try {
            Surveydetails existUser = surveydetailsService.getUser(id);
            surveydetails.setId(id);
            surveydetailsService.saveUser(surveydetails);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {

        surveydetailsService.deleteUser(id);
    }
}