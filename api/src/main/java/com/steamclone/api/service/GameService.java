package com.steamclone.api.service;

import com.steamclone.api.model.Game;
import com.steamclone.api.repository.GameRepository;
import com.steamclone.api.storage.StorageService;
import com.steamclone.api.web.dto.GameDtos;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@Service
public class GameService {

    private final GameRepository gameRepository;
    private final StorageService storageService;

    public GameService(GameRepository gameRepository, StorageService storageService) {
        this.gameRepository = gameRepository;
        this.storageService = storageService;
    }

    public Page<GameDtos.GameSummary> listGames(int page, int size) {
        return gameRepository.findAll(PageRequest.of(page, size))
                .map(this::toSummary);
    }

    public GameDtos.GameDetail getGame(String slug) {
        Game game = gameRepository.findBySlug(slug)
                .orElseThrow(() -> new IllegalArgumentException("Game not found"));
        return toDetail(game);
    }

    private GameDtos.GameSummary toSummary(Game game) {
        String heroUrl = storageService.getPresignedDownloadUrl(game.getHeroImageKey());
        return new GameDtos.GameSummary(
                game.getId(),
                game.getSlug(),
                game.getTitle(),
                game.getPrice(),
                heroUrl
        );
    }

    private GameDtos.GameDetail toDetail(Game game) {
        String heroUrl = storageService.getPresignedDownloadUrl(game.getHeroImageKey());
        return new GameDtos.GameDetail(
                game.getId(),
                game.getSlug(),
                game.getTitle(),
                game.getDescription(),
                game.getPrice(),
                game.getDeveloper(),
                game.getPublisher(),
                heroUrl
        );
    }
}

