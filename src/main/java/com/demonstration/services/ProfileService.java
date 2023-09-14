package com.demonstration.services;

import java.util.List;

import com.demonstration.model.Profile;


public interface ProfileService {
	public Profile createOne(Profile profile,long authorid);
	public List<Profile> getAll();
	public Profile getOne(long id);
	public void deleteOne(long id);
}
