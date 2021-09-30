package programmerzamannow.lombok;

import lombok.*;

@Getter
@AllArgsConstructor(staticName = "create")
@NoArgsConstructor(staticName = "createEmpty")
@ToString(exclude = {
    "password"
})
public class Login {

  @Setter(value = AccessLevel.PROTECTED)
  private String username;

  @Setter(value = AccessLevel.PROTECTED)
  private String password;
}
