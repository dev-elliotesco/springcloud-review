package com.review.ms.controller;

import com.review.ms.controller.docs.ReviewDoc;
import com.review.ms.dto.ReviewDTO;
import com.review.ms.model.ReviewEntity;
import com.review.ms.service.IReviewService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
