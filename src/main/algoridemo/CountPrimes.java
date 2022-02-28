package algoridemo;

import org.junit.Test;

/**
 * ͳ��n���ڵ�����
 * ������ֻ�ܱ�1����������������0��1����
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

