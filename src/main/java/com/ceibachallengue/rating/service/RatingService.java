package com.ceibachallengue.rating.service;

import com.ceibachallengue.rating.dto.RatingDto;

import java.util.List;

public interface RatingService {

    List<RatingDto> getAllRatingsByBookId(String bookId);
    boolean deleteOneRating(String id);
    RatingDto createRatingForBook(RatingDto ratingDto);

}
