package com.graphql.learn;

import com.graphql.learn.entities.Book;
import com.graphql.learn.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GraphqlProjectApplication implements CommandLineRunner {

	@Autowired
	private BookService bookService;

	public static void main(String[] args) {
		SpringApplication.run(GraphqlProjectApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Book b1 = new Book();

		b1.setTitle("Complete Reference");
		b1.setDesc("For learning Java");
		b1.setPages(2000);
		b1.setPrice(5000);
		b1.setAuthor("Herbert Schildt");

		Book b2 = new Book();

		b2.setTitle("System Design Fundamentals");
		b2.setDesc("For designing software systems");
		b2.setPages(1000);
		b2.setPrice(3000);
		b2.setAuthor("Alex Wu");


		Book b3 = new Book();

		b3.setTitle("Head First Design Patterns");
		b3.setDesc("Learn best patterns to design scalable software systems");
		b3.setPages(2000);
		b3.setPrice(4000);
		b3.setAuthor("Eric Freeman");


		this.bookService.create(b1);
		this.bookService.create(b2);
		this.bookService.create(b3);


	}
}
