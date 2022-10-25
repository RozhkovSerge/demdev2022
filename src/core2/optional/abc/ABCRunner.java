package core2.optional.abc;

import java.util.Objects;
import java.util.Optional;

public class ABCRunner {
    public static void main(String[] args) {

        C c = new C(Optional.ofNullable(1L));
//        B b = new B(Optional.ofNullable(c));
        B b = new B(Optional.ofNullable(c));
        A a = new A(Optional.ofNullable(b));
        Long id = null;

      if(a.getB().isPresent()) {
          b = a.getB().get();
      }

      if(b.getC().isPresent()) {
          c = b.getC().get();
      }

      if(c.getId().isPresent()) {
          id = c.getId().get();
      }
        System.out.println(id);
    }
}
