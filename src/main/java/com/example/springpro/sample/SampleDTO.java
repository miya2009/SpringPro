package com.example.springpro.sample;

import lombok.*;

import java.util.Arrays;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SampleDTO {
    private String name;
    private int age;
    private String[] hobby;
}
