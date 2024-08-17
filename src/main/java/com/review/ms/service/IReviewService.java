package com.review.ms.service;

import com.review.ms.dto.ReviewDTO;
import com.review.ms.model.ReviewEntity;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface IReviewService {
    ResponseEntity<ReviewEntity> createReview(ReviewDTO reviewDTO);
    ResponseEntity<List<ReviewEntity>> getAllReviews();
    ResponseEntity<ReviewEntity> getReviewById(String id);
    ResponseEntity<ReviewEntity> updateReview(String id, ReviewDTO reviewDTO);
    ResponseEntity<String> deleteReview(String id);
}
