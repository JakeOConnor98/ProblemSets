public class Person {
    private String name;

    public Person(){
        this("Ted");
    }
    public Person(String name){
        setName(name);
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String toString(){
        return "" + getName();
    }
}
