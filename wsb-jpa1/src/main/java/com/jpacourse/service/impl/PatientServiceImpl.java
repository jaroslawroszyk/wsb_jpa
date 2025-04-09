package com.jpacourse.service.impl;

import com.jpacourse.dto.PatientTo;
import com.jpacourse.mapper.AddressMapper;
import com.jpacourse.mapper.PatientMapper;
import com.jpacourse.service.PatientService;
import com.jpacourse.persistance.dao.PatientDao;
import com.jpacourse.persistance.entity.PatientEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;


@Service
@Transactional
public class PatientServiceImpl implements PatientService {
    private final PatientDao patientDao;

    @Autowired
    public PatientServiceImpl(PatientDao patientDao) {
        this.patientDao = patientDao;
    }

    @Override
    public Optional<PatientTo> findById(Long id) {
//        final PatientEntity entity = patientDao.findOne(id);
//        return PatientMapper.mapToTo(entity);
        return Optional.ofNullable(PatientMapper.mapToTo(patientDao.findOne(id)));

    }
}
