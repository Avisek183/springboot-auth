package com.abhishek.surveybackend.survey.service;


import com.abhishek.surveybackend.survey.models.Surveydetails;
import com.abhishek.surveybackend.survey.repository.SurveydetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
@Transactional 
public class SurveydetailsService {
        @Autowired
        private SurveydetailsRepository surveydetailsRepository;
        public List<Surveydetails> listAllUser() {
            return surveydetailsRepository.findAll();
        }

        public void saveUser(Surveydetails surveydetails) {
            surveydetailsRepository.save(surveydetails);
        }

        public Surveydetails getUser(Integer id) {
            return surveydetailsRepository.findById(id).get();
        }

        public void deleteUser(Integer id) {
            surveydetailsRepository.deleteById(id);
        }
    }



