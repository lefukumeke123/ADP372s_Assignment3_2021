package za.ac.cput.ADP372s_Assignment3_2021.Entity;

import sun.security.provider.certpath.Builder;

public class TicketClerk {

    private String name;
    private String location;

    public TicketClerk() {
    }

    private TicketClerk(Builder builder) {

       this.name = builder.name;
       this.location = builder.location;
    }



    @Override
    public String toString() {
        return "TicketClerk{" +
                "name='" + name + '\'' +
                ", location='" + location + '\'' +
                '}';
    }


    public static class Builder {
        private String name;
        private String location;

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setLocation(String location){
            this.location = location;
            return this;
        }


        public TicketClerk build() {

            return new TicketClerk(this);

        }

        public Builder copy(TicketClerk ticketclerk) {
            this.name = ticketclerk.name;
            this.location = ticketclerk.location;

            return this;
        }
    }
}
