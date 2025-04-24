package com.jpacourse.persistance.dao.impl;

import com.jpacourse.persistance.dao.PatientDao;
import com.jpacourse.persistance.entity.DoctorEntity;
import com.jpacourse.persistance.entity.PatientEntity;
import com.jpacourse.persistance.entity.VisitEntity;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Repository
public class PatientDaoImpl extends AbstractDao<PatientEntity, Long> implements PatientDao {

    @Override
    // todo: maybe return VisitEntity?
    public void addVisitForPatient(Long patientId, Long doctorId, LocalDateTime visitDate, String visitDescription) throws IllegalArgumentException {
        PatientEntity patientEntity = findOne(patientId);
        DoctorEntity doctorEntity = entityManager.find(DoctorEntity.class, doctorId);

        if (patientEntity == null || doctorEntity == null) {
            throw new IllegalArgumentException("Patient/Doctor not found");
        }

        VisitEntity visitEntity = new VisitEntity();
        visitEntity.setPatient(patientEntity);
        visitEntity.setDoctor(doctorEntity);
        visitEntity.setTime(visitDate);
        visitEntity.setDescription(visitDescription);

        patientEntity.addVisit(visitEntity);
        doctorEntity.addVisit(visitEntity);

        entityManager.merge(visitEntity);
    }

    @Override
    public List<PatientEntity> findPatientsByLastName(String lastName){
        String query = "SELECT p FROM PatientEntity p WHERE p.lastName = :lastName";

        return entityManager.createQuery(query, PatientEntity.class)
                .setParameter("lastName", lastName)
                .getResultList();
    }

    @Override
    public List<PatientEntity> findPatientsByVisitCountGreaterThan(int visitsCount){
        String query = "SELECT p FROM PatientEntity p WHERE SIZE(p.visits) > :visitsCount";

        return entityManager.createQuery(query, PatientEntity.class)
                .setParameter("visitsCount", visitsCount)
                .getResultList();
    }

    @Override
    public List<PatientEntity> findPatientsByInsuranceStatusAfterDate(Boolean insured, LocalDate date) {
        String query = "SELECT p FROM PatientEntity p WHERE p.insured = :insured AND p.insuranceStartDate > :date";

        return entityManager.createQuery(query, PatientEntity.class)
                .setParameter("insured", insured)
                .setParameter("date", date)
                .getResultList();
    }
}
