package com.mycompany.app.boundaryInterfaces;

import java.util.*;

import com.mycompany.app.models.Rating;
import com.mycompany.app.models.User;

//interface to manage everything user related
public interface UserBoundaryInterface {

    boolean updateAccount(User user, int aid);

    boolean confirmAccount(int aid);

    boolean deleteAccount(int aid);

    List<Map<String, Object>> accounts(String key);

    Map<String, Object> account(int aid);

    int createAccount(User user);

    int createRating(Rating rating, int aid);

    Map<String, Object> getRating(int aid);

    boolean sendMessageNotification(User person);
}