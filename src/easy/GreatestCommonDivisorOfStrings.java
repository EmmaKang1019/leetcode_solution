package easy;

/**
 *
 For two strings s and t, we say "t divides s" if and only if s = t + t + t + ... + t + t (i.e., t is concatenated with itself one or more times).

 Given two strings str1 and str2, return the largest string x such that x divides both str1 and str2.
 * GCD(a, b) = GCD(b, a % b)
 임의의 두 자연수 a, b가 주어졌을때. 둘중 큰 값이 a라고 가정해보겠습니다.
 a를 b로 나눈 나머지를 n 이라고 하면 (a%b = n)
 n이 0일때,b가 최대 공약수(GCD)입니다.
 만약 n이 0이 아니라면, a에 b값을 다시 넣고 n를 b에 대입 한 후 다시 위에 step2부터 반복하면 됩니다.
 */
public class GreatestCommonDivisorOfStrings {
    public String gcdOfStrings(String str1, String str2) {
        if(!(str1 + str2).equals(str2+str1)) return "";
        int lenGCD = gcd(str1.length(), str2.length() );
        return str1.substring(0,lenGCD);
    }
    public static int gcd(int a, int b){
        int tmp , n;
        if(a < b){
            tmp = a;
            a = b;
            b = tmp;
        }
        while(b!=0){
            n = a%b;
            a = b;
            b = n;
        }
        return a;
    }
}
