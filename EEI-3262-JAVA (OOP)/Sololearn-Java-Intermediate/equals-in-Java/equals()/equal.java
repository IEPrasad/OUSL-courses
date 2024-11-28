class Animal {
  String name;
  Animal(String n) {
    name = n;
  }
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((name == null) ? 0 : name.hashCode());
    return result;
  }
  @Override
  public boolean [b]equals[/b](Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Animal other = (Animal) obj;
    if (name == null) {
      if (other.name != null)
        return false;
    } else if (!name.equals(other.name))
      return false;
    return true;
  }
}

// as I think this code has an error 
// but this is good for understand the method of there  

/*
  equals() 
  Each object has a predefined equls() method that is used for semantical equality testing.
  But, to make it work for our classes, we need to override it and check the conditions we need.
  There is a simple and fast way of generating the equals() method, other than writing it manually.
  Just right click in your class, go to Source->Generate hasCode() and equals()...
*/

