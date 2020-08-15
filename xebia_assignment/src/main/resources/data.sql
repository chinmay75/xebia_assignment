DROP TABLE IF EXISTS article; 
 
    create table article
(
   id integer not null,
   articleId varchar(255) not null,
   slug varchar(255) not null,
   description varchar(255) not null,
   body varchar(255) not null,
   createdAt varchar(255) not null,
   updatedAt varchar(255) not null,
   timeToRead varchar(255) not null,
   primary key(articleId)
);


insert into article(id,articleId,slug,description,body,createdAt,updatedAt,timeToRead) values(1,'slug-uuid', 'how-to-learn-spring-boot-by-building-an-app','Ever wonder how?','You have to believe','2019-05-24','2020-05-24','2020-05-24');