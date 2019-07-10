package com.jwt.ejb.business.impl;
 
import com.jwt.ejb.business.EmployeeRemote;
import com.jwt.ejb.entity.Employee;
 
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
 
/**
 * Session Bean implementation class ManageEmployeeBean
 */
@Stateless
public class ManageEmployeeBean1 implements EmployeeRemote {
 
    @PersistenceContext(unitName = "EmpMgmtPU")
    private EntityManager entityManager;
 
    public ManageEmployeeBean1() {
 
    }
 
    public boolean addEmployee(Employee employee) {
        entityManager.persist(employee);
        return true;
    }
 
}