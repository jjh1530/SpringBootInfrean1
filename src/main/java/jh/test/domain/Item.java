package jh.test.domain;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

import lombok.Data;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE) // 하나의 테이블에 다 넣음
@DiscriminatorColumn(name="dtype")
@Data
public abstract class Item {

	@Id @GeneratedValue
	@Column(name="item_id")
	private Long id;
	
	private String name;
	private int price;
	private int stockQuantity;
}
