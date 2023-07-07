package com.example.MiniReddit.repository;

import com.example.MiniReddit.model.Subreddit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubredditRepository extends JpaRepository<Subreddit, Long> {
}
