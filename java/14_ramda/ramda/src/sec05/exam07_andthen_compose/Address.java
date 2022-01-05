package sec05.exam07_andthen_compose;

public class Address {
    private String country;
    private String city;

    public Address(String _country, String _city){
        this.country = _country;
        this.city = _city;
    }
    public String getCountry() {
        return country;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public void setCountry(String country) {
        this.country = country;
    }

}
