package com.example.pizzabdin.domain.dto.binding;

import com.example.pizzabdin.domain.dto.UserServiceModel;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
public class CommentBindingModel {

    private UUID id;

    @NotBlank(message = "Comment cannot be blank")
    private String comment;

    @NotEmpty(message = "The comment has to have an author")
    private UserServiceModel author;
}
