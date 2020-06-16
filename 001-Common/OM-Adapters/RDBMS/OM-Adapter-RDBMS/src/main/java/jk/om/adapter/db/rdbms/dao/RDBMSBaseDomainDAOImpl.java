package jk.om.adapter.db.rdbms.dao;

import java.util.Optional;

import org.apache.commons.beanutils.BeanUtils;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;

import jk.om.common.dao.AppCrudDAO;
import jk.om.common.domain.BaseDomain;

@NoRepositoryBean
public interface RDBMSBaseDomainDAOImpl<T extends BaseDomain, ID> extends CrudRepository<T, ID>, AppCrudDAO<T, ID> {

	default public T createDomainImplInstance() {
		return null;
	}

	default public T persistBaseDomain(T entity) throws Exception {

		T domainInstance = createDomainImplInstance();

		BeanUtils.copyProperties(domainInstance, entity);

		return save(domainInstance);
	}

	default public Iterable<T> persistAllBaseDomains(Iterable<T> entities) {
		return saveAll(entities);
	}

	default public Optional<T> getByIdBaseDomain(ID id) {
		return findById(id);
	}

}
