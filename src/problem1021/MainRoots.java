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

package problem1021;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;

/**
 * @author Geraldo B. Landre <geraldo.landre@gmail.com>
 */
public class MainRoots {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        double quantia = Double.parseDouble(br.readLine());
        int quantiaEmCentavos = (int) (quantia * 100);
        
        int notasDe100 = quantiaEmCentavos / 10000;
        int resto = quantiaEmCentavos % 10000;
        
        int notasDe50 = resto / 5000;
        resto = resto % 5000;
        
        int notasDe20 = resto / 2000;
        resto = resto % 2000;
        
        int notasDe10 = resto/1000;
        resto = resto % 1000;
        
        int notasDe5 = resto/500;
        resto = resto%500;
        
        int notasDe2 = resto/200;
        resto = resto%200;
        
        int moedasDe1real = resto/100;
        resto = resto%100;
        
        int moedasDe50 = resto/50;
        resto = resto%50;
        
        int moedasDe25 = resto/25;
        resto = resto%25;
        
        int moedasDe10 = resto/10;
        resto = resto%10;
        
        int moedasDe5 = resto/5;
        resto = resto%5;
        
        int moedasDe1centavo = resto;
        bw.write(String.format("NOTAS:\n"));
        bw.write(String.format("%d nota(s) de R$ 100,00\n", notasDe100));
        bw.write(String.format("%d nota(s) de R$ 50,00\n", notasDe50));
        bw.write(String.format("%d nota(s) de R$ 20,00\n", notasDe20));
        bw.write(String.format("%d nota(s) de R$ 10,00\n", notasDe10));
        bw.write(String.format("%d nota(s) de R$ 5,00\n", notasDe5));
        bw.write(String.format("%d nota(s) de R$ 2,00\n", notasDe2));
        bw.write(String.format("MOEDAS:\n"));
        bw.write(String.format("%d moeda(s) de R$ 1,00\n", moedasDe1real));
        bw.write(String.format("%d moeda(s) de R$ 0,50\n", moedasDe50));
        bw.write(String.format("%d moeda(s) de R$ 0,25\n", moedasDe25));
        bw.write(String.format("%d moeda(s) de R$ 0,10\n", moedasDe10));
        bw.write(String.format("%d moeda(s) de R$ 0,05\n", moedasDe5));
        bw.write(String.format("%d moeda(s) de R$ 0,01\n", moedasDe1centavo));
    }
}
