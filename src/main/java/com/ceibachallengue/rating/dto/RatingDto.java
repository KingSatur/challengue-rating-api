package com.ceibachallengue.rating.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class RatingDto {

    private String id;
    private String bookId;
    private Integer score;

}
