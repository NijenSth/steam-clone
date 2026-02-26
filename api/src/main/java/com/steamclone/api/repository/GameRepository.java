package com.steamclone.api.repository;

import com.steamclone.api.model.Game;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface GameRepository extends JpaRepository<Game, Long> {
    Optional<Game> findBySlug(String slug);

    Page<Game> findByTitleContainingIgnoreCase(String query, Pageable pageable);
}

