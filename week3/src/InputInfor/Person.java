package InputInfor;

public class Person {
    public String name;
    public String address;
    public Double salary;

    public Person() {
    }

    public Person(String name, String address, Double salary) {
        this.name = name;
        this.address = address;
        this.salary = salary;
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

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Name: "+name +"\nAddress: "+address+"\nSalary: "+salary+"\n";
    }

    

}
