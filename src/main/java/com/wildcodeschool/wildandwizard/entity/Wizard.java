package com.wildcodeschool.wildandwizard.entity;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;

@Entity
public class Wizard {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    private Date birthday;
    private String birthPlace;
    private String biography;
    private boolean muggle;



    // TODO : Modifier l'entité Wizard afin d'y ajouter le code nécessaire
    //  à la création de sa relation avec une école : School school
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.REFRESH, optional = true)
    @JoinColumn(name="school_id", nullable=true)
    private School school;

    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
        this.school = school;
    }




    public Wizard() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getBirthPlace() {
        return birthPlace;
    }

    public void setBirthPlace(String birthPlace) {
        this.birthPlace = birthPlace;
    }

    public String getBiography() {
        return biography;
    }

    public void setBiography(String biography) {
        this.biography = biography;
    }

    public boolean isMuggle() {
        return muggle;
    }

    public void setMuggle(boolean muggle) {
        this.muggle = muggle;
    }

}