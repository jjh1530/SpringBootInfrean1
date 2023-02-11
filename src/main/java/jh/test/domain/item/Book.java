package jh.test.domain.item;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import jh.test.domain.Item;
import lombok.Data;

@Entity
@DiscriminatorValue("B")
@Data
public class Book extends Item{

	private String author;
	private String isbn;
}
