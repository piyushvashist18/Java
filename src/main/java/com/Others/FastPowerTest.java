package src.main.java.com.Others;

import org.junit.*;

import java.math.BigInteger;

import static org.junit.Assert.*;

public class FastPowerTest {

    void testLong(long n, long k, long m){
        long result = FastPower.calculate(n,k,m);
        assertEquals(result, BigInteger.valueOf(n).modPow(BigInteger.valueOf(k), BigInteger.valueOf(m)).longValue());
    }

    void testBigInteger(BigInteger n, BigInteger k, BigInteger m){
        BigInteger result = FastPower.calculate(n,k,m);
        assertEquals(result, n.modPow(k,m));
    }

    @Test
    public void test() {
        testLong(2,2,10);
        testLong(100,1000,20);
        testLong(123456,123456789,234);

        testBigInteger(BigInteger.TEN,BigInteger.TEN, BigInteger.valueOf(4));
        testBigInteger(new BigInteger("123456"), new BigInteger("123456789"), new BigInteger("234"));
        testBigInteger(new BigInteger("123456789101112"), new BigInteger("12345678910111213"), new BigInteger("567890"));

    }
}