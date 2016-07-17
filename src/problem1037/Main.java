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

package problem1037;

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
        
        double x = Double.parseDouble(br.readLine());
        String[] intervals = {
            "Fora de intervalo",
            "Intervalo [0,25]", 
            "Intervalo (25,50]", 
            "Intervalo (50,75]", 
            "Intervalo (75,100]",
            "Fora de intervalo"
        };
        
        int i = 0;
        if(x >= 0.00000) {
            i++;
            if(x > 25.00000) {
                i++;
                if(x > 50.00000) {
                    i++;
                    if(x > 75.00000) {
                        i++;
                        if(x > 100.00000) {
                            i++;
                        }
                    }
                }
            }
        }
        
        bw.write(String.format("%s\n", intervals[i]));
        bw.close();
        br.close();
    }

}
