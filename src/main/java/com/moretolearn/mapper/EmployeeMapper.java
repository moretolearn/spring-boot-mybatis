package com.moretolearn.mapper;

import org.apache.ibatis.annotations.*;

import com.moretolearn.entity.Employee;

import java.util.List;

@Mapper
public interface EmployeeMapper {

    // CREATE
    @Insert("""
        INSERT INTO employee(name, salary)
        VALUES (#{name}, #{salary})
    """)
    Integer save(Employee employee);

    // READ by ID
    @Select("SELECT * FROM employee WHERE id = #{id}")
    Employee findById(Long id);

    // READ ALL
    @Select("SELECT * FROM employee")
    List<Employee> findAll();

    // UPDATE
    @Update("""
        UPDATE employee
        SET name = #{name}, salary = #{salary}
        WHERE id = #{id}
    """)
    int update(Employee employee);

    // DELETE
    @Delete("DELETE FROM employee WHERE id = #{id}")
    int deleteById(Long id);
}
