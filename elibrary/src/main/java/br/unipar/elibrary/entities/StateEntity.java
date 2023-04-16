package br.unipar.elibrary.entities;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class StateEntity {
    
    private Long id;
    private String name;
    
    private CountryEntity country;
    private Set<CityEntity> cities = new HashSet<>();
    
    public StateEntity() { }

    public StateEntity(Long id, String name, CountryEntity country) {
        this.id = id;
        this.name = name;
        this.country = country;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CountryEntity getCountry() {
        return country;
    }

    public void setCountry(CountryEntity country) {
        this.country = country;
    }

    public Set<CityEntity> getCities() {
        return cities;
    }

    public void addCities(CityEntity city) {
        this.cities.add(city);
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final StateEntity other = (StateEntity) obj;
        return Objects.equals(this.id, other.id);
    }
}
