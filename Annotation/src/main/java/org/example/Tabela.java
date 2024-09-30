package org.example;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)  // A anotação será usada em classes
@Retention(RetentionPolicy.RUNTIME)  // Disponível em tempo de execução
public @interface Tabela {
    String valor();  // Recebe o nome da tabela
}
