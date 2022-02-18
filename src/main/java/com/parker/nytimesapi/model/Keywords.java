package com.parker.nytimesapi.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Keywords {
    private String name;
    private String value;
    private Integer rank;
    private String major;
}
