package org.jboss.spring.quickstarts.greeter.greeter_spring.domain;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Service;

import br.com.ative.entity.IEntity;

@Service("entityDAO")
@Scope(proxyMode=ScopedProxyMode.TARGET_CLASS)
public class EntityDAOImpl implements EntityDAO {

	@Autowired
	private EntityManager entityManager;
	
	@SuppressWarnings("unchecked")
	@Override
	public <T extends IEntity> List<T> findAll(Class<T> clazz) {
		Query query = entityManager.createQuery(String.format("select e from %s e", clazz.getSimpleName()));
		return query.getResultList();
	}
	
}
