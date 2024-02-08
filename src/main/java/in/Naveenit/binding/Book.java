package in.Naveenit.binding;

import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@Data
@XmlRootElement
public class Book {
	
	
	 private  Integer  bookId;
	 private String name;
	  private Double price;

}
