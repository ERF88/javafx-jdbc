package model.services;

import model.entities.Department;

import java.util.List;

public class DepartmentService {

    public List<Department> findAll() {
        return List.of(
                new Department(1, "Livros"),
                new Department(2, "Computers"),
                new Department(3, "Eletronics")
        );
    }

}
