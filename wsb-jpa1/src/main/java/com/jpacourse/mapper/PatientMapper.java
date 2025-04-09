package com.jpacourse.mapper;

import com.jpacourse.dto.PatientTo;
import com.jpacourse.persistance.entity.PatientEntity;

public class PatientMapper {

    public static PatientTo mapToTo(final PatientEntity patientEntity) {
        if (patientEntity == null) {
            return null;
        }
        final PatientTo patientTo = new PatientTo();
        patientTo.setId(patientEntity.getId());
        patientTo.setFirstName(patientEntity.getFirstName());
        patientTo.setLastName(patientEntity.getLastName());
        patientTo.setDateOfBirth(patientEntity.getDateOfBirth());
        patientTo.setEmail(patientEntity.getEmail());
        patientTo.setTelephoneNumber(patientEntity.getTelephoneNumber());
        patientTo.setDateOfBirth(patientEntity.getDateOfBirth());
        patientTo.setAddress(patientEntity.getAddress());

        /*

         // Przekształcenie wizyt
        List<VisitEntity> visits = patientEntity.getVisits();
        List<VisitDTO> visitDTOs = visits.stream().map(visit -> {
            VisitDTO visitDTO = new VisitDTO();
            visitDTO.setTime(visit.getTime());
            visitDTO.setDoctorFullName(visit.getDoctor().getFirstName() + " " + visit.getDoctor().getLastName());
            visitDTO.setTreatmentTypes(visit.getTreatments().stream()
                    .map(MedicalTreatmentEntity::getType)
                    .collect(Collectors.toList()));
            return visitDTO;
        }).collect(Collectors.toList());

        patientTO.setVisits(visitDTOs);
         */
        return patientTo;
    }

}
