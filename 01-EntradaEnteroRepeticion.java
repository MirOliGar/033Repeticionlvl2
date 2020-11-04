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

        int num = 0;
        boolean numOK = false;

        do {
            //Try, catch, finaly dentro.
            try {
                //Bloque
                System.out.print("Valor entero ....: ");
                num = SCN.nextInt();

                //Actualización
                numOK = true;
            } catch (Exception e) {
                System.out.println("ERROR: Entrada Incorrecta.");
            } finally {
                SCN.nextLine();
            }

        } while (!numOK);

        System.out.printf("Valor entero ....: %d%n", num);

    }
}
