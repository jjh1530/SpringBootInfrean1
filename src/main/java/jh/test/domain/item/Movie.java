package jh.test.domain.item;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import jh.test.domain.Item;
import lombok.Data;

@Entity
@DiscriminatorValue("M")
@Data
public class Movie extends Item{

	private String derector;
	private String actor;
}
