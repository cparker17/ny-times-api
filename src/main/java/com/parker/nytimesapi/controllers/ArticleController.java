package com.parker.nytimesapi.controllers;

import com.parker.nytimesapi.model.Article;
import com.parker.nytimesapi.services.ArticleService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class ArticleController {
    ArticleService articleService;

    public ArticleController(ArticleService articleService) {
        this.articleService = articleService;
    }

    @GetMapping("/")
    public String home(Model model) {
        List<Article> articles = articleService.getMostPopular();
        model.addAttribute("articleList", articleService.filterForImages(articles));
        return "index";
    }

    @GetMapping("/search")
    public String displaySearchResults(Model model, @RequestParam(value="searchText") String searchText) {
        model.addAttribute("searchResults", articleService.getSearchResults(searchText));
        return "search-results";
    }
}
