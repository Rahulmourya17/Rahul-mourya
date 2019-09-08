import java.io.*;
interface stack
{
    int size=100;
    void push(int num);
    int pop();
    boolean isEmpty();
    boolean isFull();

}

class intstack implements stack{
    int top;
    int[] data=new int[stack.size];
    intstack(){
        top=-1;
    }
    public void push(int num){
        data[++top]=num;
    }

    public int pop(){
        return data[top--];
    }
    public boolean isEmpty(){
        return top==-1;
    }
    public boolean isFull(){
        return top==stack.size-1;
    }
}


public class interfce {
    public static void main(String[] args)throws IOException{
        stack s=new intstack();
        BufferedReader br;
        InputStreamReader inputStreamReader = new InputStreamReader (System.in);
        br=new BufferedReader(inputStreamReader);
        int choice;
        do{
            System.out.println("1.push\n2.pop\n3.exit");
            System.out.println("enter your choice");
            choice=Integer.parseInt(br.readLine());
            switch(choice){
                case 1:if(s.isFull())
                    System.out.println("stack overflow");
                else {
                    System.out.println("enter the elements");
                    int num = Integer.parseInt(br.readLine());
                    s.push(num);
                    break;
                }
                case 2:if(s.isEmpty())
                    System.out.println("stack underflow");
                else
                    System.out.println("pooped value:"+s.pop());
                break;
            }
        }while(choice!=3);


    }
}
