```java
class Itinerary {
    private String flightNo;
    private String hotelStay;
    private String cabNo;
    private boolean insurancePlanSelected = false;
    private String insuranceNo;
    private boolean carRented = false;
    private String rentedCarNo;

    private Itinerary(ItineraryBuilder itineraryBuilder) {
        this.flightNo = itineraryBuilder.flightNo;
        this.hotelStay = itineraryBuilder.hotelStay;
        this.cabNo = itineraryBuilder.cabNo;
        this.insurancePlanSelected = itineraryBuilder.insurancePlanSelected;
        this.insuranceNo = itineraryBuilder.insuranceNo;
        this.carRented = itineraryBuilder.carRented;
        this.rentedCarNo = itineraryBuilder.rentedCarNo;
    }

    static class ItineraryBuilder {
        private String flightNo;
        private String hotelStay;
        private String cabNo;
        private boolean insurancePlanSelected = false;
        private String insuranceNo;
        private boolean carRented = false;
        private String rentedCarNo;

        public ItineraryBuilder setFlightNo(String flightNo) {
            this.flightNo = flightNo;
            return this;
        }

        public ItineraryBuilder setHotelStay(String hotelStay) {
            this.hotelStay = hotelStay;
            return this;
        }

        public ItineraryBuilder setCabNo(String cabNo) {
            this.cabNo = cabNo;
            return this;
        }

        public ItineraryBuilder setInsurance(String insuranceNo) {
            this.insurancePlanSelected = true;
            this.insuranceNo = insuranceNo;
            return this;
        }

        public ItineraryBuilder setRentedCarNo(String rentedCarNo) {
            this.carRented = true;
            this.rentedCarNo = rentedCarNo;
            return this;
        }

        public Itinerary build() {
            return new Itinerary(this);
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Flight no: ").append(flightNo)
          .append(", Hotel name: ").append(hotelStay)
          .append(", Cab no: ").append(cabNo);

        if (insurancePlanSelected) {
            sb.append(", Insurance no: ").append(insuranceNo);
        }

        if (carRented) {
            sb.append(", Rented car no: ").append(rentedCarNo);
        }

        return sb.toString();
    }
}

public class Main {
    public static void main(String[] args) {
       Itinerary itineraryWithExtras = new Itinerary.ItineraryBuilder()
                                                    .setFlightNo("13d22")
                                                    .setHotelStay("Oyo")
                                                    .setCabNo("KA34E2345")
                                                    .setInsurance("INS123456")
                                                    .setRentedCarNo("CAR98765")
                                                    .build();

System.out.println(itineraryWithExtras.toString());

Itinerary itineraryWithoutExtras = new Itinerary.ItineraryBuilder()
                                                .setFlightNo("45x78")
                                                .setHotelStay("Marriott")
                                                .setCabNo("KA12B6789")
                                                .build();

System.out.println(itineraryWithoutExtras.toString());

    }
}
```
