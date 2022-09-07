package demo.boot.service;

import java.util.ArrayList;

import demo.boot.model.Employee;

public interface EmpService {
    ArrayList<Employee> findAllEmployee();
    Employee findAllEmployeeByID(long id);
    Employee addEmployee(Employee emp);
    void deleteAllData();
}