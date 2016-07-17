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

package problem1019;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;

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
        
        Time time = new Time(Integer.parseInt(br.readLine()));
        bw.write(String.format("%s\n", time));
        bw.close();
        br.close();
    }

}

class Time {

    private static final int HOUR = 3600;
    private static final int MINUTE = 60;
    
    private final int hours;
    private final int minutes;
    private final int seconds;
    
    public Time(int seconds) {
        
        hours = seconds / HOUR;
        int rest = seconds % HOUR;
        minutes = rest / MINUTE;
        this.seconds = rest % MINUTE;
        
    }
    
    @Override
    public String toString() {
        return hours + ":" + minutes + ":" + seconds;
    }
    
}