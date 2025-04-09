package com.jpacourse.persistance.dao;

import com.jpacourse.persistance.entity.PatientEntity;
import jakarta.persistence.EntityManager;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.transaction.annotation.Transactional;

import static com.jpacourse.persistance.helpers.PatientHelpers.createPatient;
import static org.assertj.core.api.Assertions.assertThat;


@SpringBootTest
@Transactional
@ActiveProfiles("test")
public class PatientDatoTest {
    @Autowired
    private AddressDao addressDao;

    @Autowired
    protected EntityManager entityManager;

    @Autowired
    private PatientDao patientDao;

    @Test
    public void shouldSavePatient() {
        PatientEntity patientEntity = createPatient();

        PatientEntity saved = patientDao.save(patientEntity);

        assertThat(saved).isNotNull();
    }

    @Test
    @Sql(scripts = {
            "/data/address.sql",
            "/data/patients.sql"
    })
    public void shouldFindPatientById() {
        Long kowalski_id = 69L;

        PatientEntity patientEntity = patientDao.findOne(kowalski_id);
        assertThat(patientEntity).isNotNull();
        assertThat(patientEntity.getFirstName()).isEqualTo("Adam");
    }
}
