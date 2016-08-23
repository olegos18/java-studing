package task;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
public class task1_collections {
	public static void main(String args[]) throws IOException{
	
		Map<Integer, String> map = new HashMap<>();
	    Files
	            .lines(Paths.get("C://taskfiles//1.txt"))
	            .map(str -> str.split(" "))
	            .forEach(value -> map.put(Integer.valueOf(value[0]), value[1]));
	    Files
	            .lines(Paths.get("C://taskfiles//2.txt"))
	            .map(str -> str.split(" "))
	            .forEach(value -> map.put(Integer.valueOf(value[1]), value[0]));
		
	

try ( PrintWriter writer = new PrintWriter(new File("C://taskfiles//result.txt")) ) {
        for ( Entry<Integer, String> entry : map.entrySet() ) {
        	
            writer.write( entry.getKey() + " " + entry.getValue() + "\n");
        }
    } catch (Exception e) {
        e.printStackTrace();
    }
	}}

