package article.project.articleproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan({"article.project.articleproject"})
@EntityScan("article.project.articleproject.domain")

@SpringBootApplication
public class ArticleprojectApplication {

	public static void main(String[] args) {
		SpringApplication.run(ArticleprojectApplication.class, args);
	}

}
