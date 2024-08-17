package com.review.ms.repository;

import com.review.ms.model.ReviewEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface IReviewRepository extends MongoRepository<ReviewEntity, String> {
}
