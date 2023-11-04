import math

class DistanciaPonto:
    def __init__(self, x, y):
        self.x = x
        self.y = y

    def calcular_distancia(self, outro_ponto):
        return math.sqrt((outro_ponto.x - self.x) ** 2 + (outro_ponto.y - self.y) ** 2)

class Main:
    def __init__(self):
        pass

    def run(self):
        print("Digite as coordenadas do primeiro ponto:")
        x1 = float(input("Coordenada x: "))
        y1 = float(input("Coordenada y: "))

        print("\nDigite as coordenadas do segundo ponto:")
        x2 = float(input("Coordenada x: "))
        y2 = float(input("Coordenada y: "))

        ponto1 = DistanciaPonto(x1, y1)
        ponto2 = DistanciaPonto(x2, y2)

        distancia = ponto1.calcular_distancia(ponto2)

        print(f"\nA distância entre os pontos ({x1}, {y1}) e ({x2}, {y2}) é: {distancia:.2f}")


# Instanciar e executar a classe Main
if __name__ == "__main__":
    programa = Main()
    programa.run()
