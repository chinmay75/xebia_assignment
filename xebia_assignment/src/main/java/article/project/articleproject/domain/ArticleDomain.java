package article.project.articleproject.domain;


import java.sql.Timestamp;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "article")
public class ArticleDomain {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long articleid;
	
	@Column(name = "id")
	private long id;
	
	@Column(name = "slug")
	private String slug;
	
	@Column(name = "title")
	private String title;
	
	@Column(name = "description")
	private String description;
	
	@Column(name = "body")
	private String body;
	
	@Column(name = "createdAt")
	private String createdAt; // : "2019-11-24T03:22:56.637Z",
	
	@Column(name = "updatedAt")
	private String updatedAt; // "2019-11-24T03:48:35.824Z"
	@Column(name = "timeToRead")
	private String timeToRead;
	
	public long getArticleid() {
		return articleid;
	}
	public void setArticleid(long articleid) {
		this.articleid = articleid;
	}
	public String getTimeToRead() {
		return timeToRead;
	}
	public void setTimeToRead(String timeToRead) {
		this.timeToRead = timeToRead;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getSlug() {
		return slug;
	}
	public void setSlug(String slug) {
		this.slug = slug;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	public String getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}
	public String getUpdatedAt() {
		return updatedAt;
	}
	public void setUpdatedAt(String updatedAt) {
		this.updatedAt = updatedAt;
	}
	
}
