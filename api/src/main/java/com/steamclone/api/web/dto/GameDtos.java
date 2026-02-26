package com.steamclone.api.web.dto;

import java.math.BigDecimal;

public class GameDtos {

    public record GameSummary(
            Long id,
            String slug,
            String title,
            BigDecimal price,
            String heroImageUrl
    ) {
    }

    public record GameDetail(
            Long id,
            String slug,
            String title,
            String description,
            BigDecimal price,
            String developer,
            String publisher,
            String heroImageUrl
    ) {
    }
}

