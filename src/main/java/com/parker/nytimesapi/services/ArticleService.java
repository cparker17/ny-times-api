package com.parker.nytimesapi.services;

import com.parker.nytimesapi.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Service
public class ArticleService {

    @Value("${api_key}")
    private String apikey;

    @Value("${mostPopularUrl}")
    private String mostPopularUrl;

    @Value("${searchUrl}")
    private String searchUrl;

    @Autowired
    RestTemplate restTemplate;

    public List<Article> getMostPopular() {
        NytResponse response = restTemplate.getForObject(mostPopularUrl + "api-key=" + apikey, NytResponse.class);
        List<Article> results = new ArrayList<>();
        if (response != null && response.getStatus().equals("OK")) {
            return response.getResults();
        } else {
            return results;
        }
    }

    public  List<Article> filterForImages(List<Article> articles) {
        articles.removeIf(article -> article.getMedia().isEmpty());
        setImageUrlToFirstThumbnail(articles);
        return articles;
    }

    private void setImageUrlToFirstThumbnail(List<Article> articles) {
        for (Article article : articles) {
            List<Media> media = article.getMedia();
            Media firstMedia = media.get(0);
            Thumbnail firstThumbnail = firstMedia.getMediaMetadata().get(2);
            article.setImageUrl(firstThumbnail.getUrl());
        }
    }

    public List<Doc> getSearchResults(String searchText) {
        ResponseEntity<NytSearchResponse> responseEntity = restTemplate.getForEntity(searchUrl + searchText
                + "&api-key=" + apikey, NytSearchResponse.class);
        List<Doc> docs = Objects.requireNonNull(responseEntity.getBody()).getResponse().getDocs();
        for (Doc doc: docs) {
            for(Multimedia multimedia : doc.getMultimedia()) {
                if (multimedia.getSubtype().equals("largeHorizontal375")) {
                    doc.setImageUrl("https://www.nytimes.com/" + multimedia.getUrl());
                }
            }
        }
        return docs;
    }
}
