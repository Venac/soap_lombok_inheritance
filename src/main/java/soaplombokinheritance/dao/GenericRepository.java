package soaplombokinheritance.dao;

import java.util.List;
import java.util.Optional;

import soaplombokinheritance.domain.BaseEntity;

public interface GenericRepository<T extends BaseEntity, S> {
	public List<T> findAll();
	public Optional<T> findById(S id);
	public T saveOrUpdate(T entity);
	public T deleteById(S id);
}