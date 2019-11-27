package soaplombokinheritance.wrappers;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

import soaplombokinheritance.domain.concrete.Employee;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "saveEmployeeResponse")
public class EmployeeResponse {

	protected Employee employee;

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(final Employee employee) {
		this.employee = employee;
	}

}
