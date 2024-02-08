package in.Naveenit;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import in.Naveenit.binding.Book;
@RestController
public class BookRestController {
	 @GetMapping(
			 value="/book", 
			 produces = {"application/xml","application/jason"}
			 )
	 
	
	  public Book getBook() {
		    Book b =  new Book();
		   b.setBookId(101);
		   b.setName("java");
		   b.setPrice(140.0);
		    return b;
	  }

}
