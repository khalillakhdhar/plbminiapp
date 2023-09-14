package com.demonstration.services;

import java.util.List;

import com.demonstration.model.Admin;


public interface AdminService {
public Admin createOne(Admin admin);
public List<Admin> getAll();
public Admin getOne(long id);
public void deleteOne(long id);

}
