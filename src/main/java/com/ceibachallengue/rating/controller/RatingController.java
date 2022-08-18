package com.ceibachallengue.rating.controller;

import com.ceibachallengue.rating.dto.RatingDto;
import com.ceibachallengue.rating.service.RatingService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rating")
public class RatingController {

    private final RatingService ratingService;

    public RatingController(RatingService ratingService) {
        this.ratingService = ratingService;
    }

    @GetMapping("/{id}")
    public List<RatingDto> getRatingsByBook(@PathVariable("id") String id){
        return this.ratingService.getAllRatingsByBookId(id);
    }

    @DeleteMapping("/{id}")
    public boolean deleteRating(@PathVariable("id") String id){
        return this.ratingService.deleteOneRating(id);
    }

    @PostMapping
    public RatingDto createRating(@RequestBody RatingDto ratingDto){
        return this.ratingService.createRatingForBook(ratingDto);
    }
}
