package BTR_Project_Using_Jdbc;

public class Bus {
    private int busNo;
    private String location;
    private boolean ac;
    private int capacity;

    Bus(int busNo, String location,  boolean ac, int capacity){
        this.busNo = busNo;
        this.location = location;
        this.ac = ac;
        this.capacity = capacity;
    }

    public int getBusNo(){
        return busNo;
    }
    public String getLocation(){
        return location;
    }

    public boolean isAc() {
        return ac;
    }

    public int getCapacity() {
        return capacity;
    }
}

