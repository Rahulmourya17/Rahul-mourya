import java.io.InputStreamReader;

class stackk {
    int arr[] = new int[5];
    int top = 0;

    public void push(int data) {
        arr[top] = data;
        top++;
    }

    public void show() {
        for (int n : arr) {
            System.out.print(n + " ");

        }
    }
}



public class stac {
   public static void main(String[] args){
       stackk num=new stackk();
       num.push(10);
       num.push(20);
       num.show();
   }
    }


