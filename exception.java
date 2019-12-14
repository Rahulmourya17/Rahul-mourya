import java.io.*;
class InvalidDateException extends Exception{
    public String toString()
    {
        return "Invalid Date Exception";
    }
}
class InvalidMonthException extends Exception{
    public String toString()
    {
        return "Invalid Month Exception";
    }
}
class date{
    int dd,mm,yyyy;
    void accept() throws InvalidDateException, InvalidMonthException {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter date");
            dd = Integer.parseInt(br.readLine());
            System.out.println("Enter Month");
            mm = Integer.parseInt(br.readLine());
            System.out.println("Enter year");
            yyyy = Integer.parseInt(br.readLine());
            if (dd < 1 || dd > 31) {
                throw new InvalidDateException();
            }
            if (mm < 1 || mm > 12)
            {
                throw new InvalidMonthException();
            }
            System.out.println("valid date");
        }
        catch (Exception e){
            System.out.println("Date"+dd+"month"+mm+"year"+yyyy);
        }

    }

    public void display() {

    }
}
public class exception {
    public static void main(String[] args) throws InvalidMonthException, InvalidDateException {
        date dt=new date();
        dt.accept();
        dt.display();
    }
}
