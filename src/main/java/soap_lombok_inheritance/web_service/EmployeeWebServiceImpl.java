package soap_lombok_inheritance.web_service;

import java.util.List;

import javax.ejb.EJB;
import javax.jws.WebService;
import javax.xml.ws.Holder;

import soap_lombok_inheritance.domain.concrete.Employee;
import soap_lombok_inheritance.service.EmployeeService;

@WebService(serviceName = "EmployeeWebService", endpointInterface = "soap_lombok_inheritance.web_service.EmployeeWebService")
public class EmployeeWebServiceImpl implements EmployeeWebService {

	@EJB
	private EmployeeService empService;

	@Override
	public List<Employee> findAll() {
		return empService.findAll();
	}

	@Override
	public Employee findById(final Holder<Long> id) {
		return empService.findById(id.value);
	}

	@Override
	public Employee saveOrUpdate(final Holder<Employee> employee) {
		return empService.saveOrUpdate(employee.value);
	}

	@Override
	public Employee deleteById(final Holder<Long> id) {
		return empService.deleteById(id.value);
	}
}
