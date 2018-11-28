package com.pichlera.pos1.test.firststeps.model;

public class Article {

    private long id;
    private String articleDescription;


    public Article() {
    }

    public Article(long id, String articleDescription) {
        this.id = id;
        this.articleDescription = articleDescription;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getArticleDescription() {
        return articleDescription;
    }

    public void setArticleDescription(String articleDescription) {
        this.articleDescription = articleDescription;
    }

    @Override
    public String toString() {
        return "Article{" +
                "id=" + id +
                ", articleDescription='" + articleDescription + '\'' +
                '}';
    }
}
