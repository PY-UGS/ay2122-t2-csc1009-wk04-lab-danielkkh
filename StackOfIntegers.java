package Week4;

public class StackOfIntegers {
    
    private int[] elements;
    private int size;

    public StackOfIntegers() {
      
        this.elements= new int [16];
    }

    public StackOfIntegers(int capacity) {
      
        this.elements= new int[capacity];
    }

    public boolean isEmpty() {

        if (this.size==0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public int peek() {
        return this.elements[this.size-1];
    }

    public void push(int i){
        if (size>=this.elements.length)
        {
            System.out.println("ERROR!");
            System.exit(0);
        }
        else
        {
            this.elements[i]= i;
            this.size++;
        }
    }

    public int pop()
    {
      this.size--;
      return this.elements[this.size];
    }

    //Getter & Setter
    public int[] getElements() {
        return this.elements;
    }

    public void setElements(int[] elements) {
        this.elements = elements;
    }

    public int getSize() {
        return this.size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}