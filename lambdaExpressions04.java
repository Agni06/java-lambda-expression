Interface Executable{
int execute(int a,int b);

}

class Runner
  {

    int run(Executable e)
    {
System.out.println("executing code block");
      int value = e.execute(a,b);
      System.out.println("The value is:" +value);
      
      
      
    }
  }

class App
  {
 public static void main(String args[])
    {

Runner r = new Runner();
      r.run(new Executable() 
            {
            int execute(int a,int b)
              {
System.out.println("Hello world");
                return a+b;
              }
            })

        Runner.run((a,b)->
                   {
System.out.println("Hello world");

                     return 7+8;
                     
                     
                   })
      
    }
    
  }
