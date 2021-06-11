package model;

public class Address {
    private int id;
    private String countryCode;
    private String postcode;
    private String city;
    private String street;
    private String buildingNumber;

    public Address(int id, String countryCode, String postcode, String city, String street, String buildingNumber){
        this.id = id;
        this.countryCode = countryCode;
        this.postcode = postcode;
        this.city = city;
        this.street = street;
        this.buildingNumber = buildingNumber;
    }

    public Address () {

    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getBuildingNumber() {
        return buildingNumber;
    }

    public void setBuildingNumber(String buildingNumber) {
        this.buildingNumber = buildingNumber;
    }
}
