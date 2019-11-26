package soap_lombok_inheritance.web_service;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.WebParam.Mode;
import javax.xml.ws.Holder;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

import soap_lombok_inheritance.domain.concrete.Employee;

@WebService
public interface EmployeeWebService {
	
	static final String EMPLOYEE_REQUEST = "soap_lombok_inheritance.wrappers.EmployeeRequest";
	static final String EMPLOYEE_RESPONSE = "soap_lombok_inheritance.wrappers.EmployeeResponse";
	static final String EMPLOYEE = "employee";
	static final String LONG_REQUEST = "soap_lombok_inheritance.wrappers.LongRequest";

	@WebMethod
	@WebResult(name = "employees")
	@RequestWrapper(localName = "findAllEmployeesRequest", className = "soap_lombok_inheritance.wrappers.FindAllEmployeesRequest")
	@ResponseWrapper(localName = "findAllEmployeesResponse", className = "soap_lombok_inheritance.wrappers.FindAllEmployeesResponse")
	public List<Employee> findAll();
	
	@WebMethod
	@WebResult(name = EMPLOYEE)
	@RequestWrapper(localName = "findEmployeeByIdRequest", className = LONG_REQUEST)
	@ResponseWrapper(localName = "findEmployeeByIdResponse", className = EMPLOYEE_RESPONSE)
	public Employee findById(@WebParam(name= "id", mode = Mode.INOUT) Holder<Long> id);
	
	@WebMethod
	@WebResult(name = EMPLOYEE)
	@RequestWrapper(localName = "saveEmployeeRequest", className = EMPLOYEE_REQUEST)
	@ResponseWrapper(localName = "saveEmployeeResponse", className = EMPLOYEE_RESPONSE)
	public Employee saveOrUpdate(@WebParam(name = "employee", mode = Mode.INOUT) Holder<Employee> employee);
	
	@WebMethod
	@WebResult(name = EMPLOYEE)
	@RequestWrapper(localName = "deleteEmployeeByIdRequest", className = LONG_REQUEST)
	@ResponseWrapper(localName = "deleteEmployeeByIdResponse", className = EMPLOYEE_RESPONSE)
	public Employee deleteById(@WebParam(name = "id", mode = Mode.INOUT) Holder<Long> id);
}
