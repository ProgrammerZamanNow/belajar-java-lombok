package programmerzamannow.lombok;

import lombok.Cleanup;
import lombok.Lombok;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;

import java.io.FileReader;
import java.util.Scanner;

@Slf4j
public class FileHelper {

  @SneakyThrows
  public static String loadFile(String file) {
    log.info("Load file {}", file);
    @Cleanup FileReader fileReader = new FileReader(file);
    @Cleanup Scanner scanner = new Scanner(fileReader);

    StringBuilder builder = new StringBuilder();
    while (scanner.hasNextLine()){
      builder.append(scanner.nextLine()).append("\n");
    }

    return builder.toString();
  }

}
