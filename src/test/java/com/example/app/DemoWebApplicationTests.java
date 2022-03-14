package com.example.app;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/*@SpringBootTest*/
class DemoWebApplicationTests {
	calculator c=new calculator();

	@Test
	void itShouldAddTwoNbrs() {
		int nbrOne=20;
		int nbrTwo=30;
		int result=c.add(nbrOne, nbrTwo);
		assertThat(result).isEqualTo(50);
	}
	
	class calculator
	{
		int add(int a, int b) { return a+b;}
	}

}
