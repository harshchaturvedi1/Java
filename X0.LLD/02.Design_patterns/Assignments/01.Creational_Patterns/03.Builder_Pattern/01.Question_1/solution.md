```java
// flights, hotel stays, tours
class Itinerary{
  private String flightNo;
  private String hotelStay;
  private String cabNo;

    private Itinerary(ItineraryBuilder itineraryBuilder){
      this.flightNo = itineraryBuilder.flightNo;
      this.hotelStay = itineraryBuilder.hotelStay;
      this.cabNo = itineraryBuilder.cabNo;
    }

    static class ItineraryBuilder{
        private String flightNo;
        private String hotelStay;
        private String cabNo;

        public ItineraryBuilder setFlightNo(String flightNo){
          this.flightNo = flightNo;
          return this;
        }

        public ItineraryBuilder setHotelStay(String hotelStay){
          this.hotelStay = hotelStay;
          return this;
        }

        public ItineraryBuilder setCabNo(String cabNo){
          this.cabNo = cabNo;
          return this;
        }

        public Itinerary build(){
            return new Itinerary(this);
        }
    }

    @Override
    public String toString(){
      return "Flight no " + flightNo + ", Hotel name " + hotelStay + ", Cab no " + cabNo;
    }
}

public class Main
{
    public static void main(String[] args) {
       Itinerary itr = new Itinerary.ItineraryBuilder()
                          .setFlightNo("13d22")
                          .setHotelStay("oyo")
                          .setCabNo("KA34E2345")
                          .build();

        System.out.println(itr.toString());
    }
}
```
