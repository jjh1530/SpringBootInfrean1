package jh.test;

import javax.transaction.Transactional;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;

import jh.test.domain.Member;

@SpringBootTest
class JpashopApplicationTests {

	
	@Test
	@Transactional
	@Rollback(false)
	void contextLoads() throws Exception{ 
	}
}
