class Main {
  public static void main(String[] args) {
    
    Sugar tree = new Sugar("tree");

    tree.cutOut(tree.getShape(), 10);
    tree.bake(350, 12);

    Sugar aCookie = new Sugar();
    
    aCookie.decorate();


    
  }
}