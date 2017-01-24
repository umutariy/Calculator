public class Calculator{
  public static void main(String[] parameters){
    if(parameters[0].equals("add")){
      double num1=Double.parseDouble(parameters[1]);
      double num2=Double.parseDouble(parameters[2]);
      System.out.println(num1+num2);
    }
    else if(parameters[0].equals("subtract")){
      double num1=Double.parseDouble(parameters[1]);
      double num2=Double.parseDouble(parameters[2]);
      System.out.println(num1-num2);
    }
  }
}

