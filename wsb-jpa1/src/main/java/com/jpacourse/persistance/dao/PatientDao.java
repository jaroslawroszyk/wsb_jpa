package com.jpacourse.persistance.dao;

import com.jpacourse.persistance.entity.PatientEntity;
import jakarta.transaction.Transactional;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public interface PatientDao extends Dao<PatientEntity, Long> {

    @Transactional
    void addVisitForPatient(Long patientId, Long doctorId, LocalDateTime visitDate, String visitDescription) throws IllegalArgumentException;


    List<PatientEntity> findPatientsByLastName(String lastName);

    List<PatientEntity> findPatientsByVisitCountGreaterThan(int visitsCount);

    List<PatientEntity> findPatientsByInsuranceStatusAfterDate(Boolean insured, LocalDate date);
}

/*
Uzupelnij plik data.sql o dane niezbedne do realizacji nastepujacych zapytan:
1. Znajdz pacjentow po nazwisku - wszystkich? findPatientsByLastName
2. Znajdz wszystkie wizyty pacjenta po jego ID =
3. znajdz pacjentow ktorzy mieli wiecej niz X wizyt (X jest parametrem wejsciowym)  = findPatientsByVisitCountGreaterThan
4. Znajdz pacjentow po dodanym przez Ciebie polu - nie wyszukuj wprost po wartosci, uzyj zapytania typu wieksze/mniejsze/pozniej/wczesniej/zawiera, w zaleznosci od wybranego typu zmiennej. = findPatientsByInsuranceStatusAfterDate

 */