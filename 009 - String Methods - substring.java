class Main {
  public static void main(String[] args) {
    String str = "laptops out for harambe";
    int end = str.length();
    //write code below
   System.out.println(str.substring(5,end));
    System.out.println(str.substring(7,10));
    
    
    
    //fill in the blanks below:
    System.out.println(str.substring(16,end)); //fill in substring so it prints "harambe"
    System.out.println(str.substring(10,13)); //fill in substring so it prints "t f"
  }
}
