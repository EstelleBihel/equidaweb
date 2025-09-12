package model;

public class Course {
    private int id;
    private String nom;
    private String dateCourse;

    public Course() {
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public String getDateCourse() {
        return dateCourse;
    }
    public void setDateCourse(String dateCourse) {
        this.dateCourse = dateCourse;
    }
}
