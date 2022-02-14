package ma.fstt.controller;

import java.util.ArrayList; 
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import ma.fstt.Repository.ArticleRepository;
import ma.fstt.entity.Article;
@CrossOrigin(origins = "*" )
@RestController
public class ArticleController {
	@Autowired
	private  ArticleRepository articleRepository;
	
	@ResponseStatus(HttpStatus.CREATED)
	@PostMapping("/save")
	public Article saveArticle(@RequestBody Article ar) {
		return articleRepository.save(ar);
	}
	@GetMapping("/getAllArticles")
	public  List<Article> getAll(){
		return articleRepository.findAll();
	}
	@GetMapping("/getByCategorie/{id}")
	public List<Article> getAllByCat(@PathVariable int id){
		List<Article> AllByCat=new ArrayList<Article>();
		for(Article cat :articleRepository.findAll()) {
			if(cat.getId_ctg()==id) {
				AllByCat.add(cat);
			}
		}
		return AllByCat;
	}
}
