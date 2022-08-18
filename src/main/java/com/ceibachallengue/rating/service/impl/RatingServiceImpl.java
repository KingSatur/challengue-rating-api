package com.ceibachallengue.rating.service.impl;

import com.ceibachallengue.rating.config.RatingServiceConfigurationProps;
import com.ceibachallengue.rating.dto.RatingDto;
import com.ceibachallengue.rating.service.RatingService;
import net.datafaker.Faker;

import java.util.List;

public class RatingServiceImpl implements RatingService {

    private List<RatingDto> ratingDtos;
    private final Faker faker;
    private final RatingServiceConfigurationProps configurationProperties;

    public RatingServiceImpl(Faker faker, RatingServiceConfigurationProps configurationProperties) {
        this.faker = faker;
        this.configurationProperties = configurationProperties;
    }

    @Override
    public List<RatingDto> getAllRatingsByBookId(String bookId) {
        return null;
    }

    @Override
    public boolean deleteOneRating(String id) {
        return false;
    }

    @Override
    public RatingDto createRatingForBook(RatingDto ratingDto) {
        return null;
    }

    @Override
    public RatingDto updateOne(String id, RatingDto ratingDto) throws Exception {
        return null;
    }
}
