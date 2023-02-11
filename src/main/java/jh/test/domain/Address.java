package jh.test.domain;

import javax.persistence.Embeddable;

import lombok.Data;

@Embeddable //내장타입(Member에 내장)
@Data
public class Address {

	private String city;
	private String street;
	private String zipcode;
}
