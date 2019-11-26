package soap_lombok_inheritance.wrappers;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

import soap_lombok_inheritance.domain.concrete.Employee;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "findAllEmployeesResponse")
public class FindAllEmployeesResponse {

	protected List<Employee> employees;

	public List<Employee> getEmployees() {
		if (employees == null) {
			employees = new ArrayList<Employee>();
		}
		return this.employees;
	}
}
