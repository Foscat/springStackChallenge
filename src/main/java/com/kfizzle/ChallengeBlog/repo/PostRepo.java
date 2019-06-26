package com.kfizzle.ChallengeBlog.repo;

import com.kfizzle.ChallengeBlog.model.Post;

import org.springframework.data.repository.CrudRepository;

public interface PostRepo extends CrudRepository<Post, Long>{

}
