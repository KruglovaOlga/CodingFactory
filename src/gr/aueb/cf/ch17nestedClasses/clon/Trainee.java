package gr.aueb.cf.ch17nestedClasses.clon;

import java.io.Serializable;
import java.util.Objects;

public class Trainee implements Cloneable, Serializable {
    private String name;
    private City city;
    private static final long serialVersionUID = 1L;
    private transient  int hashcode;

    public Trainee(){

    }

    public Trainee(String name, City city) {
        this.name = name;
        this.city = city;
    }

    //copy constructor
    public Trainee(Trainee trainee) {
        this.name = trainee.name;
        this.city = new City(trainee.getCity());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Trainee{" +
                "name='" + name + '\'' +
                ", city=" + city +
                '}';
    }

    @Override
    protected Trainee clone() throws CloneNotSupportedException {
        Trainee trainee = (Trainee) super.clone();
        City city = new City(this.getCity().getDescription());
        trainee.setCity(city);
        return trainee;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Trainee)) return false;
        Trainee trainee = (Trainee) o;
        return getName().equals(trainee.getName()) && getCity().equals(trainee.getCity());
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((city == null) ? 0 : city.hashCode());
        return result;
    }
}
