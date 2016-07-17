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

package problem1015;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class Point {

    public Point() {
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    public double x, y;
    public double distance(Point p) {
        return Math.sqrt( Math.pow(p.x - this.x, 2) + Math.pow(p.y - this.y, 2) );
    }
}

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
        Point p1 = new Point();
        p1.x = Double.parseDouble(input[0]);
        p1.y = Double.parseDouble(input[1]);
        
        line = br.readLine();
        input = line.split("\\s+");
        Point p2 = new Point();
        p2.x = Double.parseDouble(input[0]);
        p2.y = Double.parseDouble(input[1]);
        
        bw.write(String.format("%.4f\n", p1.distance(p2)));
        bw.close();
        br.close();
    }

}
