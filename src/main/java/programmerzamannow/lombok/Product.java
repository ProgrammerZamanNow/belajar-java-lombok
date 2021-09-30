package programmerzamannow.lombok;

import lombok.*;

@Data
@RequiredArgsConstructor
@AllArgsConstructor
@ToString(exclude = {
    "price"
})
public class Product {

  private final String id;

  private String name;

  private Long price;
}
