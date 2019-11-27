package soaplombokinheritance.web_service;

import java.util.List;

import javax.ejb.EJB;
import javax.jws.WebService;

import soaplombokinheritance.domain.concrete.Employee;
import soaplombokinheritance.service.EmployeeService;

@WebService(serviceName = "EmployeeWebService", endpointInterface = "soaplombokinheritance.web_service.EmployeeWebService")
public class EmployeeWebServiceImpl implements EmployeeWebService {

	@EJB
	private EmployeeService empService;

	@Override
	public List<Employee> findAll() {
		return empService.findAll();
	}

	@Override
	public Employee findById(final Long id) {
		return empService.findById(id);
	}

	@Override
	public Employee saveOrUpdate(final Employee employee) {
		return empService.saveOrUpdate(employee);
	}

	@Override
	public Employee deleteById(final Long id) {
		return empService.deleteById(id);
	}
}
