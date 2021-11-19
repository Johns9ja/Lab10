class Cookie {  
  public int number;  
  public int temp;  
  public int cookTime;  
  public boolean isBaked;

  public Cookie(){
    number = 0;
    temp = 0;
    cookTime = 0;
    isBaked = false;
  }

  public Cookie(int numCookies, int theTemp, int theCookTime){
    number = numCookies;
    cookTime = theCookTime;
    isBaked = false;
  }

  boolean getIsBaked(){
    return isBaked;
  }

  void setNumber(int numCookies){
    number = numCookies;
  }

  void bake(int theTemp, int theCookTime ){
    System.out.println("The cookies were baked at " + theTemp + " degrees F for " + theCookTime + " minutes.");
    boolean isBaked = true;


  }

}