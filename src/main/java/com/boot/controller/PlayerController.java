package com.boot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.boot.entity.Player;
import com.boot.service.PlayerService;

@RestController
@RequestMapping("/players")
public class PlayerController {

	@Autowired
	private PlayerService playerService;

	@GetMapping(value = "/all")
	public List<Player> AllPlayers() {
		return playerService.getAllPlayers();
	}

	@GetMapping(value = "/{id}")
	public Player getOnePlayer(@PathVariable int id) {
		return playerService.getPlayer(id);
	}

	@PostMapping(value = "/add")
	public String addPlayer(@RequestBody Player player) {
		playerService.savePlayer(player);
		return "Player: " + player.getName() + " " + player.getSurname() + " is added!";
	}

	@PutMapping(value = "/update/{id}")
	public String updatePlayer(@RequestBody Player player) {
		playerService.updatePlayer(player);
		return "Player: " + player.getName() + " " + player.getSurname() + " is updated!";
	}

	@DeleteMapping(value = "/{id}")
	public String deletePlayer(@PathVariable int id) {
		playerService.deletePlayer(id);
		return "Player deleted!";
	}

}
