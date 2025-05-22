public class Ponto {
    private double x;
    private double y;

    Ponto(){
        this.x= 0;
        this.y= 0;
    }
    Ponto(double x, double y){
        this.x = x;
        this.y = y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
    public double calcularDistancia(Ponto p){
        double deltax = p.getX() - this.x;
        double deltay = p.getY() - this.y;
        return Math.sqrt(Math.pow(deltax, 2) - Math.pow(deltay,2));
    }
    // Sobrecarga: calcular distância até coordenadas (x, y)
    public double calcularDistancia(double x, double y){
        double dx = x- this.x;
        double dy = y - this.y;
        return Math.sqrt(Math.pow(dx, 2) - Math.pow(dy,2));
    }
}
