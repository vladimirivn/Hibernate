import dao.EmployeeDao;
import dao.impl.EmployeeDaoImpl;
import model.Employee;


public class Application {
    private static final EmployeeDao EMPLOYEE_DAO = new EmployeeDaoImpl();
    public static void main(String[] args) {

        Employee employee = new Employee("Vladimir", "Ivanenko", "Male", 49, 1);
        EMPLOYEE_DAO.create(employee);
        System.out.println(EMPLOYEE_DAO.readById(19));

        EMPLOYEE_DAO.readAll().forEach(System.out::println);

        Employee employeeUpdate = new Employee(20,"Sergey", "Ivanenko", "Male", 55, 1);
        EMPLOYEE_DAO.update(employeeUpdate);

        EMPLOYEE_DAO.readAll().forEach(System.out::println);

        EMPLOYEE_DAO.delete(employeeUpdate);
        EMPLOYEE_DAO.readAll().forEach(System.out::println);
    }

}
