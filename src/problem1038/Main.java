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
package problem1038;

import java.io.IOException;
import java.util.Scanner;

/**
 * Problem 1038.
 * @author Geraldo B. Landre <geraldo.landre@gmail.com>
 */
public class Main {

    /**
     * Problem 1038. Using the following table, write a program that reads a
     * code and the amount of an item. After, print the value to pay. This is a
     * very simple program with the only intention of practice of selection
     * commands. CODE - SPECIFICATION - PRICE 1 - Cachorro Quente - R$ 4.00 2 -
     * X-Salada - R$ 4.50 3 - X-Bacon - R$ 5.00 4 - Torrada Simples - R$ 2.00 5
     * - Refrigerante - R$ 1.50
     *
     * @param args the command line arguments
     * @throws java.io.IOException
     *
     */
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        int code = scanner.nextInt();
        int amount = scanner.nextInt();

        double[] table = {4, 4.5, 5, 2, 1.5};

        System.out.printf("Total: R$ %.2f\n", table[code - 1] * amount);
    }

}
