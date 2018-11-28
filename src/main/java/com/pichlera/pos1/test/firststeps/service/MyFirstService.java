package com.pichlera.pos1.test.firststeps.service;

import com.pichlera.pos1.test.firststeps.model.Article;

import java.util.Optional;

public interface MyFirstService {

    public Optional<Article> getArticle(long id);
}
