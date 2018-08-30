class DegtoRad {
    public static void main (String[] args) {
        double sine = Math.sin(30 * Math.PI / 180);
        double cosine = Math.cos(30 * Math.PI / 180);
        double sos = (sine * sine) + (cosine * cosine);
        System.out.println("sine: " + sine + " cosine: " + cosine + " sum of squares: " + sos );
        
    }
}