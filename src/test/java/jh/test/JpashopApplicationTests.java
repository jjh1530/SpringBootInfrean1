package jh.test;

import javax.transaction.Transactional;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;

@SpringBootTest
class JpashopApplicationTests {

	@Autowired
	MemberRepository memberRepository;
	
	@Test
	@Transactional
	@Rollback(false)
	void contextLoads() throws Exception{ 
		Member member = new Member();
		member.setUsername("memeberA");
		Long saveId = memberRepository.save(member);
		
		Member findMember =  memberRepository.find(saveId);
		
		Assertions.assertThat(findMember.getId().equals(member.getId()));
		Assertions.assertThat(findMember.getUsername().equals(member.getUsername()));
		Assertions.assertThat(findMember).isEqualTo(member);
		System.out.println("findmember == member : " + (findMember == member));
	}
}
