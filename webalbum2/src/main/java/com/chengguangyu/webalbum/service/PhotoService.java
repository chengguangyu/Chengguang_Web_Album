package com.chengguangyu.webalbum.service;


import java.util.List;

import com.chengguangyu.webalbum.model.Photo;
import com.chengguangyu.webalbum.model.User;


public interface PhotoService {
    Photo save(Photo photo);

    List<Photo> findAll();

    List<Photo> findByUser(User user);

    Photo findByPhotoId(Long photoId);

}