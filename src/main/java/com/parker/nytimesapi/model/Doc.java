package com.parker.nytimesapi.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Date;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class Doc {
    @JsonProperty("abstract")
    private String summary;

    @JsonProperty("web_url")
    private String webUrl;

    private String snippet;

    @JsonProperty("lead_paragraph")
    private String leadParagraph;

    private String source;
    private List<Multimedia> multimedia;
    private Headline headline;
    private List<Keywords> keywords;

    @JsonProperty("pub_date")
    private Date pubDate;

    @JsonProperty("document_type")
    private String documentType;

    @JsonProperty("news_desk")
    private String newsDesk;

    @JsonProperty("section_name")
    private String sectionName;

    private Byline byline;

    @JsonProperty("type_of_material")
    private String typeOfMaterial;

    private String _id;

    @JsonProperty("word_count")
    private Long wordCount;

    private String uri;

    private String imageUrl;
}
