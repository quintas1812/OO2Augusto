package com.unrn.oo2.tp3.modelo.ejercicio3;

import com.unrn.oo2.tp3.persistence.ejercicio3.SaveFile;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

import static org.apache.commons.lang3.ArrayUtils.toStringArray;

@Aspect
public class Log {

    @Before("execution(@com.unrn.oo2.tp3.modelo.ejercicio3.LogMethod * *(..))")
    public void logMethodCall(JoinPoint joinPoint) {
        String methodName = joinPoint.getSignature().getName();
        Object[] args = joinPoint.getArgs();
        String parametros = "sin parámetros";
        if(args.length ==3) {
            String[] params = toStringArray(args);
            parametros = params[0]+"|"+ params[1];// hago esto para sacar el parametro Save del mothod saveInscription
        }

        String logEntry = String.format("\"%s\", \"%s\", \"%s\"%n", methodName, parametros,
                LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss")));
        SaveFile save = new SaveFile("C:\\Users\\augus_r4ret8\\IdeaProjects\\OO2Augusto\\tp3Layers\\src\\log.txt");
        save.inscribir(logEntry);
    }
}
//Utilice la implementación del ejercicio 3 del TP de layers
//(RadioCompetition) y escriba una anotación @Log que permita marcar los
//métodos que queremos loguear cada vez que son llamados. Del método invocado
//se debe registrar su nombre y el valor de cada parámetro y la fecha/hora de
//invocación. Sobre el valor de cada parámetro, éstos deben estar separados
//por | (pipe) en caso que existan y en otro caso se registra “sin
//parámetros”. El logueo debe persistirse en un archivo de texto. Como prueba
//para la verificación de que lo implementado funciona, “aspectee” los
//métodos saveInscription y todosLosConcursos.
//El archivo de logueo debe quedar de la siguiente forma:
//“saveInscription”, “valor1|valor2”, “2024/07/21 15:30:32”
//“saveInscription”, “valor0|valor4”, “2024/07/21 15:30:34”
//“todosLosConcuros”, “sin parametros”, “2024/07/21 15:32:32”