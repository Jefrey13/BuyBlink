package com.zuri.BuyBlink.entity;

import jakarta.persistence.*;

@Entity
public class Category {
    public static  final String c_name ="name";
    public static final String c_validity = "validity";
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(length = 100)
    private String name;
    @Column(length = 300)
    private String description;

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isValidity() {
        return validity;
    }

    public void setValidity(boolean validity) {
        this.validity = validity;
    }

    public SavedDocument getPhoto() {
        return photo;
    }

    public void setPhoto(SavedDocument photo) {
        this.photo = photo;
    }

    public String getValidityString() {
        return validityString;
    }

    public void setValidityString(String validityString) {
        this.validityString = validityString;
    }

    @Column
    private boolean validity;
    @OneToOne
    private SavedDocument photo;
    @Transient
    private String validityString;

}
