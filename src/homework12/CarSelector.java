package homework12;

public class CarSelector {

    public Car getCar(RoadType roadType) {
        Car car = null;
        switch (roadType) {
            case CITY:
                car = new Porsche();
                break;
            case OFF_ROAD:
                car = new Jeep();
                break;
            case LAWN:
                car = new NewJeep();
                break;

        }
        return car;
    }
}

