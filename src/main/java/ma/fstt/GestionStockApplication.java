package ma.fstt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ma.fstt.Repository.ArticleRepository;
import ma.fstt.Repository.CategorieRepository;
import ma.fstt.entity.Article;
import ma.fstt.entity.Categorie;
@SpringBootApplication
public class GestionStockApplication implements CommandLineRunner {
	@Autowired
	private  CategorieRepository rep;
	@Autowired
	private  ArticleRepository repo;
	
	public static void main(String[] args) {
		SpringApplication.run(GestionStockApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Categorie a=new Categorie("Fruits");
		Categorie b=new Categorie("Technologies");

		rep.save(a);
		rep.save(b);
		
		Article c=new Article("Pomme",3.5,1);
		Article d=new Article("Banane",9.0,1);
		Article e=new Article("Fraise",8.5,1);
		Article f=new Article("Orange",12.5,1);

		
		Article g=new Article("PC",5000.0,2);
		Article h=new Article("Smartphone",4500.0,2);
		Article k=new Article("Imprimante ",800.0,2);
		repo.save(c);
		repo.save(d);
		repo.save(e);
		repo.save(f);
		repo.save(g);
		repo.save(h);
		repo.save(k);
	}

}
