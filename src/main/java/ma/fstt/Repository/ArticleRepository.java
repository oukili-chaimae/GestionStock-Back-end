package ma.fstt.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ma.fstt.entity.Article;


public interface ArticleRepository extends JpaRepository<Article,Integer>{

}
