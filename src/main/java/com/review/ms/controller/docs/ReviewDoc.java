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
import org.springframework.web.bind.annotation.RequestBody;

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
}
