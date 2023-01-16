package FizzBuzz;

public class FizzBuzz extends PrintResults{
    protected int num;

    public FizzBuzz(int num) {
        this.num=num;
    }

    public boolean isDivibleBy(int num){
        return this.num%num==0;
    }

}

class PrintResults{

    public void print(String result){
        System.out.print(result+",");
    }
}
