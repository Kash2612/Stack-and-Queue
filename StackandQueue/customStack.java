public class customStack {

    protected int[] data;
    private static final int DEFAULT_SIZE=10;

    public customStack(){
        this(DEFAULT_SIZE); 
    }

    public customStack(int size){
        this.data=new int[size];
    }
    
    int ptr=-1;

    public boolean push(int item){
        if(isFull()){
            return false;
        }
        
        ptr++;
        data[ptr]=item;
        return true;

    }

    public int pop() throws Exception{
        if(isEmpty()){
            throw new Exception("cannot pop from empty stack")
        }
        return data[ptr];
        ptr--;
    }

    public int peek(){
        if(isEmpty()){
            throw new Exception("cannot peek from empty stack")
        }
        return data[ptr];
    }

    private boolean isFull(){
        return ptr==data.length-1;
    }

    private boolean isEmpty(){
        return ptr==-1;
    }
}
