package soaplombokinheritance.wrappers;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "findEmployeeByIdRequest")
public class LongRequest {

	@XmlElement(required = true)
	protected Long id;

	public Long getId() {
		return id;
	}

	public void setId(final Long id) {
		this.id = id;
	}

}
