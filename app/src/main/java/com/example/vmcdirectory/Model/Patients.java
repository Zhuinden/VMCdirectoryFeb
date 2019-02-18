package com.example.vmcdirectory.Model;

public class Patients {

    public int id;
    public String patient,rn,secretary,room_phone,case_manager,pharmacist,nutritionist,wound;

    public Patients(int id, String patient, String rn, String secretary, String room_phone, String case_manager, String pharmacist, String nutritionist, String wound) {
        this.id = id;
        this.patient = patient;
        this.rn = rn;
        this.secretary = secretary;
        this.room_phone = room_phone;
        this.case_manager = case_manager;
        this.pharmacist = pharmacist;
        this.nutritionist = nutritionist;
        this.wound = wound;
    }

    public Patients() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPatient() {
        return patient;
    }

    public void setPatient(String patient) {
        this.patient = patient;
    }

    public String getRn() {
        return rn;
    }

    public void setRn(String rn) {
        this.rn = rn;
    }

    public String getSecretary() {
        return secretary;
    }

    public void setSecretary(String secretary) {
        this.secretary = secretary;
    }

    public String getRoom_phone() {
        return room_phone;
    }

    public void setRoom_phone(String room_phone) {
        this.room_phone = room_phone;
    }

    public String getCase_manager() {
        return case_manager;
    }

    public void setCase_manager(String case_manager) {
        this.case_manager = case_manager;
    }

    public String getPharmacist() {
        return pharmacist;
    }

    public void setPharmacist(String pharmacist) {
        this.pharmacist = pharmacist;
    }

    public String getNutritionist() {
        return nutritionist;
    }

    public void setNutritionist(String nutritionist) {
        this.nutritionist = nutritionist;
    }

    public String getWound() {
        return wound;
    }

    public void setWound(String wound) {
        this.wound = wound;
    }
}
