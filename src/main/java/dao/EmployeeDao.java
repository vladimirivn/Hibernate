package dao;

import model.Employee;

import java.util.List;

public interface EmployeeDao {

    void create(Employee employee);
    void update(Employee employee);
    void delete(Employee employee);
    Employee readById(int id);
    List<Employee> readAll();
}