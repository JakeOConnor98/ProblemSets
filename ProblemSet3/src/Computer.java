public class Computer implements IDable {
    private String id;
    private String make;
    protected Memory memory;

    public Computer(){
        make = "Unspecified";
        memory = new Memory("Unspecified", 0);
    }
    public Computer(String make, String memType, int memSize){
        setMake(make);
        memory = new Memory(memType, memSize);
    }

    public String getId() {
        return id;
    }

    public String getMake() {
        return make;
    }

    public Memory getMemory() {
        return memory;
    }

    @Override
    public void setId(String id) {
        this.id = id;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setMemory(Memory memory) {
        this.memory = memory;
    }

    public String toString(){
        return "ID: " + getId() + "\nMemory Type: " + memory.getType() + "\nMemory Size: " + memory.getSize();
    }
}
