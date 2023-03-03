class Main{
  public static void main(String[]args){
    //Our string is empty so it will return "True."
    //If it had text it would return "False."
    String name="jimbo";
    String string1=new String("abc");
    String string2=new String("abc");
    String string3="the sky is blue";
    
    //updated string 3
    String updatedstring3=string3.replace("blue","red");
   
    // (name.isEmpty());" Checking if out string is empty which it is. so it will return true.
     System.out.println(name.isEmpty());
    
    //We can check the length aswell.
    System.out.println(name.length());
    //Upper
    //lowercase,.toLowerCase());
    System.out.println(name.toUpperCase());

    //we can keep it the same aswell
    System.out.println(name); 
    
    //Strings1 and 2 are not equal because the value are the same, but not the same object. 
    System.out.println(string1==string2);
    
    //"==" checks if the objects on both sides are the same. So we must use the "equals" method to compare Strings.
    System.out.println(string1.equals(string2)); 
    //If we change"abc" to "Abc" it will return false. so we can use this equalsIgnoreCase method.
    System.out.println(string1.equalsIgnoreCase(string2));
    
    //Replacing words Strings string ="The sky is blue"
    //we can also jsut add a String that's updated and jsut println the updated String.
    System.out.println(string3.replace("blue","red"));
    //Updated "line 8,10 for update."
    System.out.println(updatedstring3);
  }
}