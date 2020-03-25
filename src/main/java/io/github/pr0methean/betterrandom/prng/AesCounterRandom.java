package io.github.pr0methean.betterrandom.prng;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * A class that has the same fully-qualified name and serialVersionUID as
 * <a href="https://github.com/Pr0methean/BetterRandom/blob/master/betterrandom/src/main/java/io/github/pr0methean/betterrandom/prng/AesCounterRandom.java"
 * >the real AesCounterRandom</a>, but no fields or superclass. Used for testing readObjectNoData.
 */
public class AesCounterRandom implements Serializable {
  private static final long serialVersionUID = 4808258824475143174L;

  public static void main(String[] args) throws IOException {
    try (ByteArrayOutputStream baos = new ByteArrayOutputStream();
         ObjectOutputStream oos = new ObjectOutputStream(baos)) {
      oos.writeObject(new AesCounterRandom());
      for (byte b : baos.toByteArray()) {
        System.out.format("%02x", b);
      }
    }
    System.out.println();
  }
}
