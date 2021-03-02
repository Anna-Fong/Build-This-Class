import org.w3c.dom.ls.LSOutput;

public class Employee {

    private int id;
    private String firstName;
    private String lastName;
    private int salary;
    private int raiseSalary;

        //id
        public void setId(int idNumber) {
            id = idNumber;
        }
        public int getId() {
            return id;
        }

        //first name
        public void setFirstName(String firstname) {
            firstName = firstname;
        }
        public String getFirstName() {
            return firstName;
        }

        //last name
        public void setLastName(String lastname) {
            lastName = lastname;
        }
        public String getLastName() {
            return lastName;
        }

        //full name
        public String getName() {
            String getName = firstName + " " + lastName;
            return getName;
        }

        //salary
        public void setSalary(int Salary) {
            if(Salary < 0) {
                salary = 0;
            } else {
                salary = Salary;
            }
        }
        public int getSalary() {
            return salary;
        }

        //annual salary
        public int getAnnualSalary() {
            int getAnnualSalary = salary * 12;
            return getAnnualSalary;
        }
        //raised salary (1 month)
        public void setRaiseSalary(int percent) {
            int Percent = percent;
            raiseSalary = ((salary * Percent)/100 + salary);
        }
        public int getRaiseSalary() {
            return raiseSalary;




        }
}

