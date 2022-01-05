package sec05.exam07_andthen_compose;


public class Member {
    private String name;
    private String id;
    private Address address;

    public Member(String _name, String _id, Address _address){
        this.name = _name;
        this.id = _id;
        this.address = _address;
    }

    public Address getAddress() {
        return address;
    }

    public String getId() {
        return id;
    }
    
    public String getName() {
        return name;
    }
}
