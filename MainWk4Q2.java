package Week4;

public class MainWk4Q2 {
    public static void main(String[] args)  {
        
        StackOfIntegers stack= new StackOfIntegers();

        for (int i=0; i<10; i++)
        {
            stack.push(i);
        }
        System.out.println();
        
        while(!stack.isEmpty())
        {
            System.out.print(stack.pop()+" ");
        }
    }
}