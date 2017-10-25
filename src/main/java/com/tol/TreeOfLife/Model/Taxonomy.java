package com.tol.TreeOfLife.Model;

import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import javax.persistence.*;

@Entity
@EnableJpaRepositories
@Table(name = "taxonomy")
public class Taxonomy {

    @Column(name = "domain")
    private String domain;

    @Column(name = "kingdom")
    private String kingdom;

    @Column(name = "phylum")
    private String phylum;

    @Column(name = "class_")
    private String class_;

    @Column(name = "order_")
    private String order_;

    @Column(name = "family")
    private String family;

    @Id
    @Column(name = "genus_species", nullable = false)
    private String genus_species;

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

    public String getClass_() {
        return class_;
    }

    public void setClass_(String class_) {
        this.class_ = class_;
    }

    public String getOrder_() {
        return order_;
    }

    public void setOrder_(String order_) {
        this.order_ = order_;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public String getGenus_species() {
        return genus_species;
    }

    public void setGenus_species(String genus_species) {
        this.genus_species = genus_species;
    }
}
