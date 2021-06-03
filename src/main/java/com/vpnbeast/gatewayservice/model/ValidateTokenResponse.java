package com.vpnbeast.gatewayservice.model;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class ValidateTokenResponse {

    private String tag;
    private Boolean status;
    private String errorMessage;
    private Integer httpCode;
    private String timestamp;

}
