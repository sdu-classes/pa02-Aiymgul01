class Person{
    private String name;
    private String address;
     Person(String n, String add){
      this.name = n;
      this.address = add;
    }
    public String getName(){
         return name;
    }
    public String getAddress(){
         return address;
    }
    public void setAddress(String address){
         this.address = address;
    }
    public String toString(){
        return String.format("Person[name=\"%s\",address =\"%s\"]", name, address);
    }
}
