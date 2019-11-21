/* 
 * Copyright 2019 Lluís CP - aw.lluiscerda@gmail.com.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.main;

/**
 *
 * @author Lluís CP - aw.lluiscerda@gmail.com
 */
public class Main {
    public static void main(String[] args) {
         
// Constantes
        final String nombre = "Ruperta";
        final int CANICASINICIALES = 5;
        final int CANICASPERDIDAS= 4;
        final int CANICASFINALES;
               
        // Variables
        double restante;
        
        // Operaciones
        CANICASFINALES = CANICASINICIALES - CANICASPERDIDAS;
        // Mensaje
        System.out.println("Secuencia de Canicas");
        System.out.println("====================");
               
        // Salida consola
        System.out.printf("Nombre de la canica.........: %s%n", nombre);
        System.out.println("---");
        System.out.printf("Número de canicas inicial...: %d%n", CANICASINICIALES);
        System.out.printf("Número de canicas final.....: %d%n", CANICASFINALES);
        System.out.println("---");
        System.out.printf("Número de canicas perdidas..: %d%n", CANICASPERDIDAS); 
    }
    
}
