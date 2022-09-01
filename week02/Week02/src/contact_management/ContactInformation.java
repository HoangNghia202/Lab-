package contact_management;



public class ContactInformation {
    public int id;
    public String fullName;
    public String firstName;
    public String lastName;
    public String group, address;
    public String phone;

    public ContactInformation() {
    }

    public ContactInformation(int id, String fullName, String firstName, String lastName, String group, String address, String phone) {
        this.id = id;
        this.fullName = fullName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.address = address;
        this.phone = phone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        // return "%-15s%-15s%-15s%-15s%-15s%-15s", fullName, firstName, lastName,group,phone;
        return id+"\t\t"+fullName+"\t\t"+firstName+"\t\t\t"+lastName+"\t\t\t"+group+"\t\t"+address+"\t\t"+phone;
    }

    

}
