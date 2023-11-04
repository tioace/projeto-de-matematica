import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);  
        
        System.out.println("Digite as cordenadas do primeiro ponto: ");
        System.out.print("Coordenada x: ");
        double coorx = leitor.nextDouble();
        leitor.nextLine(); 
        System.out.print("Cordenada y: ");
        double coory = leitor.nextDouble();
        leitor.nextLine(); 

        System.out.println("\nDigite as cordenadas do segundo ponto: ");
        System.out.print("Coordenada x: ");
        double coor2x = leitor.nextDouble();
        leitor.nextLine(); 
        System.out.print("Coordenada y: ");
        double coor2y = leitor.nextDouble();
        leitor.nextLine(); 

        DistanciaPonto dp = new DistanciaPonto(coorx, coory);
        DistanciaPonto dp2 = new DistanciaPonto(coor2x, coor2y);

        double distancia = dp.Distancia(dp2);

        //System.out.println(String.format("\nA distância entre os pontos %s e $s eh: %.2f",dp.toString(), dp2.toString(), distancia));
        System.out.println("\nA distância entre os pontos " + dp.toString() + " e " + dp2.toString() + " eh: " + distancia);

        leitor.close();
    }
}

/* 
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite as coordenadas do primeiro ponto:");
        System.out.print("Coordenada x: ");
        double x1 = scanner.nextDouble();
        System.out.print("Coordenada y: ");
        double y1 = scanner.nextDouble();

        System.out.println("\nDigite as coordenadas do segundo ponto:");
        System.out.print("Coordenada x: ");
        double x2 = scanner.nextDouble();
        System.out.print("Coordenada y: ");
        double y2 = scanner.nextDouble();

        DistanciaPonto ponto1 = new DistanciaPonto(x1, y1);
        DistanciaPonto ponto2 = new DistanciaPonto(x2, y2);

        double distancia = ponto1.calcularDistancia(ponto2);

        System.out.printf("\nA distância entre os pontos (" + x1 + ", " + y1 + ") e (" + x2 + ", " + y2 + ") é: %.2f", distancia);

        scanner.close();
    }
}*/