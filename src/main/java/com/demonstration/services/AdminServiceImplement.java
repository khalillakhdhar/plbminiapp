package com.demonstration.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demonstration.model.Admin;
import com.demonstration.repo.AdminRepository;

@Service
public class AdminServiceImplement implements AdminService {
@Autowired
AdminRepository adminRepository;
	@Override
	public Admin createOne(Admin admin) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Admin> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Admin getOne(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteOne(long id) {
		// TODO Auto-generated method stub

	}

}
