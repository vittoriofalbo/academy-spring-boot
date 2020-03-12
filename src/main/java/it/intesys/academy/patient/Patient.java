package it.intesys.academy.patient;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import it.intesys.academy.examination.model.Examination;

@Entity
public class Patient {

    @Column(name = "BIRTHDATE")
    private LocalDate birthDate;
    @Column(name = "FIRSTNAME")
    private String firstName;
    @Column(name = "FISCALCODE")
    private String fiscalCode;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "LASTNAME")
    private String lastName;
    @OneToMany(mappedBy = "patientId", fetch = FetchType.EAGER)
    private List<Examination> examinations = new LinkedList<>();

    public Patient(Long id, String firstName, String lastName, LocalDate birthDate, String fiscalCode) {

        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.fiscalCode = fiscalCode;
    }

    public Patient() {

    }

    public LocalDate getBirthDate() {

        return birthDate;
    }

    public List<Examination> getExaminations() {

        return examinations;
    }

    public String getFirstName() {

        return firstName;
    }

    public String getFiscalCode() {

        return fiscalCode;
    }

    public Long getId() {

        return id;
    }

    public String getLastName() {

        return lastName;
    }

    public void setBirthDate(LocalDate birthDate) {

        this.birthDate = birthDate;
    }

    public void setExaminations(List<Examination> examinations) {

        this.examinations = examinations;
    }

    public void setFirstName(String firstName) {

        this.firstName = firstName;
    }

    public void setFiscalCode(String fiscalCode) {

        this.fiscalCode = fiscalCode;
    }

    public void setId(Long id) {

        this.id = id;
    }

    public void setLastName(String lastName) {

        this.lastName = lastName;
    }

    @Override
    public String toString() {

        return "Patient{" + "id=" + id + ", firstName='" + firstName + '\'' + ", lastName='" + lastName + '\'' + ", birthDate=" + birthDate + ", fiscalCode='" +
               fiscalCode + '\'' + '}';
    }

}
