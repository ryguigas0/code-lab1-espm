# Aula 2

## Strings: guardando texto em uma variável

```java
String s0; // Cria uma variável que aceita string, mas sem valor
String s1 = new String(); // Cria uma string vazia
String s2 = "Eu sou uma string?!"; // Cria uma string e já atribui um valor

s2.length(); // Retorna quantos caracteres tem a string
s2.charAt(s2.length() - 1); // Retorna o caractere na posição, começando a contagem em 0
s2.equals("String eu sou??"); // Retorna verdadeiro para string iguais, falso para diferentes
s2.toUpperCase(); // Retorna a string com tudo em maiúsculo
s2.toLowerCase(); // Retorna a string com tudo em minúsculo
s2.replace('u', 'X'); // Retorna a string com o caractere antigo trocado pelo novo (EX soX Xma string?!)
s2.split(" "); // Retorna um String[] composto por strings separadas pelo padrão ({"Eu", "sou", "uma", "string?!"})
```
