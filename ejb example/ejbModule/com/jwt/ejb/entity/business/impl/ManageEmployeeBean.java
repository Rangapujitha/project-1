package com.jwt.ejb.business;
 
import javax.ejb.Remote;
 
import com.jwt.ejb.entity.Employee;
 
@Remote
public interface EmployeeRemote {
    public boolean addEmployee(Employee employee);
 
}