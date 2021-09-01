package io.redbee.academy.persistence.jdbc.model;

public class Movie {
    private Integer id;
    private String title;
    private Integer year;
    private String creation_user;

    public Movie(Integer id, String title, Integer year, String creation_user) {
        this.id = id;
        this.title = title;
        this.year = year;
        this.creation_user = creation_user;
    }

    public String toString(){
        return "{" + "id: " + id + ", title: " + title + ", year: " + year +  ", creatiion_user: " + creation_user + "}";
    }
}
