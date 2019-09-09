import java.io.*;
abstract class Staff{
    String name;
    String address;
    Staff(){

    }
    Staff(String name,String address)
    {
        this.name=name;
        this.address=address;
    }
}

class fulltime extends Staff{
    String dept;
    double salary;
    fulltime(){

    }
    fulltime(String name,String address,String dept,double salary){
        super(name,address);
        this.dept=dept;
        this.salary=salary;
    }
    public void display(){
        System.out.println("name"+name);
        System.out.println("address"+name);
        System.out.println("dept"+dept);
        System.out.println("salry"+salary);
    }
}
public class Staffs {
    public static void main(String[] args)throws IOException{
        int i;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter number of employees");
        int n=Integer.parseInt(br.readLine());
        fulltime full[]=new fulltime[n];
        for(i=0;i<n;i++){
            System.out.println("enter name:");
            String name=br.readLine();
            System.out.println("enter address:");
            String address=br.readLine();
            System.out.println("enter department:");
            String dept=br.readLine();
            System.out.println("enter salary:");
            double salary=Double.parseDouble(br.readLine());
            full[i]=new fulltime(name,address,dept,salary);
            full[i].display();;
        }

    }
}
