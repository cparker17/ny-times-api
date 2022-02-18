package com.parker.nytimesapi.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Legacy {
    @JsonProperty("xlarge")
    private String xLarge;

    @JsonProperty("xlargewidth")
    private Integer xLargeWidth;

    @JsonProperty("xlargeheight")
    private Integer xLargeHeight;

    private String thumbnail;

    @JsonProperty("thumbnailwidth")
    private Integer thumbnailWidth;

    @JsonProperty("thumbnailheight")
    private Integer thumbnailHeight;

    @JsonProperty("widewidth")
    private Integer wideWidth;

    @JsonProperty("wideheight")
    private Integer wideHeight;

    private String wide;
}
