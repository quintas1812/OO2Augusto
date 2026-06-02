package com.unrn.oo2.tp3.modelo.ejercicio3;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface LogMethod {
}
// mvn clean compile exec:java --% -Dexec.mainClass=com.unrn.oo2.tp3.fronted.ejercicio3.Main