public class Main {
        public static void main(String[] args) {

            Employee employee1 = new Employee(0, "", "", 0, 0);

            employee1.setId(64821357);
            employee1.setFirstName("Anna");
            employee1.setLastName("Fong");;
            employee1.setSalary(5000);
            employee1.setRaiseSalary(5);

            System.out.println(employee1);


            /*
            System.out.println(employee1.getId());
            System.out.println(employee1.getFirstName());
            System.out.println(employee1.getLastName());
            System.out.println(employee1.getName());
            System.out.println(employee1.getSalary());
            System.out.println(employee1.getAnnualSalary());
            System.out.println(employee1.getRaiseSalary());
            */


        }
}

