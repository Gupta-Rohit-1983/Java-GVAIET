package com.collection.set.assignment;

public class Movie implements Comparable<Movie> {

    private int id;
    private String name;
    private String leadActor;

    public Movie() {
    }

    public Movie(int id, String name, String leadActor) {
        this.id = id;
        this.name = name;
        this.leadActor = leadActor;
    }

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

    public String getLeadActor() {
        return leadActor;
    }

    public void setLeadActor(String leadActor) {
        this.leadActor = leadActor;
    }

    @Override
    public String toString() {
        return "Movie [id=" + id + ", name=" + name + ", leadActor=" + leadActor + "]";
    }

    @Override
    public int compareTo(Movie o) {
        return this.name.compareTo(o.name);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        } else if (this.getClass() != obj.getClass()) {
            return false;
        }

        Movie temp = (Movie) obj;

        return (temp.getId() == this.getId() && temp.name.equalsIgnoreCase(this.name)
                && temp.leadActor.equalsIgnoreCase(this.leadActor));
    }

    @Override
    public int hashCode() {
        int hash = 13;
        hash = hash * 17 + id;
        hash = hash * 17 + name.toLowerCase().hashCode();
        hash = hash * 17 + leadActor.toLowerCase().hashCode();

        return hash;
    }

}
