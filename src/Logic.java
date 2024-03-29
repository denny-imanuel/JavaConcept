// the class explain how to use the basic logical operation in java
public class Logic {

    // how to use for loop
    public void ForLoop() {
        for (int i=0; i<10; i++) {
            System.out.println(i);
        }
    }

    // how to use nested for
    public void NestedFor() {
        for (int x=0; x<3; x++) {
            for(int y=0; y<5; y++) {
                System.out.println(x + "," + y);
            }
        }
    }

    // how to use dual loop with and operator
    public void AndLoop() {
        for (int x=0, y=0; x<3 && y <5; x++, y++) {
            System.out.println(x + "," + y);
        }
    }

    // how to use dual loop with or operator
    public void OrLoop() {
        for (int x=0, y=0; x<3 || y <5; x++, y++) {
            System.out.println(x + "," + y);
        }
    }

    // how to use for each function in java
    public void ForEach() {
        var arr = new int[] {1,2,3,4,5};
        for(var itm: arr) {
            System.out.println(itm);
        }
    }

    // how to use if then else in java
    public void IfThenElse() {
        var val=0;
        if (val<0) {
            System.out.println("Negative");
        }
        else if (val>0) {
            System.out.println("Positive");
        }
        else {
            System.out.println("Zero");
        }
    }

    // how to use switch case in java
    public void SwitchCase() {
        enum Size {S, M, L};
        Size mySize = Size.M;
        switch (mySize){
            case S: System.out.println("Small");
                break;
            case L: System.out.println("Large");
                break;
            default: System.out.println("Medium");
                break;
        }

    }

    // how to use while do loop in java
    public void WhileDo() {
        int i = 0;
        while(i < 10) {
            System.out.println(i);
            i++;
        }
    }

    // how to use do while loop in java
    public void DoWhile() {
        int i = 0;
        do {
           System.out.println(i);
           i++;
        }
        while (i<10);
    }


}
