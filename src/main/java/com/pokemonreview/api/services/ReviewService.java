package com.pokemonreview.api.services;

import com.pokemonreview.api.dto.ReviewDto;

import java.util.List;

public interface ReviewService {
    ReviewDto createReview(int pokemonid, ReviewDto reviewDto);
    List<ReviewDto> getReviewByPokemonId(int id);
}
