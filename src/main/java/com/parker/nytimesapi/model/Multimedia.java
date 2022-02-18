package com.parker.nytimesapi.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Multimedia {
    private Integer rank;
    private String subtype;
    private String caption;
    private String credit;
    private String type;
    private String url;
    private Integer height;
    private Integer width;
    private Legacy legacy;
    private String subType;

    @JsonProperty("crop_name")
    private String cropName;
}
