/*
 * ReturnText.java
 * 
 * Copyright 2016 graf <graf@chillosphere.spacepotato>
 * 
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301, USA.
 * 
 * 
 */

import java.util.Scanner;
public class ReturnText {
	
	
	public void returnText(){ // null pointer exception somewhere.
		
		Scanner keys = new Scanner(System.in);
		String finished = "Stop";
		String cont = null;
		String input;
		
		while (!(cont.equals(finished))){
			System.out.println("Input any string.");
			input = keys.nextLine();
			System.out.println("You said: " + input);
			System.out.println("Do you wish to input another string? (Stop breaks the loop.)");
			cont = keys.nextLine();
			}		
		}
		
	public void returnSentences(){
		
		String finished = "Stop";
		String cont;
		String input;
		
		Scanner keys = new Scanner(System.in);
				
		do {
			System.out.println("Input any sentence.");
			input = keys.nextLine();
			System.out.println("You said: " + input);
			System.out.println("Do you wish to input another sentence? (Stop breaks the loop)");
			cont = keys.nextLine();
			}
			
		while (!(cont.equals(finished)));	
		}
	
	public static void main (String args[]) {
		ReturnText demo = new ReturnText();
		demo.returnSentences();
		
		
	}
}

