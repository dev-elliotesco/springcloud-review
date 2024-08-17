package com.review.ms.controller.docs;

import com.review.ms.dto.ReviewDTO;
import com.review.ms.model.ReviewEntity;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Tag(name = "Review controller", description = "API exposed to manage reviews")
public interface ReviewDoc {

    @Operation(summary = "Create review", description = "This operation is for create a review")
    @ApiResponses(value = {
            @ApiResponse(
                    responseCode = "201",
                    description = "Review created",
                    content = @Content(mediaType = "application/json")
            ),
            @ApiResponse(
                    responseCode = "400",
                    description = "Bad request",
                    content = @Content(mediaType = "application/json")
            ),
            @ApiResponse(
                    responseCode = "500",
                    description = "Internal server error",
                    content = @Content(mediaType = "application/json")
            )
    })
    public ResponseEntity<ReviewEntity> createReview(@RequestBody @Valid ReviewDTO reviewDTO);

    @Operation(summary = "Get all reviews", description = "This operation is for get all reviews")
    @ApiResponses(value = {
            @ApiResponse(
                    responseCode = "200",
                    description = "Reviews found",
                    content = @Content(mediaType = "application/json")
            ),
            @ApiResponse(
                    responseCode = "404",
                    description = "No reviews found",
                    content = @Content(mediaType = "application/json")
            ),
            @ApiResponse(
                    responseCode = "500",
                    description = "Internal server error",
                    content = @Content(mediaType = "application/json")
            )
    })
    public ResponseEntity<List<ReviewEntity>> getAllReviews();

    @Operation(summary = "Get review by id", description = "This operation is for get a review by id")
    @ApiResponses(value = {
            @ApiResponse(
                    responseCode = "200",
                    description = "Review found",
                    content = @Content(mediaType = "application/json")
            ),
            @ApiResponse(
                    responseCode = "404",
                    description = "Review not found",
                    content = @Content(mediaType = "application/json")
            ),
            @ApiResponse(
                    responseCode = "500",
                    description = "Internal server error",
                    content = @Content(mediaType = "application/json")
            )
    })
    public ResponseEntity<ReviewEntity> getReviewById(@PathVariable String id);

    @Operation(summary = "Update review", description = "This operation is for update a review")
    @ApiResponses(value = {
            @ApiResponse(
                    responseCode = "200",
                    description = "Review updated",
                    content = @Content(mediaType = "application/json")
            ),
            @ApiResponse(
                    responseCode = "404",
                    description = "Review not found",
                    content = @Content(mediaType = "application/json")
            ),
            @ApiResponse(
                    responseCode = "500",
                    description = "Internal server error",
                    content = @Content(mediaType = "application/json")
            )
    })
    public ResponseEntity<ReviewEntity> updateReview(@PathVariable String id, @RequestBody @Valid ReviewDTO reviewDTO);

    @Operation(summary = "Delete review", description = "This operation is for delete a review")
    @ApiResponses(value = {
            @ApiResponse(
                    responseCode = "200",
                    description = "Review deleted",
                    content = @Content(mediaType = "application/json")
            ),
            @ApiResponse(
                    responseCode = "404",
                    description = "Review not found",
                    content = @Content(mediaType = "application/json")
            ),
            @ApiResponse(
                    responseCode = "500",
                    description = "Internal server error",
                    content = @Content(mediaType = "application/json")
            )
    })
    public ResponseEntity<String> deleteReview(@PathVariable String id);
}
