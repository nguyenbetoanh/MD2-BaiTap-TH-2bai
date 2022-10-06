package ra;

public class AbsoluteNumberCalculator {
    public static int findAbsolute(int number) {
        int absNumber;
        if (number>=0){
          absNumber = number;

        }else {
            absNumber=-number;
        }
        return absNumber;
    }
}
