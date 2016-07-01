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

package problem1020;

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
        
        int days = scanner.nextInt();
        int[] dividers = {365, 30};
        DivisionArray array = new DivisionArray(dividers);
        array.divide(days);
        int[] divided = array.getDivided();
        System.out.printf("%d ano(s)\n%d mes(es)\n%d dia(s)\n", divided[0], divided[1], array.getRest());
    }

}

/**
 *
 * @author Geraldo B. Landre <geraldo.landre@gmail.com>
 */
class DivisionArray {
    private final int[] dividers;
    private int[] divided;
    private int rest;

    public DivisionArray(int[] dividers) {
        if(dividers != null) {
            this.dividers = dividers;
            this.divided = new int[dividers.length];
        }
        else {
            this.dividers = new int[0];
        }
    }

    public void divide(int value) {
        this.rest = value;
        int i = 0;
        while(this.rest > 0 && i < dividers.length) {
            divided[i] = this.rest / dividers[i];
            this.rest %= dividers[i];
            i++;
        }
    }

    public int[] getDivided() {
        return this.divided;
    }

    public int getRest() {
        return rest;
    }

}