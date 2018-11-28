package com.pichlera.pos1.test.firststeps.service;

import com.pichlera.pos1.test.firststeps.model.Article;
import com.pichlera.pos1.test.firststeps.repository.ArticleRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;


@Service
public class MyServiceImpl implements MyFirstService {

    @Autowired
    private ArticleRespository articleRespo;

    public MyServiceImpl(ArticleRespository articleRespo) {
        this.articleRespo = articleRespo;
    }

    @java.lang.Override
    public Optional<Article> getArticle(long id) {
        return articleRespo.findById(id);
    }

}
