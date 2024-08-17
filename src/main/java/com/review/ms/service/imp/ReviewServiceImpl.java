package com.review.ms.service.imp;

import com.review.ms.dto.ReviewDTO;
import com.review.ms.model.ReviewEntity;
import com.review.ms.repository.IReviewRepository;
import com.review.ms.service.IReviewService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@AllArgsConstructor
public class ReviewServiceImpl implements IReviewService {

    private final IReviewRepository iReviewRepository;

    @Override
    public ResponseEntity<ReviewEntity> createReview(ReviewDTO reviewDTO) {
        ReviewEntity reviewEntity = toEntity(reviewDTO);
        iReviewRepository.save(reviewEntity);
        return ResponseEntity.ok(reviewEntity);
    }

    @Override
    public ResponseEntity<List<ReviewEntity>> getAllReviews() {
        return null;
    }

    @Override
    public ResponseEntity<ReviewEntity> getReviewById(String id) {
        return null;
    }

    @Override
    public ResponseEntity<ReviewEntity> updateReview(String id, ReviewDTO reviewDTO) {
        return null;
    }

    @Override
    public ResponseEntity<String> deleteReview(String id) {
        return null;
    }

    private ReviewEntity toEntity(ReviewDTO reviewDTO) {
        return ReviewEntity.builder()
                .id(UUID.randomUUID().toString())
                .productId(reviewDTO.getProductId())
                .userId(reviewDTO.getUserId())
                .review(reviewDTO.getReview())
                .rating(reviewDTO.getRating())
                .build();
    }
}
