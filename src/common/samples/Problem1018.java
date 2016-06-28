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

package common.samples;

import common.DivisionArray;
import java.util.Scanner;

/**
 * @author Geraldo B. Landre <geraldo.landre@gmail.com>
 */
public class Problem1018 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        int length = 7;
        int[] bancknotes = {100, 50, 20, 10, 5, 2, 1};
        
        DivisionArray division = new DivisionArray(bancknotes);
        division.divide(value);
        int[] wallet = division.getDivided();
        
        System.out.printf("%d\n", value);
        for(int cell = 0; cell < length; cell++) {
            System.out.printf("%d nota(s) de R$ %d,00\n", wallet[cell], bancknotes[cell]);
        }
    }

}
