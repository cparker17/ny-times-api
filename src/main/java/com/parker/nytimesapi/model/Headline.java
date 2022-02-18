package com.parker.nytimesapi.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Headline {
    private String main;
    private String kicker;

    @JsonProperty("content_kicker")
    private String contentKicker;

    @JsonProperty("print_headline")
    private String printHeadline;

    private String name;
    private String seo;
    private String sub;
}
