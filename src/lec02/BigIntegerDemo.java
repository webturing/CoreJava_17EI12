package lec02;

import java.math.BigDecimal;
import java.math.BigInteger;


public class BigIntegerDemo {

    public static void main(String[] args) {
        BigInteger a = new BigInteger("1111111111111111111111111111111");
        System.out.println(a.pow(5));
        BigDecimal d = new BigDecimal("1.01");
        System.out.println(d.pow(365));

    }

}
