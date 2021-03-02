public class Main {
        public static void main(String[] args) {

            Employee employee1 = new Employee();

            // id
            employee1.setId(4567456);
            System.out.println(employee1.getId());

            // first name, last name, full name
            employee1.setFirstName("Anna");
            System.out.println(employee1.getFirstName());

            employee1.setLastName("Fong");
            System.out.println(employee1.getLastName());

            System.out.println(employee1.getName());

            // monthly salary, annual salary
            employee1.setSalary(3000);
            System.out.println(employee1.getSalary());

            System.out.println(employee1.getAnnualSalary());

            // raised salary (one month)
            employee1.setRaiseSalary(5);
            System.out.println(employee1.getRaiseSalary());


        }
}

