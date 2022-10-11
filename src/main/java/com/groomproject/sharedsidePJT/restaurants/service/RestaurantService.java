package com.groomproject.sharedsidePJT.restaurants.service;

import com.groomproject.sharedsidePJT.restaurants.dto.RestaurantResponse;
import com.groomproject.sharedsidePJT.restaurants.entity.Restaurant;

public interface RestaurantService {
    RestaurantResponse findById(Long id);

    void delete(Long restaurantId);
    
}
