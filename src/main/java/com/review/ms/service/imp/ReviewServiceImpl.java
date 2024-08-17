package com.review.ms.service.imp;

import com.review.ms.dto.ReviewDTO;
import com.review.ms.service.IReviewService;
import org.springframework.http.ResponseEntity;

import java.util.List;

public class ReviewServiceImpl implements IReviewService {

    @Override
    public ResponseEntity<String> createReview(ReviewDTO reviewDTO) {
        return null;
    }

    @Override
    public ResponseEntity<List<String>> getAllReviews() {
        return null;
    }

    @Override
    public ResponseEntity<String> getReviewById(String id) {
        return null;
    }

    @Override
    public ResponseEntity<String> updateReview(String id, ReviewDTO reviewDTO) {
        return null;
    }

    @Override
    public ResponseEntity<String> deleteReview(String id) {
        return null;
    }
}
