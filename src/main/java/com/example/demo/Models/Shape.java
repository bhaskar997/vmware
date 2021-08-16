package com.example.demo.Models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter@Setter
public class Shape {
    @JsonProperty("type")
    private String type;

    @JsonProperty("radius")
    private Integer radius;

    @JsonProperty("l")
    private Integer l;

    @JsonProperty("b")
    private Integer b;

    @JsonProperty("side")
    private Integer side;
}
