package com.newag.www.newag;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="tbl_termine")
public class Appointment {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String title;
	
    @ManyToOne(cascade=CascadeType.ALL)
    @JoinColumn(name = "patient_id")
    private Patient patient;
	private Date date;
	private Date start;
	
	private Appointment() {}
	
    public Appointment(String title) {
        this.title = title;

    }
    
    public Appointment(String title, Patient patient) {
        this.title = title;
        this.patient = patient;
        this.date = new Date();
    }
    public Appointment(String title, Patient patient, Date start) {
        this.title = title;
        this.patient = patient;
        this.date = new Date();
        this.start = start;
    }

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Date getStart() {
		return start;
	}

	public void setStart(Date start) {
		this.start = start;
	}

	public void setAppointments(Patient patient) {
		this.patient = patient;
	}
	
}
