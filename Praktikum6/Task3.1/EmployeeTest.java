// EmployeeTest.java
public class EmployeeTest {
    public static void main(String[] args) {
        Employee[] staff = new Employee[3];
        staff[0] = new Employee("Antonio Rossi", 2000000);
        staff[1] = new Employee("Maria Bianchi", 2500000);
        staff[2] = new Employee("Isabel Vidal", 3000000);

        // Mengurutkan karyawan berdasarkan gaji
        Sortable.shell_sort(staff);

        // Menampilkan hasil setelah sorting
        for (Employee employee : staff) {
            System.out.println(employee);
        }
    }
}
