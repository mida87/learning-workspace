package com.example.RssReader;

import java.util.ArrayList;

public interface ArticleProvider {
    String getName();
    ArrayList<Article> getArticles();
}
