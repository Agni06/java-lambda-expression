Interface Executable{
  int execute(int a);
    
}

class Runner 
  {

    public void run(Executable e)
    {
System.out.println("executing code block");

     int value =  e.execute(12);

      System.out.println("The value is " +value);
      
    }
  }


class App
  {

    public static void main(String args[])
    {

      Runner r = new Runner();
      r.run(new Executable() {
int  execute(int a)
        {
          System.out.println("Hello World");
          return 7+a;
        }
        
      });
      Runner.run((a)-> {System.out.println("Hello World");
                       return 7+a;
                       });
      

      
      
    }
  }
