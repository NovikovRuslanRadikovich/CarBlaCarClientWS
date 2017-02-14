package ru.itis.kpfu.dao;

import ru.itis.kpfu.model.Employee;

import java.util.List;

public interface EmployeeDao {

    void add(Employee employee);

    List<Employee> findByProject(Long carId);
}
