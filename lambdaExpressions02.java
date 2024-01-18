Interface Executable{
  int execute();
    
}


class Runner 
  {

    public void run(Executable e)
    {
System.out.println("executing code block");

     int value  =  e.execute();

      System.out.println("The value is" +value);
      
      
    }
  }


class App
  {

    public static void main(String args[])
    {

      Runner r = new Runner();
      r.run(new Executable() {
void execute()
        {
          System.out.println("Hello World");
          return 7;
        }
        
      });
      Runner.run(()-> 7);
      

      
      
    }
  }
