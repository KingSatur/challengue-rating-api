package com.ceibachallengue.rating.config;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "configuration")
@Getter
@Setter
@ToString
public class RatingServiceConfigurationProps {

    private Integer ratingsQuantity;
    private Integer defaultLimit;
    private Integer defaultSize;

}
