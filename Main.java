class Main
 {
  public static void main(String[] args)
  {
    System.out.println ("Andy Sanchez, CW 7.1");
    Thought thinking = new Thought();
    Advice speaking = new Advice();

    thinking.message();

    speaking.message();//Overriden method
  }
}