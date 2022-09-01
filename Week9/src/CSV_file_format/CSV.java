package CSV_file_format;

public class CSV {
    public String ID;
    public String Name;
    public String Email;
    public String Phone;
    public String Address;
    public CSV() {
    }
    public CSV(String iD, String name, String email, String phone, String address) {
        ID = iD;
        Name = name;
        Email = email;
        Phone = phone;
        Address = address;
    }
    public String getID() {
        return ID;
    }
    public void setID(String iD) {
        ID = iD;
    }
    public String getName() {
        return Name;
    }
    public void setName(String name) {
        Name = name;
    }
    public String getEmail() {
        return Email;
    }
    public void setEmail(String email) {
        Email = email;
    }
    public String getPhone() {
        return Phone;
    }
    public void setPhone(String phone) {
        Phone = phone;
    }
    public String getAddress() {
        return Address;
    }
    public void setAddress(String address) {
        Address = address;
    }

    
}
