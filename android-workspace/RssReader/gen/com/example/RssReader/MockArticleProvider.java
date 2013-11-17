package com.example.RssReader;

import java.util.ArrayList;

public class MockArticleProvider implements ArticleProvider {
    private int maxNumOfArticles;
    private int minNumOfArticles;

    public MockArticleProvider() {
        this.maxNumOfArticles = 15;
        this.minNumOfArticles = 5;
    }

    @Override
    public String getName() {
        return "MockProvider";
    }

    @Override
    public ArrayList<Article> getArticles() {
        ArrayList<Article> articles = generateArticles();
        return articles;
    }

    private ArrayList<Article> generateArticles() {
        ArrayList<Article> articles = new ArrayList<Article>();
        int numOfArticles = minNumOfArticles + (int)(Math.random() * maxNumOfArticles);

        for (int i = 0; i < numOfArticles; i++) {
            Article article = createArticle(i);
            articles.add(article);
        }

        return articles;
    }

    private Article createArticle(int n) {
        Article article = new Article();
        article.title = "Example title " + n;
        article.description = "Lorem Ipsum dolor si amet...";
        article.url = "http://www.sampleurl.com/feeds/example_title_" + n;
        return article;
    }
}
