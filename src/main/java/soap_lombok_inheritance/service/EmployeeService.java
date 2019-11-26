package soap_lombok_inheritance.service;

import java.util.List;

import javax.ejb.Local;

import soap_lombok_inheritance.domain.concrete.Employee;

@Local
public interface EmployeeService {
	public List<Employee> findAll();
	public Employee findById(Long id);
	public Employee saveOrUpdate(Employee employee);
	public Employee deleteById(Long id);
}
