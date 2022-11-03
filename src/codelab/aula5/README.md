# Aula 5: Recursividade

## Recursividade: chamando o próprio método
Fatorial sem recursividade
```java
private static double fatorial(int n) {
    double fact = 1;
    for (int i = n; i >= 1; i--) {
        fact = fact * i;
    }
    return fact;
}

```

Fatorial com recursividade
```java
private static double fatorialRecursivo(int n) {
    // Condição pra finalizar a recursividade
    if (n <= 1) {
        return 1;
    }

    return fatorialRecursivo(n - 1) * n;
    // O método é chamado novamente internamente
}
```