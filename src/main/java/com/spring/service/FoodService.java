package com.spring.service;

import com.spring.model.Category;
import com.spring.model.Food;
import com.spring.model.Restaurant;
import com.spring.request.CreateFoodRequest;

import java.util.List;

public interface FoodService {

    public Food createFood(CreateFoodRequest req, Category category, Restaurant restaurant);

    void deleteFood(Long foodId) throws Exception;

    public List<Food> getRestaurantsFood(Long restaurantId,boolean isVeg,boolean isNonveg,boolean isSeasonal,String foodCategory);

    public List<Food> searchFood(String keyword);

    public Food findFoodById(Long foodId) throws Exception;
    public Food updateAvailability(Long foodId)throws Exception;

}
