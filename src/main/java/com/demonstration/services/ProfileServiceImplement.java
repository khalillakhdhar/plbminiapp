package com.demonstration.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demonstration.model.Author;
import com.demonstration.model.Profile;
import com.demonstration.repo.ProfileRepository;


@Service
public class ProfileServiceImplement implements ProfileService {
@Autowired
ProfileRepository profileRepository;
@Autowired
AuthorService authorService;
	@Override
	public Profile createOne(Profile profile,long authorid) {
		Author author=authorService.getOne(authorid);
		profile.setAuthor(author);
		// TODO Auto-generated method stub
		return profileRepository.save(profile);
	}

	@Override
	public List<Profile> getAll() {
		// TODO Auto-generated method stub
		return profileRepository.findAll();
	}

	@Override
	public Profile getOne(long id) {
		// TODO Auto-generated method stub
		return profileRepository.findById(id).orElse(null);
	}

	@Override
	public void deleteOne(long id) {
		// TODO Auto-generated method stub
profileRepository.deleteById(id);
	}

}
