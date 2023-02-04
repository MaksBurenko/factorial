import java.util.HashMap;
import java.util.Map;

public class Factorial {
    public static int factorial(int n){

        if(n < 0){
            throw new IllegalArgumentException("Argument must be positive");
        }

        if(n == 0){
            return 1;
        }

        int factorial = 1;
        for(int i = 1; i<=n; i++){

            factorial *= i;
        }
        return factorial;
    }

    public static int recursion(int n){

        if(n < 0){
            throw new IllegalArgumentException("Argument must be positive");
        }

        if(n == 0){
            return 1;
        }

        return n * recursion(n-1);
    }

    private final static Map<Integer,Integer> cache = new HashMap<>(){{
        put(0,1);
    }};

    public static int recursionWithCache(int n){

        if(n < 0){
            throw new IllegalArgumentException("Argument must be positive");
        }

        if(cache.containsKey(n)){
            return cache.get(n);
        }
        int result = n * recursionWithCache(n-1);
        cache.put(n,result);
        return result;
    }
}
