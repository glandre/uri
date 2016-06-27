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

package problem1018;

import java.util.Scanner;

/**
 * @author Geraldo B. Landre <geraldo.landre@gmail.com>
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int value = scanner.nextInt();
        int[] bancknotes = {100, 50, 20, 10, 5, 2, 1};
        
        int[] wallet = new int[7];
        
        int i = 0;
        int temp = value;
        do {
            if(temp - bancknotes[i] >= 0) {
                wallet[i]++;
                temp -= bancknotes[i];
            }
            else {
                i++;
            }
        } while (temp > 0);
        
        System.out.printf("%d\n", value);
        for(int cell = 0; cell < bancknotes.length; cell++) {
            System.out.printf("%d nota(s) de R$ %d,00\n", wallet[cell], bancknotes[cell]);
        }
    }

}
