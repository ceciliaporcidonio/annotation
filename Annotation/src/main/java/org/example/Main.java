package org.example;

public class Main {
    public static void main(String[] args) {
        // Usando reflection para acessar a anotação
        Class<Cliente> clienteClass = Cliente.class;

        if (clienteClass.isAnnotationPresent(Tabela.class)) {
            Tabela tabela = clienteClass.getAnnotation(Tabela.class);
            System.out.println("Nome da Tabela: " + tabela.valor());
        }
    }
}
