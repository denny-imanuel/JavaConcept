import java.util.ArrayList;

public class TwoDim {

    public void DoubleArray() {
        var arr = new int[3][5];
        for (int x=0; x<3; x++) {
            for (int y = 0; y < 5; y++) {
                arr[x][y] = x + y;
            }
        }
        for (int x=0; x<arr.length; x++) {
            for (int y=0; y<arr[0].length; y++) {
                System.out.println("arr["+ x +"]["+ y +"]=" + arr[x][y]);
            }
        }
    }

    public void DoubleList() {
        var listx = new ArrayList<ArrayList<Integer>>();
        for (int x=0; x<3; x++) {
            var listy = new ArrayList<Integer>();
            for (int y=0; y<5; y++) {
                listy.add(x + y);
            }
            listx.add(listy);
        }
        for (int x=0; x<listx.size(); x++) {
            for (int y=0; y<listx.get(0).size(); y++) {
                System.out.println("list["+ x +"]["+ y +"]=" + listx.get(x).get(y));
            }
        }
    }

    public void DualLoop() {
        for (int x=0; x<3; x++) {
            for (int y=0; y<5; y++) {
                System.out.println("iter["+x+"]["+y+"]");
            }
        }
    }

    public void DualStartLoop() {
        for (int x=0; x<3; x++) {
            for (int y=x; y<5; y++) {
                System.out.print("iter["+x+"]["+y+"]");
            }
        }
    }

    public void DualEndLoop() {
        for (int x=0; x<5; x++) {
            for (int y=0; y<x; y++) {
                System.out.println("iter["+x+"]["+y+"]");
            }
        }
    }

    public void DualAndLoop() {
        for (int x=0, y=0; x<3 && y<5; x++, y++) {
            System.out.println("iter["+ x +"]["+ y +"]");
        }
    }

    public void DualOrLoop() {
        for (int x=0, y=0; x<3 || y<5; x++, y++) {
            System.out.println("iter["+ x +"]["+ y +"]");
        }
    }
}
