package com.example.managersangoushaheroes.Entity;

import javax.persistence.*;

@Entity
@Table(name = "heroinfo")
public class HeroesInfoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "name", columnDefinition = "varchar(50)")
    private String name;
    @Column(name = "faction", columnDefinition = "varchar(50)")
    private String faction;
    @Column(name = "hearth", columnDefinition = "varchar(50)")
    private String hearth;
    @Column(name = "skill1Name", columnDefinition = "varchar(50)")
    private String skill1Name;
    @Column(name = "skill2Name", columnDefinition = "varchar(50)")
    private String skill2Name;
    @Column(name = "skill3Name", columnDefinition = "varchar(50)")
    private String skill3Name;
    @Column(name = "skill4Name", columnDefinition = "varchar(50)")
    private String skill4Name;
    @Column(name = "skill1Info", columnDefinition = "text")
    private String skill1info;
    @Column(name = "skill2Info", columnDefinition = "text")
    private String skill2info;
    @Column(name = "skill3Info", columnDefinition = "text")
    private String skill3info;
    @Column(name = "skill4Info", columnDefinition = "text")
    private String skill4info;
    @Column(name = "image", columnDefinition = "varchar(255)")
    private String image;
    @Column(name = "status", columnDefinition = "varchar(255)")
    private String status;
    @Column(name = "url", columnDefinition = "text")
    private String url;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFaction() {
        return faction;
    }

    public void setFaction(String faction) {
        this.faction = faction;
    }

    public String getHearth() {
        return hearth;
    }

    public void setHearth(String hearth) {
        this.hearth = hearth;
    }

    public String getSkill1Name() {
        return skill1Name;
    }

    public void setSkill1Name(String skill1Name) {
        this.skill1Name = skill1Name;
    }

    public String getSkill2Name() {
        return skill2Name;
    }

    public void setSkill2Name(String skill2Name) {
        this.skill2Name = skill2Name;
    }

    public String getSkill3Name() {
        return skill3Name;
    }

    public void setSkill3Name(String skill3Name) {
        this.skill3Name = skill3Name;
    }

    public String getSkill4Name() {
        return skill4Name;
    }

    public void setSkill4Name(String skill4Name) {
        this.skill4Name = skill4Name;
    }

    public String getSkill1info() {
        return skill1info;
    }

    public void setSkill1info(String skill1info) {
        this.skill1info = skill1info;
    }

    public String getSkill2info() {
        return skill2info;
    }

    public void setSkill2info(String skill2info) {
        this.skill2info = skill2info;
    }

    public String getSkill3info() {
        return skill3info;
    }

    public void setSkill3info(String skill3info) {
        this.skill3info = skill3info;
    }

    public String getSkill4info() {
        return skill4info;
    }

    public void setSkill4info(String skill4info) {
        this.skill4info = skill4info;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
