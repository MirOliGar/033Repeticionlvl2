/* 
 * Copyright 2020 Mireia Oliver García - mireia.oliver.11@gmail.com.
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

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Mireia Oliver García - mireia.oliver.11@gmail.com
 */
public class Main {

    public static final Scanner SCN
            = new Scanner(System.in, "Windows-1252")
                    .useLocale(Locale.ENGLISH).useDelimiter("\\s+");

    public static void main(String[] args) {
        //Horas
        final int HOR_MIN = 0;
        final int HOR_MAX = 23;
        //Minutos
        final int MIN_MIN = 0;
        final int MIN_MAX = 59;

        //Variables
        int h;
        int m;

        //Semáforo
        boolean horOK = false;
        boolean minOK = false;

        //Introducir hora (repetir para min)
        do {

            try {
                //Entrada teclado - hora
                System.out.print("Hora .....: ");
                h = SCN.nextInt();

                //Actualización
                if (h >= HOR_MIN && h <= HOR_MAX) {
                    horOK = true;
                } else {
                    System.out.println("ERROR. Rango Incorrecto");
                }

            } catch (Exception e) {
                System.out.println("ERROR. Entrada Incorrecta");
            } finally {
                SCN.nextLine();
            }

        } while (!horOK);
        
        //Introducir minutos
        do {

            try {
                //Entrada teclado - hora
                System.out.print("Minutos .....: ");
                m = SCN.nextInt();

                //Actualización
                if (m >= MIN_MIN && m <= MIN_MAX) {
                    minOK = true;
                } else {
                    System.out.println("ERROR. Rango Incorrecto");
                }

            } catch (Exception e) {
                System.out.println("ERROR. Entrada Incorrecta");
            } finally {
                SCN.nextLine();
            }

        } while (!minOK);

    }
}
