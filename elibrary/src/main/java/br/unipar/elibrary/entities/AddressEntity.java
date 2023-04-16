package br.unipar.elibrary.entities;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class AddressEntity {
    
    private Long id;
    private String street;
    
    private CityEntity city;
    private Set<AddressZipCodeEntity> zipCodes = new HashSet<>();
    private Set<AddressDistrictEntity> districts = new HashSet<>();
    private Set<AddressDetailEntity> addressDetails = new HashSet<>();
  
    public AddressEntity() { }

    public AddressEntity(Long id, String street, CityEntity city) {
        this.id = id;
        this.street = street;
        this.city = city;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public CityEntity getCity() {
        return city;
    }

    public void setCity(CityEntity city) {
        this.city = city;
    }

    public Set<AddressZipCodeEntity> getZipCodes() {
        return zipCodes;
    }

    public void addZipCodes(AddressZipCodeEntity zipCode) {
        this.zipCodes.add(zipCode);
    }

    public Set<AddressDistrictEntity> getDistricts() {
        return districts;
    }

    public void addDistrict(AddressDistrictEntity district) {
        this.districts.add(district);
    }

    public Set<AddressDetailEntity> getAddressDetails() {
        return addressDetails;
    }

    public void addAddressDetails(AddressDetailEntity addressDetail) {
        this.addressDetails.add(addressDetail);
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + Objects.hashCode(this.id);
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
        final AddressEntity other = (AddressEntity) obj;
        return Objects.equals(this.id, other.id);
    }
}
