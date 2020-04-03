package HashTable.EmployeeImportance_690;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Employee e3 = new Employee();
        e3.id = 3;
        e3.importance = 3;
        e3.subordinates = new ArrayList<>();

        Employee e2 = new Employee();
        e2.id = 2;
        e2.importance = 3;
        e2.subordinates = new ArrayList<>();

        Employee e1 = new Employee();
        e1.id = 1;
        e1.importance = 5;
        List<Integer> tmp = new ArrayList<>();
        tmp.add(2);
        tmp.add(3);
        e1.subordinates = tmp;

        List<Employee> employees = new ArrayList<>();
        employees.add(e1);
        employees.add(e2);
        employees.add(e3);

        Solution s = new Solution();
        System.out.println(s.getImportance(employees, 1));
    }
}
