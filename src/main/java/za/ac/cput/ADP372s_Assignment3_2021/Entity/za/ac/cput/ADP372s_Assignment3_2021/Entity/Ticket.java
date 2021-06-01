package za.ac.cput.ADP372s_Assignment3_2021.Entity.za.ac.cput.ADP372s_Assignment3_2021.Entity;


/*
* Ticket Entity
*Asive Madladla 217068332
* 1 June 2021
 */
public class Ticket {
    private String startingLoc, destlocation;
    private int ticketNo, PassNo;

    private Ticket(Builder builder) {

        this.startingLoc = builder.startingLoc;
        this.destlocation = builder.destlocation;
        this.ticketNo = builder.ticketNo;
        this.PassNo = builder.PassNo;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "startingLoc='" + startingLoc + '\'' +
                ", destlocation='" + destlocation + '\'' +
                ", ticketNo=" + ticketNo +
                ", PassNo=" + PassNo +
                '}';
    }

    public static class Builder {
        private String startingLoc, destlocation;
        private int ticketNo, PassNo;

        public Builder setStartingLoc(String startingLoc) {
            this.startingLoc = startingLoc;
            return this;
        }

        public Builder setDestlocation(String destlocation) {
            this.destlocation = destlocation;
            return this;
        }

        public Builder setTicketNo(int ticketNo) {
            this.ticketNo = ticketNo;
            return this;
        }

        public Builder setPassNo(int passNo) {
            PassNo = passNo;
            return this;
        }

        public Ticket build() {

            return new Ticket(this);

        }

        public Ticket.Builder copy(Ticket ticket) {
            this.startingLoc = ticket.startingLoc;
            this.destlocation = ticket.destlocation;
            this.ticketNo = ticket.ticketNo;
            this.PassNo = ticket.PassNo;

            return this;
        }

    }
}
