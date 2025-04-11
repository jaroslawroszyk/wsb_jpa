package com.jpacourse.persistance.helpers;

import com.jpacourse.persistance.entity.DoctorEntity;
import com.jpacourse.persistance.enums.Specialization;

import static com.jpacourse.persistance.helpers.AddressHelpers.createAddress;

public class DoctorHelpers {
    public static DoctorEntity createDoctor() {
        DoctorEntity doctorEntity = new DoctorEntity();
        doctorEntity.setId(1L);
        doctorEntity.setFirstName("Bob");
        doctorEntity.setLastName("Jack");
        doctorEntity.setTelephoneNumber("1234567890");
        doctorEntity.setEmail("john.doe@example.com");
        doctorEntity.setDoctorNumber("12");
        doctorEntity.setSpecialization(Specialization.DERMATOLOGIST);
        doctorEntity.setAddress(createAddress());

        return doctorEntity;
    }
}
