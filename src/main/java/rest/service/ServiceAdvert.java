package rest.service;

import rest.entity.EntityAdvert;
import rest.repository.RepositoryAdvert;

public class ServiceAdvert {

	RepositoryAdvert repositoryAdvert = new RepositoryAdvert();

	public boolean createAdvert(EntityAdvert advert) {
		return repositoryAdvert.createAdvert(advert);
	}

	public EntityAdvert findAdvertById(int id) {
		return repositoryAdvert.findAdvertById(id);
	}

	public boolean deleteAdvertById(int id) {
		return repositoryAdvert.deleteAdvertById(id);
	}

}