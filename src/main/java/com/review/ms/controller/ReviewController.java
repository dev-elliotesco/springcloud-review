package com.review.ms.controller;

import com.review.ms.controller.docs.ReviewDoc;
import com.review.ms.dto.ReviewDTO;
import com.review.ms.model.ReviewEntity;
import com.review.ms.service.IReviewService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/reviews")
@AllArgsConstructor
public class ReviewController implements ReviewDoc {

    private final IReviewService reviewService;

    @Override
    @PostMapping
    public ResponseEntity<ReviewEntity> createReview(@RequestBody @Valid ReviewDTO reviewDTO) {
        return reviewService.createReview(reviewDTO);
    }

    @Override
    @GetMapping
    public ResponseEntity<List<ReviewEntity>> getAllReviews() {
        return reviewService.getAllReviews();
    }

    @Override
    @GetMapping("/{id}")
    public ResponseEntity<ReviewEntity> getReviewById(@PathVariable String id) {
        return reviewService.getReviewById(id);
    }

    @Override
    @PutMapping("/{id}")
    public ResponseEntity<ReviewEntity> updateReview(@PathVariable String id,@RequestBody @Valid ReviewDTO reviewDTO) {
        return reviewService.updateReview(id, reviewDTO);
    }

    @Override
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteReview(@PathVariable String id) {
        return reviewService.deleteReview(id);
    }
}
