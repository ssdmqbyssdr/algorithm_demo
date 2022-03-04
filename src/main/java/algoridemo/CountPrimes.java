package algoridemo;

import org.junit.Test;

/**
 * 统计n以内的素数
 * 素数：只能被1和自身整除的数，0、1除外
 */
public class CountPrimes {
    public int countPrimes(int n){
        int ans = 0;
        for (int i = 2; i < n; ++i ){
            ans += isPrimes(i) ? 1:
                    0;
        }
        return ans;
    }

    public boolean isPrimes(int x){
        for (int i = 2; i*i <= x; ++i){
            if (x % i == 0){
                return false;
            }
        }
        System.out.println(x);
        return true;
    }

    @Test
    public  void main() {
        int n =20;
        System.out.println(countPrimes(n));
    }
}

