package com.newag.www.newag;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "tbl_patient")
public class Patient {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String gender;
    private String adress;

	private String telecom;
    private String generalPracticioner;
    private String vorname;
    private String nachname;
    private Date date;
    private String diagnose;
    private String fhirId;
    
    @OneToMany(targetEntity=Appointment.class, cascade=CascadeType.ALL)
    private List appointmentlist;

    
    public List getAppointmentlist() {
		return appointmentlist;
	}

	public void setAppointmentlist(List appointmentlist) {
		this.appointmentlist = appointmentlist;
	}
	
    public Patient() {
    }

    public Patient(String vorname, String nachname, String diagnose) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.diagnose = diagnose;
        this.date = new Date();
    }

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public String getTelecom() {
		return telecom;
	}

	public void setTelecom(String telecom) {
		this.telecom = telecom;
	}

	public String getGeneralPracticioner() {
		return generalPracticioner;
	}

	public void setGeneralPracticioner(String generalPracticioner) {
		this.generalPracticioner = generalPracticioner;
	}

	public String getVorname() {
		return vorname;
	}

	public void setVorname(String vorname) {
		this.vorname = vorname;
	}

	public String getNachname() {
		return nachname;
	}

	public void setNachname(String nachname) {
		this.nachname = nachname;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getDiagnose() {
		return diagnose;
	}

	public void setDiagnose(String diagnose) {
		this.diagnose = diagnose;
	}

	public String getFhirId() {
		return fhirId;
	}

	public void setFhirId(String fhirId) {
		this.fhirId = fhirId;
	}
    
    
}
