public class Location {
    public String address;
    public int pincode;
    public String City;
    public String State;
    public String Country;


    public Location(String city, String address, String country, int pincode, String state) {
        City = city;
        this.address = address;
        Country = country;
        this.pincode = pincode;
        State = state;
    }
}
