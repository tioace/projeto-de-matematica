import java.lang.Math; 

public class DistanciaPonto{
    private double y;
    private double x;

    public DistanciaPonto(double x, double y){
        super(); 
        this.setX(x);
        this.setY(y);
    }

    public void setX(double x){
        this.x = x; 
    }

    public double getX(){
        return this.x; 
    }

    public void setY(double y){
        this.y = y; 

    }

    public double getY(){
        return this.y; 
    }

   /*  √((x2 - x1)² + (y2 - y1)²)*/
    public double Distancia(DistanciaPonto ponto){
        double dis = Math.sqrt(Math.pow(ponto.x-this.x,2)+Math.pow(ponto.y-this.y,2));
        return dis; 
    }

    @Override
    public String toString() {
        String t = "(" + x + ", " + y + ")"; 
        return t;
    }
    /*public String toString(){
       
       
        String t = String.format("A distância entre os pontos (" + x + ", " + y + ") e (" + Distancia(ponto).x + ", " + y2 + ") é: " Dis);
        return t; 
    }*/

}


/* 

public class DistanciaPonto {
    private double x;
    private double y;

    public DistanciaPonto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double calcularDistancia(DistanciaPonto outroPonto) {
        return Math.sqrt(Math.pow((outroPonto.x - this.x), 2) + Math.pow((outroPonto.y - this.y), 2));
    }
}*/
