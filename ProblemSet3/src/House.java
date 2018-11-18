public class House {
    private String address;
    private String type;
    private double price;
    private Person owner;

    public String getAddress() {
        return address;
    }

    public String getType(){
        return type;
    }


    public double getPrice() {
        return price;
    }

    public Person getOwner() {
        return owner;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }

    public House(){
        this("No Address Specified", "No Type Specified", 0.0, new Person("No owner specified"));
    }

    public House(String address, String type, double price, Person owner){
        setAddress(address);
        setType(type);
        setPrice(price);
        setOwner(owner);
    }
    public String toString(){
        return "Address: " + getAddress() + "\nType: " + getType() + "\nPrice: " + getPrice() + "\nOwner: " + getOwner();
    }



}
