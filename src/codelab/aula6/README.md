# Aula 6: Criando novos tipos

## Classes: criando tipos compostos

Um aluno tem nome (string), RA (int), data de nascimento (string)
```java
public class Aluno {
    int registroAluno;
    String nome;
    String dataNascimento;

    public static void main (String args[]) {
        Aluno a = new Aluno(); 
        // new -> instancia um novo objeto na memória, rodando o método construtor
        // a -> variável referencia o objeto
        System.out.println(a); // Aluno@7ad041f3 -> classe@enderecoHexadecimalDoObjetoNaMemoria
        System.out.println(a.registroAluno); // retorna 0
        System.out.println(a.nome); // retorna null
    }
}
```

Importando classes
```java
// Arquivo ./Aluno.java
public class Aluno {
    int registroAluno;
    String nome;
    String dataNascimento;
    double nota1;
    double nota2;

    // static -> Método que pode ser usado pela classe
    // Método que pode ser usado por um objeto, porque tem acesso aos dados do objeto
    public double calcularMedia(){
        return (this.nota1 + this.nota2) / 2;
    }

    public void printarAluno(){
        // ...
    }

    
}


// Arquivo ./Main.java
public class Main {
    public static void main (String args[]) {
        Aluno a = new Aluno(); 
        // new -> instancia um novo objeto na memória, rodando o método construtor
        // a -> variável referencia o objeto

        System.out.println(a); // Aluno@7ad041f3 -> classe@enderecoHexadecimalDoObjetoNaMemoria
        System.out.println(a.registroAluno); // retorna 0
        System.out.println(a.nome); // retorna null

        a.printarAluno(); // Métodos públicos são acessíveis
    }
}
```