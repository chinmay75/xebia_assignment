package article.project.articleproject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import article.project.articleproject.dao.ArticleRepository;
import article.project.articleproject.domain.ArticleDomain;

@Service
public class ArticleServiceImpl implements ArticleService{

@Autowired
ArticleRepository articleRepo;


	@Override
	public Iterable<ArticleDomain> createedArticle() {
		
		return articleRepo.findAll();
	}

}
