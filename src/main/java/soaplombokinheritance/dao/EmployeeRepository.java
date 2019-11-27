package soaplombokinheritance.dao;

import java.util.List;
import java.util.Optional;

import javax.enterprise.context.Dependent;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import soaplombokinheritance.domain.concrete.Employee;

@Dependent
public class EmployeeRepository implements GenericRepository<Employee, Long> {
	
	@PersistenceContext
	private EntityManager em;

	@Override
	public List<Employee> findAll() {
		return em.createQuery("from Employee", Employee.class).getResultList();
	}

	@Override
	public Optional<Employee> findById(final Long id) {
		return Optional.of(em.find(Employee.class, id));
	}

	@Override
	public Employee saveOrUpdate(final Employee entity) {
		if (entity.getId() == null) {
			em.persist(entity);
			return entity;
		} else {
			return em.merge(entity);
		}
	}

	@Override
	public Employee deleteById(final Long id) {
		final Employee employee = findById(id).orElseThrow(() -> new RuntimeException());
		em.remove(employee);
		return employee;
	}

}
