package com.ceibachallengue.rating.service.impl;

import com.ceibachallengue.rating.config.RatingServiceConfigurationProps;
import com.ceibachallengue.rating.dto.RatingDto;
import com.ceibachallengue.rating.service.RatingService;
import net.datafaker.Faker;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

public class RatingServiceImpl implements RatingService {

    private List<RatingDto> ratingDtos;
    private final Faker faker;
    private final RatingServiceConfigurationProps configurationProperties;

    public RatingServiceImpl(Faker faker, RatingServiceConfigurationProps configurationProperties) {
        this.faker = faker;
        this.configurationProperties = configurationProperties;
        this.ratingDtos = new ArrayList<>();
    }

    @Override
    public List<RatingDto> getAllRatingsByBookId(String bookId) {
        return this.ratingDtos
                .stream()
                .filter(ratingDto -> ratingDto.getBookId().equals(bookId))
                .collect(Collectors.toList());
    }

    @Override
    public boolean deleteOneRating(String id) {
        return this.ratingDtos.removeIf(ratingDto -> ratingDto.getId().equals(id));
    }

    @Override
    public RatingDto createRatingForBook(RatingDto ratingDto) {
        RatingDto ratingDto1 = RatingDto.builder()
                .bookId(ratingDto.getBookId())
                .id(UUID.randomUUID().toString())
                .score(ratingDto.getScore())
                .build();
        this.ratingDtos.add(ratingDto1);
        return ratingDto1;
    }
}
