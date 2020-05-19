public class Countries {
    
    private String setName;
    private String setCapital;
    private String setRegion;

    public static void main(String[] args) {
        Countries country2 = new Countries();
        country2.setName = ("La Republica Dominicana");
        country2.setCapital = ("Santo Domingo");
        country2.setRegion = ("el  Caribe");

        System.out.println(country2.getName());
        System.out.println(country2.getCapital());
        System.out.println(country2.getRegion());

        Countries country1 = new Countries ("Puerto Rico", "San Juan", "El Caribe");
        System.out.println(country1.getName());
        System.out.println(country1.getCapital());
        System.out.println(country1.getRegion());
    }

        private String name, capital, region;

        Countries(){
            this.name = "Cuba";
            this.capital = "la Habana";
            this.region = "El Caribe";
        }

        Countries(String name, String capital, String region){
            this.name = name;
            this.capital = capital;
            this.region = region;
        }

        public String getName(){
            return name;
        }
        public String getCapital(){
            return capital;
        }
        public String getRegion(){
            return region;
        }
        public void setName(String name){
            this.name = name;
        }
        public void setCapital(String capital){
            this.name = capital;
        }
        public void setRegion(String region){
            this.name = region;
        }
}