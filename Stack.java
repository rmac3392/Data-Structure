public class Stack{
   int[] arr;
   int size;
   int top;
   Stack(int size){
      this.size = size;
      arr = new int[size];
      top = -1;
   }
   
   public boolean isFull(){
      return (top==size-1);
   }
   public boolean isEmpty(){
      return (top==-1);
   }
   public int peek(){
      return (isEmpty())? -99999:arr[top];
   }
   
   public boolean push(int item){
      if(isFull()){
         System.out.println("Stack is full");
         return false;
      }
      top++;
      arr[top] = item;
      return true;
   }
   
   public int pop(){
      if(isEmpty()){
         System.out.println("Stack is empty");
         return -999999;
      }
      int temp = top;
      top--;
      return arr[temp];
   }
   
   public void display(){
      for(int i = top; i > -1;i--){
         System.out.print(arr[i]+" => ");
      }
      System.out.println("null");
   }
}