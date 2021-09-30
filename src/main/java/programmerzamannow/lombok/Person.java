package programmerzamannow.lombok;

import lombok.*;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Person {

  private String id;

  private String name;

  private Integer age;

  @Singular
  private List<String> hobbies;
}
