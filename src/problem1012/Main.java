/*
 * Copyright (C) 2016 Geraldo B. Landre <geraldo.landre@gmail.com>
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 */

package problem1012;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * @author Geraldo B. Landre <geraldo.landre@gmail.com>
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String line = br.readLine();
        String[] input = line.split("\\s+");
        double a = Double.parseDouble(input[0]);
        double b = Double.parseDouble(input[1]);
        double c = Double.parseDouble(input[2]);
        
        double pi = 3.14159;
        
        double triangleArea = a * c / 2.0;
        double cirleRadius = pi * c * c;
        double trapeziumArea = (a+b)*c/2;
        double squareArea = b * b;
        double rectangleArea = a * b;
        
        bw.write(String.format(
                  "TRIANGULO: %.3f\n"
                + "CIRCULO: %.3f\n"
                + "TRAPEZIO: %.3f\n"
                + "QUADRADO: %.3f\n"
                + "RETANGULO: %.3f\n",
                triangleArea, cirleRadius, trapeziumArea, squareArea, rectangleArea));
        bw.close();
        br.close();
    }

}
