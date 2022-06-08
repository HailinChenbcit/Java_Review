package Day7;

import java.util.Objects;

public class Object1 {
  public static void main (String[] args) {
  
  }
}

/*
  finalize(): For garbage collection
  
 */

/*
  Object class is the parent class of all
  toString(): ClassName@Instance address in HexCode
  equals(): if two objects are equal
  == : if two primitive type values are equal
 */

class User {
  String name;
  Address address;
  
  public User(){}
  
  public User (String name, Address address) {
    this.name = name;
    this.address = address;
  }
  
  @Override
  public boolean equals (Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    User user = (User) o;
    return Objects.equals(name, user.name) && Objects.equals(address, user.address);
  }
  
  @Override
  public int hashCode () {
    return Objects.hash(name, address);
  }
}

class Address {
  String city;
  String street;
  
  public Address(){}
  
  public Address (String city, String street) {
    this.city = city;
    this.street = street;
  }
}