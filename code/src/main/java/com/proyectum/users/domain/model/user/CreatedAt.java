package com.proyectum.users.domain.model.user;

import com.proyectum.ddd.aggregate.ValueObject;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDateTime;

public record CreatedAt(@Valid @NotNull LocalDateTime value) implements ValueObject<LocalDateTime> {
}
