package com.lms.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;


@Schema(
        name = "Response",
        description = "schema to hold succesfful response"
)
@Data
@AllArgsConstructor
public class ResponseDto {
    @Schema(
            description = "status code in the response"
    )
    private String statusCode;

    @Schema(
            description = "status messagein the response"
    )
    private String statusMessage;
}
