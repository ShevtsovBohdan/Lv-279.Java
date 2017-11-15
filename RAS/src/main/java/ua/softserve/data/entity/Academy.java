package ua.softserve.data.entity;


import javax.validation.constraints.NotNull;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "academy")
public class Academy {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int academy_id;

    @ManyToOne
    @JoinColumn(name="city_id")
    private City city;

    @ManyToOne
    @JoinColumn(name = "direction_id")
    private Directions directions;

    @ManyToOne
    @JoinColumn(name = "technology_id")
    private Technologies technologies;


    @ManyToOne
    @JoinColumn(name = "stage_id")
    private Academy_Stages academy_stages;

    @NotNull
    @Column(name = "crm_group")
    private int crm_group;

    @NotNull
    @Column(name = "name")
    private String name;

    @NotNull
    @Column(name = "start_date")
    private Timestamp start_date;//need fix

    @NotNull
    @Column(name = "end_date")
    private Timestamp end_date;//need fix

    @NotNull
    @Column(name = "free")
    private int free;

    @NotNull
    @Column(name = "status")
    private int status;

    @NotNull
    @Column(name = "has_tech")
    private int has_tech;

    @NotNull
    @Column(name = "has_eng")
    private int has_eng;

    @NotNull
    @Column(name = "has_first")
    private int has_first;

    @NotNull
    @Column(name = "not_synchronized")
    private int not_synchronized;

    public Academy() {}

    public int getAcademy_id() {
        return academy_id;
    }

    public void setAcademy_id(int academy_id) {
        this.academy_id = academy_id;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city_id) {
        this.city = city_id;
    }

    public Directions getDirections() {
        return directions;
    }

    public void setDirections(Directions directionsSet) {
        this.directions = directionsSet;
    }

    public Technologies getTechnologies() {
        return technologies;
    }

    public void setTechnologies(Technologies technologiesSet) {
        this.technologies = technologiesSet;
    }

    public Academy_Stages getAcademy_stages() {
        return academy_stages;
    }

    public void setAcademy_stages(Academy_Stages academy_stagesSet) {
        this.academy_stages = academy_stagesSet;
    }

    public int getCrm_group() {
        return crm_group;
    }

    public void setCrm_group(int crm_group) {
        this.crm_group = crm_group;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Timestamp getStart_date() {
        return start_date;
    }

    public void setStart_date(Timestamp start_date) {
        this.start_date = start_date;
    }

    public Timestamp getEnd_date() {
        return end_date;
    }

    public void setEnd_date(Timestamp end_date) {
        this.end_date = end_date;
    }

    public int getFree() {
        return free;
    }

    public void setFree(int free) {
        this.free = free;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getHas_tech() {
        return has_tech;
    }

    public void setHas_tech(int has_tech) {
        this.has_tech = has_tech;
    }

    public int getHas_eng() {
        return has_eng;
    }

    public void setHas_eng(int has_eng) {
        this.has_eng = has_eng;
    }

    public int getHas_first() {
        return has_first;
    }

    public void setHas_first(int has_first) {
        this.has_first = has_first;
    }

    public int getNot_synchronized() {
        return not_synchronized;
    }

    public void setNot_synchronized(int not_synchronized) {
        this.not_synchronized = not_synchronized;
    }

    @Override
    public String toString() {
        return "Academy{" +
                "academy_id=" + academy_id +
                ", city_id=" + city.getCity_id() +
                ", directionsSet=" + directions.getName() +
                ", technologiesSet=" + technologies.getName() +
                ", academy_stagesSet=" + academy_stages.getName() +
                ", crm_group=" + crm_group +
                ", name='" + name + '\'' +
                ", start_date=" + start_date.toLocalDateTime().toLocalDate() +
                ", end_date=" + end_date.toLocalDateTime().toLocalDate() +
                ", free=" + free +
                ", status=" + status +
                ", has_tech=" + has_tech +
                ", has_eng=" + has_eng +
                ", has_first=" + has_first +
                ", not_synchronized=" + not_synchronized +
                '}';
    }
}
