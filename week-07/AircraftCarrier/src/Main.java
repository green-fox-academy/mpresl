public class Main {
    public static void main(String[] args) throws Exception {
        F16 f16 = new F16();
        Carrier carrier = new Carrier(500, 5000);
        carrier.addAircraft(new F16());
        carrier.addAircraft(new F35());
        carrier.addAircraft(new F16());
        carrier.addAircraft(new F35());
        carrier.addAircraft(new F35());
        carrier.addAircraft(new F16());
        carrier.addAircraft(new F35());
        carrier.addAircraft(new F35());
        carrier.addAircraft(new F35());
        carrier.addAircraft(new F16());
        carrier.addAircraft(new F35());

        carrier.fill();

        Carrier carrier2 = new Carrier(500, 1000);
        carrier2.addAircraft(new F35());
        carrier2.addAircraft(new F35());
        carrier2.addAircraft(new F35());
        carrier2.addAircraft(new F35());
        carrier2.fill();
        carrier.fight(carrier2);

        carrier.getStatus();
        System.out.println("");
        System.out.println("Carrier 2");
        carrier2.getStatus();
    }
    }


