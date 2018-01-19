package pl.apka;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import pl.apka.controller.PersonController;
import pl.apka.model.Person;

import javax.validation.constraints.AssertTrue;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApkaApplicationTests {

	@Test
	public void pelnaOsoba() {
		PersonController controller=new PersonController();
		Person person=new Person("imie","nazwisko","dataUrodzenia","dataSmierci","miejsceUrodzenia","miejsceSmierci",1992,"miejsceObrony");
		Assert.assertTrue(controller.check(person));
	}

	@Test
	public void czescOsoby() {
		PersonController controller=new PersonController();
		Person person=new Person("","nazwisko","dataUrodzenia","dataSmierci","miejsceUrodzenia","miejsceSmierci",1992,"miejsceObrony");
		Assert.assertFalse(controller.check(person));
	}

	@Test
	public void getTest()
	{
		PersonController controller=new PersonController();
		Person person=new Person("imie","nazwisko","dataUrodzenia","dataSmierci","miejsceUrodzenia","miejsceSmierci",1992,"miejsceObrony");
		String nazwisko=person.getNazwisko();
		Assert.assertEquals("Czy nazwisko jest rowna"+nazwisko+" ","nazwisko",nazwisko);

	}



}
