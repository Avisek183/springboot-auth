package com.abhishek.surveybackend.survey.repository;


import com.abhishek.surveybackend.survey.models.Surveydetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SurveydetailsRepository extends JpaRepository<Surveydetails, Integer>{
}