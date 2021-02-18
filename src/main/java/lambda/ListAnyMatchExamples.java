package lambda;

import java.util.ArrayList;
import java.util.List;

import domains.ProductLambda;

public class ListAnyMatchExamples {	

  // https://stackoverflow.com/questions/47746443/java-how-to-use-stream-map-to-return-boolean/47746845
  public boolean status(List<String> myArray) {
        return myArray.stream().anyMatch(item -> here the logic related to x.status());
  }

}
