package com.parker.nytimesapi.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class Byline {
    private String original;
    private List<Person> persons;
    private String organization;
}
