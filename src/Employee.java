public class Employee {

    private int id;
    private String firstName;
    private String lastName;
    private int salary;

    public void setId(int idNumber) {
        id = idNumber;
    }
    public int getId(){
        return id;
    }

    public void setFirstName(String firstname) {
        firstName = firstname;
    }
    public String getFirstName(){
        return firstName;
    }

    public void setLastName(String lastname) {
        lastName = lastname;
    }

    public String getLastName() {
        return lastName;
    }
}
