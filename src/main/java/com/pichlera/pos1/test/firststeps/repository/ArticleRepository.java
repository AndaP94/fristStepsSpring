package com.pichlera.pos1.test.firststeps.repository;

import com.pichlera.pos1.test.firststeps.model.Article;
import org.springframework.data.repository.CrudRepository;


public interface ArticleRepository extends CrudRepository<Article, Long> {


}
