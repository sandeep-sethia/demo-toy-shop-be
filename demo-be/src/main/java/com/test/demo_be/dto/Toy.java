package com.test.demo_be.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Toy {
    Long id;
    String name;
    String description;
}
