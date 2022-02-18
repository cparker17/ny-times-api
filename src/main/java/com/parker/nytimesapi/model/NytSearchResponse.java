package com.parker.nytimesapi.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class NytSearchResponse {
    private String status;
    private String copyright;
    private Response response;
}
