package com.steamclone.api.web;

import com.steamclone.api.service.GameService;
import com.steamclone.api.web.dto.GameDtos;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/catalog")
public class CatalogController {

    private final GameService gameService;

    public CatalogController(GameService gameService) {
        this.gameService = gameService;
    }

    @GetMapping("/games")
    public ResponseEntity<Page<GameDtos.GameSummary>> list(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "12") int size
    ) {
        return ResponseEntity.ok(gameService.listGames(page, size));
    }

    @GetMapping("/games/{slug}")
    public ResponseEntity<GameDtos.GameDetail> get(@PathVariable String slug) {
        return ResponseEntity.ok(gameService.getGame(slug));
    }
}

