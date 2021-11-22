class Cookie {  
  public int number;  
  public int temp;  
  public int cookTime;  
  public boolean isReady;

  public Cookie(){
    number = 0;
    temp = 0;
    cookTime = 0;
    isReady = false;
  }

  public Cookie(int numCookies, int theTemp, int theCookTime){
    number = numCookies;
    cookTime = theCookTime;
    isReady = false;
  }

  boolean getIsReady(){
    return isReady;
  }

  void setNumber(int numCookies){
    number = numCookies;
  }

  void bake(int theTemp, int theCookTime ){
    System.out.println("The cookies were baked at " + theTemp + " degrees F for " + theCookTime + " minutes");
    isReady = true;


  }

}