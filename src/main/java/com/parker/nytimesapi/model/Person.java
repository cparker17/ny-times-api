package com.parker.nytimesapi.model;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Person {
    @JsonProperty("firstname")
    private String firstName;

    @JsonProperty("middlename")
    private String middleName;

    @JsonProperty("lastname")
    private String lastName;

    private String qualifier;
    private String title;
    private String role;
    private String organization;
    private Integer rank;
}
