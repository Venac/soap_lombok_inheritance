package soap_lombok_inheritance.domain;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString

@XmlAccessorType(XmlAccessType.FIELD)
@MappedSuperclass
public abstract class BaseEntity {

	@XmlAttribute(name = "id", required = false)
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
}
