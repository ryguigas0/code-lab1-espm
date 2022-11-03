# Aula 0: Arrays, aleatoriedade e métodos

## Arrays: guardando mais valores em uma variável

Cria um array que guarde 42 inteiros

```java
    int[] x = new int[42];
    x[0] = 22; // Atribuir valor para um elemento
    // A contagem do índice do array começa no 0
    System.out.println(x); // Imprime o endereço de memória do array
    System.out.println(x[0]); // Imprime 22
    System.out.println(x[1]); // Imprime 0 (inteiro quando não atribui valor)
```

## Random: pegando valores (pseudo) aleatórios

```java
    Random r = new Random();
    r.nextInt(10); // Gera um número inteiro entre 0 e 9
    r.nextInt(10) + 1; // Gera um número inteiro entre 1 e 10
    r.nextInt() // Gera um número inteiro possível
    r.nextInt() % 100 // Gera um número inteiro entre 0 e 99
    r.nextDouble() * 90 // Gera um número real entre 0 e 90
```

## Métodos: isolando o código

```java
    // public -> Esse método pode ser acessado externamente
    // static -> Esse método pode ser usado sem criar um objeto da classe
    // tipoRetorno -> qual o tipo de retorno do dado
    // nomeFuncao -> qual o nome do método para ser chamado
    // tipoParametro -> qual o tipo do argumento que o método recebe
    // nomeParametro -> nome do argumento que o método recebe

    public static tipoRetorno nomeFuncao(tipoParametro nomeParametro, tipoParametro outroParametro){
        ...
        // 40000 linhas
        ...
        return resultado // Encerra a função e retorna esse valor
    }

    // void -> sem valor de retorno
    public static void main (String args[]){
        nomeFuncao(42, "life"); // a função recebe argumentos
        nomeFuncao(32, "sadness");
        nomeFuncao(22, "hapiness");
        nomeFuncao(12, "lawless");
        // 4 linhas que valem por 160000 linhas
    }

    // Vários métodos com o mesmo nome, mas parâmetros diferente -> SOBRECARGA de métodos
```
