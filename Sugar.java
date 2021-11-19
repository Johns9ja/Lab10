class Sugar extends Cookie {  
  private String shape;
  private boolean isDecorated;

Sugar(){
shape = "";
isDecorated = false;
}

Sugar(String aShape){
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
  System.out.println(number + " cookies were cut into " + aShape);
}

void decorate(){
  super.getIsBaked();
  if(isBaked = true){
    System.out.println("The cookies were decorated.");
  }
  else{
    System.out.println("Make sure to bake cookies first");
  }
  }
}
