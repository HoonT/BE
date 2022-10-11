package com.groomproject.sharedsidePJT.restaurants.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.groomproject.sharedsidePJT.restaurants.entity.Restaurant;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@Builder
@AllArgsConstructor
@RequiredArgsConstructor
public class RestaurantRequest {
    private String name;

    private String theme;

    private LocalDateTime availableTime;

    public Restaurant toEntity() {
        return Restaurant.builder()
                .name(this.name)
                .availableTime(this.availableTime)
                .theme(this.theme)
                .build();
    }
}
