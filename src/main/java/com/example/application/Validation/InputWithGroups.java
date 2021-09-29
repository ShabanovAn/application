package com.example.application.Validation;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;

public class InputWithGroups {

    @Null(groups = OnCreate.class)
    @NotNull(groups = OnUpdate.class)
    private Long id;

}
