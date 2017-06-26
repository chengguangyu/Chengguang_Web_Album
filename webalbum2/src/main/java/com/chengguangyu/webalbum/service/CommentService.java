package com.chengguangyu.webalbum.service;



import java.util.List;

import com.chengguangyu.webalbum.model.Comment;


public interface CommentService {
    Comment save(Comment comment);

    List<Comment> findByPhotoId (Long photoId);

    Comment findOne(Long commentId);

}
