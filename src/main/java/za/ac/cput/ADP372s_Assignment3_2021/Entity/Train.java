package za.ac.cput.ADP372s_Assignment3_2021.Entity;

public class Train {
    private String trainId, trainModel;

    private Train(Builder builder) {
        this.trainId = builder.trainId;
        this.trainModel = builder.trainModel;
    }


    @Override
    public String toString() {
        return "Train{" +
                "trainId='" + trainId + '\'' +
                ", trainModel='" + trainModel + '\'' +
                '}';
    }

    public static class Builder {

        private String trainId, trainModel;

        public Builder setTrainId(String trainId) {
            this.trainId = trainId;

            return this;
        }

        public Builder setTrainModel(String trainModel) {
            this.trainModel = trainModel;

            return this;
        }

        public Train build () {

            return new Train(this);
        }

        public Builder copy(Train train) {
            this.trainId = train.trainId;
            this.trainModel = train.trainModel;

            return this;
        }

    }
}
