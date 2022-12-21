package com.example.demo.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Meetup;
import com.example.demo.service.MeetupService;

@RestController
@RequestMapping("/api")
public class MeetupResource {

	@Autowired
	private MeetupService meetupService;

	@GetMapping("/allMeetups")
	public List<Meetup> getAllMeetups() {
		
		
		return null;
	}
	
	@PostMapping("/meetup")
	public List<Meetup> createMeetup(@RequestBody Meetup meetup) {
		
		return null;
	}
	
	@DeleteMapping("/delete/meetup/{id}")
	public void deleteMeetup(@PathVariable int id) {
		
	}
	
}
