package programmerzamannow.lombok;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
public class Merchant {

  private final String id;

  private String name;

}
