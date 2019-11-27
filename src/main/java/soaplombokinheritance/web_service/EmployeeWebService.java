package soaplombokinheritance.web_service;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlElement;

import soaplombokinheritance.domain.concrete.Employee;

@WebService
public interface EmployeeWebService {
	
	static final String ID = "id";
	static final String EMPLOYEE_REQUEST = "soaplombokonheritance.wrappers.EmployeeRequest";
	static final String EMPLOYEE_RESPONSE = "soaplombokinheritance.wrappers.EmployeeResponse";
	static final String EMPLOYEE = "employee";
	static final String EMPLOYEES = "employees";
	static final String LONG_REQUEST = "soaplombokinheritance.wrappers.LongRequest";

	@WebMethod
	@WebResult(name = EMPLOYEES)
//	@RequestWrapper(localName = "findAllEmployeesRequest", className = "soaplombokinheritance.wrappers.FindAllEmployeesRequest")
//	@ResponseWrapper(localName = "findAllEmployeesResponse", className = "soaplombokinheritance.wrappers.FindAllEmployeesResponse")
	public List<Employee> findAll();
	
	@WebMethod
	@WebResult(name = EMPLOYEE)
//	@RequestWrapper(localName = "findEmployeeByIdRequest", className = LONG_REQUEST)
//	@ResponseWrapper(localName = "findEmployeeByIdResponse", className = EMPLOYEE_RESPONSE)
	public Employee findById(@WebParam(name= ID) @XmlElement(required = true) Long id);
	
	@WebMethod
	@WebResult(name = EMPLOYEE)
//	@RequestWrapper(localName = "saveEmployeeRequest", className = EMPLOYEE_REQUEST)
//	@ResponseWrapper(localName = "saveEmployeeResponse", className = EMPLOYEE_RESPONSE)
	public Employee saveOrUpdate(@WebParam(name = EMPLOYEE) @XmlElement(required = true) Employee employee);
	
	@WebMethod
	@WebResult(name = EMPLOYEE)
//	@RequestWrapper(localName = "deleteEmployeeByIdRequest", className = LONG_REQUEST)
//	@ResponseWrapper(localName = "deleteEmployeeByIdResponse", className = EMPLOYEE_RESPONSE)
	public Employee deleteById(@WebParam(name = EMPLOYEE) @XmlElement(required = true) Long id);
}
