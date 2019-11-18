/* 
 * Copyright 2019 Bianca Antonela Glavan - biancaantonela.glavan.alum@iescamp.es.
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
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Bianca Antonela Glavan - biancaantonela.glavan.alum@iescamp.es
 */
public class Main {

    public static final Scanner SCN
            = new Scanner(System.in, "Windows-1252")
                    .useLocale(Locale.ENGLISH).useDelimiter("\\s+");

    public static final Random RND = new Random();

    public static void main(String[] args) {

        final int MIN = 0;
        final int MAX = 10;
        final int NUM = 4;
        //int plantas = 10;
        //int persona = 4;
        boolean entradaOK;
        boolean testOK;
        int planta = 0;

        for (int i = 0; i < NUM; i++) {
            testOK = false;
            do {
                entradaOK = false;
                do {
                    try {
                        System.out.printf("Persona %02d introduce planta: ", i + 1);
                        planta = SCN.nextInt();
                        entradaOK = true;
                    } catch (Exception e) {
                        System.out.println("ERROR");
                    } finally {
                        SCN.nextLine();
                    }
                } while (!entradaOK);
                testOK = planta >= MIN && planta <= MAX;
            } while (!testOK);
            System.out.printf("Persona %02d - Planta %02d%n", i + 1, planta);
        }

    }

}
