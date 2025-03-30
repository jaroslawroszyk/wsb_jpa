package com.jpacourse.persistance.entity;

import com.jpacourse.persistance.enums.Specialization;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "DOCTOR")
public class DoctorEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(nullable = false)
	private String firstName;

	@Column(nullable = false)
	private String lastName;

	@Column(nullable = false)
	private String telephoneNumber;

	private String email;

	@Column(nullable = false)
	private String doctorNumber;

	@Column(nullable = false)
	@Enumerated(EnumType.STRING)
	private Specialization specialization;

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(nullable = false, name = "ADDRESS_ID")
	private AddressEntity address;

	@OneToMany(mappedBy = "doctor", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<VisitEntity> visits;
}
