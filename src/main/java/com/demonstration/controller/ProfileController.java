package com.demonstration.controller;

import com.demonstration.model.Profile;
import com.demonstration.services.ProfileServiceImplement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("profiles")
public class ProfileController {

    @Autowired
    private ProfileServiceImplement profileService;

    @PostMapping("/{authorid}")
    public Profile createProfile(@RequestBody Profile profile,@PathVariable long authorid) {
        return profileService.createOne(profile,authorid);
    }

    @GetMapping("/{id}")
    public Profile getProfileById(@PathVariable long id) {
        return profileService.getOne(id);
    }

    @GetMapping
    public List<Profile> getAllProfiles() {
        return profileService.getAll();
    }

    @DeleteMapping("/{id}")
    public Void deleteProfile(@PathVariable long id) {
        profileService.deleteOne(id);
        return null;
    }
}
