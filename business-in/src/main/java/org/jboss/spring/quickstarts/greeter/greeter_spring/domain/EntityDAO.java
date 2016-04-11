package org.jboss.spring.quickstarts.greeter.greeter_spring.domain;

import java.util.List;

import br.com.ative.entity.IEntity;

public interface EntityDAO {

	<T extends IEntity> List<T> findAll(Class<T> clazz);

}
