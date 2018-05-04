package de.gamue.example.lombok;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PersonTest {

  private static final String FIRST_NAME = "John";
  private static final String LAST_NAME = "Doe";
  private static final int AGE = 23;

  @Test
  public void testGetterAndSetter() {

    Person person = new Person();
    person.setFirstName(FIRST_NAME);
    person.setLastName(LAST_NAME);
    person.setAge(AGE);

    Assertions.assertEquals(FIRST_NAME, person.getFirstName());
    Assertions.assertEquals(LAST_NAME, person.getLastName());
    Assertions.assertEquals(AGE, person.getAge());
  }

  @Test
  public void testAllArgumentConstructor() {
    Person person = new Person(FIRST_NAME, LAST_NAME, AGE);

    Assertions.assertEquals(FIRST_NAME, person.getFirstName());
    Assertions.assertEquals(LAST_NAME, person.getLastName());
    Assertions.assertEquals(AGE, person.getAge());
  }
}
