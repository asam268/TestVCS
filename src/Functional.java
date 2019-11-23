import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class Functional {

    private List<String> s_test;

    public Functional(){

    }

    public Functional(String[] strings){
        s_test = new ArrayList<>();
        s_test.addAll(Arrays.asList(strings));
        s_test = noX(s_test);

    }
    /*
    Given a list of integers, return a list where each integer is multiplied by 2.
    */
    public List<Integer> doubling(List<Integer> nums){
        nums.replaceAll(n -> n * 2);
        return nums;
    }

    /*
    Given a list of strings, return a list where each string has all its "x" removed.
    This ones
    */
    public List<String> noX(List<String> strings){
        return strings;
    }

    /*
    Given a list of integers, return a list where each integer is multiplied with itself.
     */
    public List<Integer> square(List<Integer> nums){
        nums.replaceAll(n -> n * n);
        return nums;
    }

    public List<String> getS_test() {
        return s_test;
    }
}
