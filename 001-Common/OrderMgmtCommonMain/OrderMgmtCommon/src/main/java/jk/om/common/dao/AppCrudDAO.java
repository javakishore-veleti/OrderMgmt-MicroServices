package jk.om.common.dao;

import java.util.Optional;

import org.springframework.data.repository.NoRepositoryBean;

import jk.om.common.domain.BaseDomain;

@NoRepositoryBean
public interface AppCrudDAO<T extends BaseDomain, ID> {

	/**
	 * Saves a given entity. Use the returned instance for further operations as the
	 * save operation might have changed the entity instance completely.
	 *
	 * @param entity must not be {@literal null}.
	 * @return the saved entity; will never be {@literal null}.
	 * @throws IllegalArgumentException in case the given {@literal entity} is
	 *                                  {@literal null}.
	 */
	default public T persistBaseDomain(T entity) throws Exception {
		return null;
	}

	/**
	 * Saves all given entities.
	 *
	 * @param entities must not be {@literal null} nor must it contain
	 *                 {@literal null}.
	 * @return the saved entities; will never be {@literal null}. The returned
	 *         {@literal Iterable} will have the same size as the
	 *         {@literal Iterable} passed as an argument.
	 * @throws IllegalArgumentException in case the given {@link Iterable entities}
	 *                                  or one of its entities is {@literal null}.
	 */
	default public Iterable<T> persistAllBaseDomains(Iterable<T> entities) throws Exception {
		return null;
	}

	/**
	 * Retrieves an entity by its id.
	 *
	 * @param id must not be {@literal null}.
	 * @return the entity with the given id or {@literal Optional#empty()} if none
	 *         found.
	 * @throws IllegalArgumentException if {@literal id} is {@literal null}.
	 */
	default public Optional<T> getByIdBaseDomain(ID id) {
		return null;
	}

	/**
	 * Returns whether an entity with the given id exists.
	 *
	 * @param id must not be {@literal null}.
	 * @return {@literal true} if an entity with the given id exists,
	 *         {@literal false} otherwise.
	 * @throws IllegalArgumentException if {@literal id} is {@literal null}.
	 */
	default public boolean checkExistsByIdBaseDomain(ID id) {
		return false;
	}

	/**
	 * Returns all instances of the type.
	 *
	 * @return all entities
	 */
	default public Iterable<T> getAllBaseDomains() {
		return null;
	}

	/**
	 * Returns all instances of the type {@code T} with the given IDs.
	 * <p>
	 * If some or all ids are not found, no entities are returned for these IDs.
	 * <p>
	 * Note that the order of elements in the result is not guaranteed.
	 *
	 * @param ids must not be {@literal null} nor contain any {@literal null}
	 *            values.
	 * @return guaranteed to be not {@literal null}. The size can be equal or less
	 *         than the number of given {@literal ids}.
	 * @throws IllegalArgumentException in case the given {@link Iterable ids} or
	 *                                  one of its items is {@literal null}.
	 */
	default public Iterable<T> getAllByIdBaseDomain(Iterable<ID> ids) {
		return null;
	}

	/**
	 * Returns the number of entities available.
	 *
	 * @return the number of entities.
	 */
	default public long getCountBaseDomains() {
		return -1;
	}

	/**
	 * Deletes the entity with the given id.
	 *
	 * @param id must not be {@literal null}.
	 * @throws IllegalArgumentException in case the given {@literal id} is
	 *                                  {@literal null}
	 */
	default public void performDeleteBaseDomain(ID id) {

	}

	/**
	 * Deletes a given entity.
	 *
	 * @param entity must not be {@literal null}.
	 * @throws IllegalArgumentException in case the given entity is {@literal null}.
	 */
	default public void performDeleteBaseDomain(T entity) {

	}

	/**
	 * Deletes the given entities.
	 *
	 * @param entities must not be {@literal null}. Must not contain {@literal null}
	 *                 elements.
	 * @throws IllegalArgumentException in case the given {@literal entities} or one
	 *                                  of its entities is {@literal null}.
	 */
	default public void performDeleteBaseDomains(Iterable<? extends T> entities) {

	}

	/**
	 * Deletes all entities managed by the repository.
	 */
	default public void performTruncateBaseDomains() {

	}
}
