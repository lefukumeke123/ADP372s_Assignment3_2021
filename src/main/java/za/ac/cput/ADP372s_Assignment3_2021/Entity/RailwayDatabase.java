package za.ac.cput.ADP372s_Assignment3_2021.Entity;

public class RailwayDatabase {


    private int id;


    public RailwayDatabase(RailwayDatabase railwayDatabase) {
    }

    private RailwayDatabase(Builder builder){

        this.id = builder.id;
    }

    @Override
    public String toString() {
        return "RailwayDatabase{" +
                "id=" + id +
                '}';
    }
    public static class Builder {

        private int id;
    }

    public RailwayDatabase setId(int id) {
        this.id = id;

        return this;
    }
    public RailwayDatabase build () {

        return new RailwayDatabase(this);
    }

    public RailwayDatabase copy(RailwayDatabase railwayDatabase ){
       this.id = railwayDatabase.id;

       return this;

    }
}

