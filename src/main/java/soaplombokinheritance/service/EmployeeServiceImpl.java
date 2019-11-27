package soaplombokinheritance.service;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import soaplombokinheritance.dao.GenericRepository;
import soaplombokinheritance.domain.concrete.Employee;

@Stateless
public class EmployeeServiceImpl implements EmployeeService{
	
	@Inject
	private GenericRepository<Employee, Long> empRepo;

	@Override
	public List<Employee> findAll() {
		return empRepo.findAll();
	}

	@Override
	public Employee findById(final Long id) {
		return empRepo.findById(id).orElseThrow(() -> new RuntimeException());
	}

	@Override
	public Employee saveOrUpdate(final Employee employee) {
		return empRepo.saveOrUpdate(employee);
	}

	@Override
	public Employee deleteById(final Long id) {
		return empRepo.deleteById(id);
	}

}
