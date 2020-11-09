package com.boot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boot.entity.Player;
import com.boot.repository.PlayerRepository;

@Service
public class PlayerService {

	@Autowired
	private PlayerRepository playerRepository;

	public PlayerService(PlayerRepository playerRepository) {
		this.playerRepository = playerRepository;
	}

	public List<Player> getAllPlayers() {
		return playerRepository.findAll();
	}

	public Player getPlayer(int id) {
		return playerRepository.findById(id).orElse(null);
	}

	public void savePlayer(Player player) {
		player = playerRepository.insert(player);
	}

	public Player updatePlayer(Player player) {
		return player = playerRepository.save(player);
	}

	public void deletePlayer(int id) {
		playerRepository.deleteById(id);
	}

}
