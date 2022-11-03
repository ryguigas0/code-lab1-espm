# Aula 3: Matrizes

## Matrizes: um vetor de vetores, um vetor bidimencional se me permite dizer

```java
int[][] matriz = new int[3][3]; // Cria a matriz 

// Primeiro `for` percorre as linhas e o segundo `for` percorre as colunas
for (int i = 0; i < matriz.length; i++) {
    for (int j = 0; j < matriz.length; j++) {
        int valor = r.nextInt(100);
            matriz[i][j] = valor;
        }
    }
```
