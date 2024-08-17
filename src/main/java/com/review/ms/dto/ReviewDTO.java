package com.review.ms.dto;

import com.review.ms.utils.MessageUtils;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ReviewDTO {
    @NotBlank
    @NotEmpty
    private String productId;

    @NotBlank
    @NotEmpty
    private String userId;

    @NotBlank
    @NotEmpty
    @Size(min = 1, max = 50, message = MessageUtils.REVIEW_SIZE_ERROR)
    private String review;

    @NotNull(message = MessageUtils.REVIEW_RATING_NULL_ERROR)
    @Min(value = 0, message = MessageUtils.REVIEW_RATING_MIN_ERROR)
    @Max(value = 5, message = MessageUtils.REVIEW_RATING_MAX_ERROR)
    private Integer rating;

}
