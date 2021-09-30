package programmerzamannow.lombok;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class PersonTest {

  @Test
  void createViaConstructor() {

    var hobbies = new ArrayList<String>();
    hobbies.add("Game");
    hobbies.add("Read");
    hobbies.add("Traveling");

    var person = new Person("id", "name", 30, hobbies);

  }

  @Test
  void createViaSetter() {

    var hobbies = new ArrayList<String>();
    hobbies.add("Game");
    hobbies.add("Read");
    hobbies.add("Traveling");

    var person = new Person();
    person.setId("id");
    person.setName("name");
    person.setAge(30);
    person.setHobbies(hobbies);

  }

  @Test
  void createViaBuilder() {

    var person = Person.builder()
        .id("id")
        .name("name")
        .age(30)
        .hobby("Game")
        .hobby("Read")
        .hobby("Traveling")
        .build();

    System.out.println(person);

  }
}
