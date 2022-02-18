package com.parker.nytimesapi.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Meta {
    private Long hits;
    private Integer offset;
    private Integer time;
}
