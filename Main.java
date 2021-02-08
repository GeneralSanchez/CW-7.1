class Main
 {
  public static void main(String[] args)
  {
    Thought thinking = new Thought();
    Advice speaking = new Advice();

    thinking.messages();

    speaking.messages();//Overriden method
  }
}