package soaplombokinheritance.domain.concrete;

import javax.persistence.Entity;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import soaplombokinheritance.domain.BaseEntity;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode(callSuper = false)
@Builder

@XmlType(name = "employee")
@XmlAccessorType(XmlAccessType.FIELD)
@Entity
public class Employee extends BaseEntity {

	@XmlElement(required = true)
	@NotNull(message = "first name cannot be empty")
	@NotEmpty(message = "first name cannot be empty")
	private String firstName;
	@XmlElement(required = true)
	@NotNull(message = "last name cannot be empty")
	@NotEmpty(message = "last name cannot be empty")
	private String lastName;
}
