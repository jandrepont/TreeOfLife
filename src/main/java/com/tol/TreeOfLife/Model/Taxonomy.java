package com.tol.TreeOfLife.Model;

import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import javax.persistence.*;

@Entity
@EnableJpaRepositories
@Table(name = "table")
public class Taxonomy {

    @Id
    @Column(name = "domain")
    private String domain;

    @Column(name = "kingdom")
    private String kingdom;

    @Column(name = "phylum")
    private String phylum;

    @Column(name = "class_")
    private float class_;

    @Column(name = "order")
    private String order;

    @Column(name = "family")
    private float family;

    @Column(name = "genus_species")
    private float genus_species;

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public String getKingdom() {
        return kingdom;
    }

    public void setKingdom(String kingdom) {
        this.kingdom = kingdom;
    }

    public String getPhylum() {
        return phylum;
    }

    public void setPhylum(String phylum) {
        this.phylum = phylum;
    }

    public float getClass_() {
        return class_;
    }

    public void setClass_(float class_) {
        this.class_ = class_;
    }

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }

    public float getFamily() {
        return family;
    }

    public void setFamily(float family) {
        this.family = family;
    }

    public float getGenus_species() {
        return genus_species;
    }

    public void setGenus_species(float genus_species) {
        this.genus_species = genus_species;
    }
}
