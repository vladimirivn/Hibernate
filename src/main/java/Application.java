import dao.CityDao;
import dao.EmployeeDao;
import dao.impl.CityDaoImpl;
import dao.impl.EmployeeDaoImpl;
import model.City;
import model.Employee;


public class Application {
    private static final EmployeeDao EMPLOYEE_DAO = new EmployeeDaoImpl();
    private static final CityDao CITY_DAO = new CityDaoImpl();

    public static void main(String[] args) {

 /*
        Employee employee = new Employee("Vladimir", "Ivanenko", "Male", 49, 1);
        EMPLOYEE_DAO.create(employee);
        EMPLOYEE_DAO.readAll().forEach(System.out::println);

        System.out.println(EMPLOYEE_DAO.readById(1));

        EMPLOYEE_DAO.readAll().forEach(System.out::println);

        Employee employeeUpdate = new Employee(15,"Vlad", "Iv", "Male", 9, 1);
        EMPLOYEE_DAO.update(employeeUpdate);
        EMPLOYEE_DAO.readAll().forEach(System.out::println);

        EMPLOYEE_DAO.delete(employeeUpdate);
        EMPLOYEE_DAO.readAll().forEach(System.out::println);

  */

        City newCity = new City("NEW VASYUKI");
        CITY_DAO.create(newCity);
        CITY_DAO.readAll().forEach(System.out::println);

        Employee newPeople = new Employee("Ostap", "Bender", "Male", 30, newCity);
        EMPLOYEE_DAO.create(newPeople);
        EMPLOYEE_DAO.readAll().forEach(System.out::println);

        System.out.println(CITY_DAO.readById(8));

        CITY_DAO.delete(CITY_DAO.readById(newCity.getCityId()));
        CITY_DAO.readAll().forEach(System.out::println);
        EMPLOYEE_DAO.readAll().forEach(System.out::println);

    }

}
