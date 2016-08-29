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

package problem1040;

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
        
        float n1 = Float.parseFloat(input[0]);
        float n2 = Float.parseFloat(input[1]);
        float n3 = Float.parseFloat(input[2]);
        float n4 = Float.parseFloat(input[3]);
        float media = (n1 * 2 + n2 * 3 + n3 * 4 + n4 * 1)/10;
        
        bw.write(String.format("Media: %.1f\n", media));
        if(media >= 7.0) {
            bw.write(String.format("Aluno aprovado.\n"));
        }
        else if(media >= 5.0) {
            bw.write(String.format("Aluno em exame.\n"));
            line = br.readLine();
            double exame = Double.parseDouble(line);
            bw.write(String.format("Nota do exame: %.1f\n", exame));
            double mediaComExame = (media + exame)/2;
            if(mediaComExame >= 5.0) {
                bw.write(String.format("Aluno aprovado.\n"));
            }
            else {
                bw.write(String.format("Aluno reprovado\n"));
            }
            bw.write(String.format("Media final: %.1f\n", mediaComExame));
        }
        else {
            bw.write(String.format("Aluno reprovado.\n"));
        }
        
        bw.close();
        br.close();
    }
}
