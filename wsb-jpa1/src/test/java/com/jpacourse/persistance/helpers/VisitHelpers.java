package com.jpacourse.persistance.helpers;

import com.jpacourse.persistance.entity.MedicalTreatmentEntity;
import com.jpacourse.persistance.entity.PatientEntity;
import com.jpacourse.persistance.entity.VisitEntity;
import com.jpacourse.persistance.enums.TreatmentType;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;


public class VisitHelpers {

    public static List<MedicalTreatmentEntity> createMedicalTreatment() {
        List<MedicalTreatmentEntity> medicalTreatments = new ArrayList<>();

        MedicalTreatmentEntity medicalTreatment = new MedicalTreatmentEntity();
        medicalTreatment.setId(60L);
        medicalTreatment.setDescription("This is a description");
        medicalTreatment.setType(TreatmentType.RTG);
        medicalTreatment.setVisit(new VisitEntity());

        medicalTreatments.add(medicalTreatment);

        return medicalTreatments;
    }

    public static VisitEntity createVisit(PatientEntity patient) {
        VisitEntity visitEntity = new VisitEntity();

        visitEntity.setDescription("Kontrola zdrowia");
        visitEntity.setTime(LocalDateTime.now().plusDays(1));
        visitEntity.setPatient(patient);

        return visitEntity;
    }
}
