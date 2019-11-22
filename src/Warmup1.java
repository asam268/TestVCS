public class Warmup1 {

    public Warmup1(String str){
        System.out.println(delDel(str));
    }
    /*
    The parameter weekday is true if it is a weekday, and the parameter vacation is true if we are on vacation. We sleep
    in if it is not a weekday or we're on vacation. Return true if we sleep in.

    sleepIn(false, false) → true
    sleepIn(true, false) → false
    sleepIn(false, true) → true
     */
    public boolean sleepIn(boolean weekday, boolean vacation){
        return !weekday || vacation;
    }

    /*
    We have two monkeys, a and b, and the parameters aSmile and bSmile indicate if each is smiling. We are in trouble if
    they are both smiling or if neither of them is smiling. Return true if we are in trouble.

    monkeyTrouble(true, true) → true
    monkeyTrouble(false, false) → true
    monkeyTrouble(true, false) → false
     */
    public boolean monkeyTrouble(boolean aSmile, boolean bSmile){
        return (aSmile && bSmile) || (!aSmile && !bSmile);
    }

    /*
    Given a string, if the string "del" appears starting at index 1, return a string where that "del" has been deleted.
    Otherwise, return the string unchanged.

    delDel("adelbc") → "abc"
    delDel("adelHello") → "aHello"
    delDel("adedbc") → "adedbc"
     */
    public String delDel(String str){
        try {
            String temp = str.substring(1, 4);
            if (temp.equalsIgnoreCase("del")) {
                String s1 = str.substring(0, 1);
                String s2 = str.substring(4);
                return s1 + s2;
            }
            return str;
        } catch(StringIndexOutOfBoundsException e){
            return str;
        }
    }
}
