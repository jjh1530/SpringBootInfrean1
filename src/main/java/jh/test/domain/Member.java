package jh.test.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;

@Entity
@Data
public class Member {

	@Id
	@GeneratedValue // 시퀀스
	@Column(name="member_id")
	private Long id;
	
	private String name;
	
	@Embedded
	private Address address;
	
	@OneToMany(mappedBy = "member")  // 일대 다 관계  (order테이블에 있는 member에 의해 연계) 
	private List<Order> orders = new ArrayList<>();
	
}
