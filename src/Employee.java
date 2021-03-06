import org.w3c.dom.ls.LSOutput;

public class Employee {

    private int id;
    private String firstName;
    private String lastName;
    private int salary;           // original salary
    private int raiseSalary;      // final raised salary

    Employee(int id, String firstName, String lastName, int salary, int raiseSalary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.raiseSalary = raiseSalary;
    }


        public void setId(int idNumber) {
            id = idNumber;
        }
        /*
        public int getId() {
            return id;
        }
        */

        public void setFirstName(String firstname) {
            firstName = firstname;
        }
        /*
        public String getFirstName() {
            return firstName;
        }
        */

        public void setLastName(String lastname) {
            lastName = lastname;
        }
        /*
        public String getLastName() {
            return lastName;
        }
        */

        public String getName() {
            String getName = firstName + " " + lastName;
            return getName;
        }

        public void setSalary(int Salary) {
            if(Salary < 0) {
                salary = 0;
            } else {
                salary = Salary;
            }
        }
        /*
        public int getSalary() {
            return salary;
        }
        */

        public int getAnnualSalary() {
            int getAnnualSalary = salary * 12;
            return getAnnualSalary;
        }

        public void setRaiseSalary(int percent) {
            int Percent = percent;
            raiseSalary = ((salary * Percent)/100 + salary);
        }
        /*
        public int getRaiseSalary() {
        return raiseSalary;
        }
        */

        public String toString() {
            return "Employee\nID: " + id + "\nFirst Name: " + firstName + "\nLast Name: " +
                    lastName + "\nFull Name: " + getName() + "\nMonthly Salary: $" + salary + "\nAnnual Salary: $" +
                    getAnnualSalary() + "\nRaised Monthly Salary: $" + raiseSalary;
        }

}

