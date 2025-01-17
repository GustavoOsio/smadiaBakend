package com.apirest.apirestSmadia.user.domain.models.authdto;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
@JsonPropertyOrder({"username", "message", "status", "token"})
public record AuthResponse(
        String username,
        String message,
        String token,
        Boolean status) {
}
