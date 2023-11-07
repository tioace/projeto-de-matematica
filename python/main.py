import matplotlib.pyplot as plt

def calculate_distance(x1, y1, x2, y2):
    dx = x2 - x1
    dy = y2 - y1
    return ((dx ** 2) + (dy ** 2)) ** 0.5

def draw_line(x1, y1, x2, y2):
    plt.plot([x1, x2], [y1, y2], marker="o")
    '''plt.plot([dx, dy],marker="o")'''
    '''plt.plot([x2, y2], marker="o")'''
    ''' plt.plot([distancia], marker="o")'''
    plt.xlabel('X')
    plt.ylabel('Y')
    plt.title('Reta no Plano Cartesiano')
    plt.grid(True)
    plt.show()

def draw():
  plt.plot([distancia], marker="0")
  plt.xlabel('X')
  plt.ylabel('Y')
  plt.title('Reta no Plano Cartesiano')
  plt.grid(True)
  plt.show()
  
x1 = int(input("Digite a coordenada X do primeiro ponto: "))
y1 = int(input("Digite a coordenada Y do primeiro ponto: "))
x2 = int(input("\nDigite a coordenada X do segundo ponto: "))
y2 = int(input("Digite a coordenada Y do segundo ponto: "))

distancia = calculate_distance(x1, y1, x2, y2)
print(f"\nA distância entre os pontos ({x1}, {y1}) e ({x2}, {y2}) é {distancia:.2f}")

'''draw()'''
draw_line(x1, y1, x2, y2)