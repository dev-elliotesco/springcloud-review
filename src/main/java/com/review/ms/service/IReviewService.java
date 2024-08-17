package com.review.ms.service;

import com.review.ms.dto.ReviewDTO;
import com.review.ms.model.ReviewEntity;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface IReviewService {
    ResponseEntity<String> createReview(ReviewDTO reviewDTO);
    ResponseEntity<List<String>> getAllReviews();
    ResponseEntity<String> getReviewById(String id);
    ResponseEntity<String> updateReview(String id, ReviewDTO reviewDTO);
    ResponseEntity<String> deleteReview(String id);
}
