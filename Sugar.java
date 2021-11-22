class Sugar extends Cookie {  
  public String shape;
  public boolean isDecorated;

public Sugar(){
shape = "";
isDecorated = false;
}

public Sugar(String aShape){
  shape = aShape;
  isDecorated = false;
}

String getShape(){
  return shape;
}

void setShape(String aShape){
  shape = aShape;
}

void cutOut(String aShape, int number ){
  super.setNumber(number);
  System.out.println(number + " cookies were cut into " + aShape);
}

void decorate(){
  super.getIsReady();
  if(isReady == true){
    System.out.println("The cookies were decorated");
    isDecorated = true;
  }
  else if(isReady == false){
    System.out.println("Make sure to bake cookies first");
    isDecorated = false;
  }
  }
}
