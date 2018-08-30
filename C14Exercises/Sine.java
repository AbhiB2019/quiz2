class Sine {

    public static void main(String[] args) {
        
        double degrees = 90;
        for (int i = 0; i < 13; i++){
            double rads;
            rads = degrees * Math.PI / 180;
            double sine;
            sine = Math.sin(rads);
            System.out.println(degrees + "   " + sine);
            degrees = degrees - 15.0;


        }

    }

}
