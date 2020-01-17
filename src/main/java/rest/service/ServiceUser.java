package rest.service;

import java.util.List;

import rest.entity.EntityAdvert;
import rest.entity.EntityUser;
import rest.repository.RepositoryUser;

public class ServiceUser {
	
	RepositoryUser repositoryUser = new RepositoryUser();

	public boolean createUser(EntityUser user) {
		return repositoryUser.createUser(user);
	}

	public List<EntityAdvert> findAdvertsByUserId(int id) {
		return repositoryUser.findAdvertsByUserId(id);
	}

}