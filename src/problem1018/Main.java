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
        int value = Integer.parseInt(br.readLine());
        int length = 7;
        int[] bancknotes = {100, 50, 20, 10, 5, 2, 1};
        
        DivisionArray division = new DivisionArray(bancknotes);
        division.divide(value);
        int[] wallet = division.getDivided();
        
        bw.write(String.format("%d\n", value));
        for(int cell = 0; cell < length; cell++) {
            bw.write(String.format("%d nota(s) de R$ %d,00\n", wallet[cell], bancknotes[cell]));
        }
        bw.close();
        br.close();
    }

}
    
class DivisionArray {
    private final int[] dividers;
    private int[] divided;

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
        int rest = value, i = 0;
        while(rest > 0 && i < dividers.length) {
            divided[i] = rest / dividers[i];
            rest %= dividers[i];
            i++;
        }
    }

    public int[] getDivided() {
        return this.divided;
    }

}
