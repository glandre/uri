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
public class Problem1019 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] timeFrames = {3600, 60};
        DivisionArray division = new DivisionArray(timeFrames);
        division.divide(scanner.nextInt());
        int[] hourAndMinute = division.getDivided();
        int seconds = division.getRest();
        
        System.out.printf("%d:%d:%d\n", hourAndMinute[0], hourAndMinute[1], seconds);
    }

}