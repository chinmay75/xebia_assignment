package article.project.articleproject.controller;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.Iterator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import article.project.articleproject.domain.ArticleDomain;
import article.project.articleproject.service.ArticleServiceImpl;

@RestController
public class ArticleController {
	@Autowired
	ArticleServiceImpl artService;
	
    @PostMapping(path="/search",produces="application/json",consumes="application/json")
	public ResponseEntity<?> createArticle(@RequestBody ArticleDomain dom){
    	Iterable<ArticleDomain> li = artService.createedArticle();
    	Iterator<ArticleDomain> it = li.iterator();
    	while(it.hasNext()) {
    		dom = it.next();
    		dom.setArticleid(2);
    		dom.setBody("Hello how are you?");
    		dom.setCreatedAt("2020-11-15");
    		dom.setDescription("Hello world");
    		dom.setId(2);
    		dom.setSlug("My slug");
    		dom.setTimeToRead("time");
    		dom.setTitle("Test");
    		dom.setUpdatedAt("2019-12-11");
    		
    	}
		return new ResponseEntity(dom, HttpStatus.OK);
	}
}
