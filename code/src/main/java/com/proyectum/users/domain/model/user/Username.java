package com.proyectum.users.domain.model.user;

import com.proyectum.ddd.aggregate.ValueObject;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;

public record Username(@Valid @NotBlank String value) implements ValueObject<String> {
}
