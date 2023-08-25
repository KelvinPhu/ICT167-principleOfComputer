package lab7;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class scoreTesting {
	public static void main(String[] args) {
		score[] s = new score[10];
		
		try {
			BufferedReader br = new BufferedReader( new FileReader("C:\\Users\\HP\\Desktop\\Học Java\\Java File\\scores.txt"));
			
			String line;
			int index = 0;
			
			while ((line = br.readLine()) != null) {
				String[] part = line.split(" ");
				String name = part[0];
				int score = Integer.parseInt(part[1]);
				
				s[index] = new score(name, score);
				index++;
			}
			int highestScore = s[0].getScore();
			int lowestScore = s[0].getScore();
			int total = 0;
			
			for (score score : s) {
				highestScore = Math.max(highestScore, score.getScore());
				lowestScore = Math.min(lowestScore, score.getScore());
				total += score.getScore();
			}
			double averageScore = (double) total / s.length;
			
			FileWriter fw = new FileWriter("C:/Users/HP/Desktop/Học Java/Java File/output.txt");
			fw.write("Array length: " +s.length+ ", Highest Score: " +highestScore+ ", Lowest Score: " +lowestScore+ ", Average Score: " +averageScore+ "\r\n");
			
			for (score score : s) {
				fw.write(score.getName()+ " " +score.getScore()+ "\r");
			}
			
			fw.close();
			System.out.println("The file have been save and output the results to the output.txt file");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
}
