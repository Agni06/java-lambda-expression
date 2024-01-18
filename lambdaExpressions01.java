Interface Executable{
  void execute();
    
}

class Runner 
  {

    public void run(Executable e)
    {
System.out.println("executing code block");

      e.execute();
      
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
        }
        
      });
      Runner.run(()-> {System.out.println("Hello World");});
      

      
      
    }
  }
