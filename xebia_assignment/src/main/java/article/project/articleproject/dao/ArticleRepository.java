package article.project.articleproject.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import article.project.articleproject.domain.ArticleDomain;

@Repository
public interface ArticleRepository extends CrudRepository<ArticleDomain, Long>{
 
}
