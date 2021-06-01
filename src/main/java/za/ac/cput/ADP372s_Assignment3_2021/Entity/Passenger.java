/* Passenger.java
   Entity for the Passenger
   Author: Marvin Lamohr (214273830)
   Date: 01 June 2021
 */
package za.ac.cput.ADP372s_Assignment3_2021.Entity;

public class Passenger {

    private String Name, Address;
    private int Age;

    private Passenger(Builder builder){

    this.Name = builder.Name;
    this.Address = builder.Address;
    this.Age = builder.Age;

}

    @Override
    public String toString() {
        return "Passenger{" +
                "Name='" + Name + '\'' +
                ", Address='" + Address + '\'' +
                ", Age=" + Age +
                '}';
    }

    public static class Builder{

        private String Name, Address;
        private int Age;


        public Builder setName(String Name) {
            this.Name = Name;

            return this;
        }

        public Builder setAddress(String Address) {
            this.Address = Address;

            return this;
        }

        public Builder setAge(int Age) {
            this.Age = Age;

            return this;
        }

        public Passenger build(){

            return new Passenger(this);

        }
        public Builder copy(Passenger passenger){
            this.Name = passenger.Name;
            this.Address = passenger.Address;
            this.Age = passenger.Age;

            return this;
        }

    }
}
