public class MyStack {
    private int arr;
    private int size;
    private int index = 0;

    public MyStack(int size) {
        this.size = size;
        int[] arr = new int[size];

    }

    public void push(int E) {
        if (isFULL()) {
            throw new StackOverflowError("Stack is full");
        }
        arr[index] = element;
        index++;
        }
        public int pop () throws Exception{
        if (isEmpty()){
            throw new Exception("Stack is null");
        }
        }
    }
