package com.boot.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.boot.entity.Player;

public interface PlayerRepository extends MongoRepository<Player, Integer> {

}
