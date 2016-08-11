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

package problem1030;

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
        
        int nc = Integer.parseInt(br.readLine());
        
        if(nc == 1) {
            String line = br.readLine();
            
            String[] input = line.split("\\s+");
            int n = Integer.parseInt(input[0]);
            int k = 2;
            
            bw.write(String.format("Case 1: %d\n", safePosition(n) ) );
            bw.close();
            br.close();
            return;
        }
        
        for(int i = 1; i <= nc; i++) {
            String line = br.readLine();
            if(line == null || line.isEmpty()) {
                break;
            }
            String[] input = line.split("\\s+");
            int n = Integer.parseInt(input[0]);
            int k = Integer.parseInt(input[1]);
            
            bw.write(String.format("Case %d: %d\n", i, josephus(n, k) ) );
            bw.flush();
        }
        bw.close();
        br.close();
    }
    
    
    
    private static int josephus(int n, int k) {
        CLList list = new CLList();
        for(int i = 1; i <= n; i++) { // O(n)
            list.add(i);
        }
        
        int survivor;
        do {
            survivor = list.remove(k); // O(k)
        }
        while(!list.isEmpty()); // O(k*n)
        
        return survivor;
    }

    private static int safePosition(int n) {
        int valueOfL = n - Integer.highestOneBit(n);
        int safePosition = 2 * valueOfL + 1;
        return safePosition;
    }

}

class CLList 
{
    private Node root = null;
    private Node current = null;
    private int length = 0;
    
    void add(int i) // O(1)
    {
        Node next = new Node(i);
        if(isEmpty()) {
            root = current = next;
        }
        else {
            current.next = next;
        }
        next.next = root;
        current = next;
        length++;
    }

    boolean isEmpty() // O(1)
    {
        return length == 0;
    }

    int remove(int k) // O(k)
    {
        if(isEmpty()) {
            throw new RuntimeException("Empty List!");
        }
        
        for(int i = 1; i< k; i++) {
            current = current.next;
        }
        
        int value = current.next.value;
        current.next = current.next.next;
        length--;
        
        return value;
    }
    
    int length() // O(1)
    {
        return length; 
    }
    
    class Node 
    {
        public Node(int value) // O(1)
        {
            this.value = value;
        }
        
        int value;
        Node next;
    }
}