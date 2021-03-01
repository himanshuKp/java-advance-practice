package in.himanshukandpal.objects;

public class ElectricityBill {
    private int id;
    private String name;
    private String address;

    public ElectricityBill() {
    }

    public ElectricityBill(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "ElectricityBill{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ElectricityBill that = (ElectricityBill) o;

        return id == that.id;
    }

    @Override
    public int hashCode() {
        return id;
    }
}
