package com.thinkxfactor.zomatoplus.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.thinkxfactor.zomatoplus.models.Items;
import com.thinkxfactor.zomatoplus.models.Restaurant;
import com.thinkxfactor.zomatoplus.models.User;
import com.thinkxfactor.zomatoplus.repo.ItemsRepository;
import com.thinkxfactor.zomatoplus.repo.RestaurantRepository;
import com.thinkxfactor.zomatoplus.repo.UserRepository;

@RestController
@RequestMapping("/restaurant")
public class RestaurantController {
	
	@Autowired
	private RestaurantRepository restaurantRepository;
	
	@Autowired
	private ItemsRepository itemsRepository;
	
	@PostMapping("/add")
	public Restaurant addRes(@RequestBody Restaurant res) {
		Restaurant persistedRes= restaurantRepository.save(res);
		return persistedRes;
	}
	
	
	@GetMapping("/getAll")
	public List<Restaurant> getAll() {
		List<Restaurant> res1=restaurantRepository.findAll();
		return res1;
	}
	
	
	@PostMapping("/additem")
	public Items addItem(@RequestBody Items item1) {
		Items persistedItem= itemsRepository.save(item1);
		return persistedItem;
	}
	
	
	@GetMapping("/getAllItems")
	public List<Items> getAllItems() {
		List<Items> item1=itemsRepository.findAll();
		return item1;
	}
	
}