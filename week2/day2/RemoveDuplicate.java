package week2.day2;

public class RemoveDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String inputText = "We learn Java basics as part of java sessions in java week1";
		 int count=0;

	       String[] word = inputText.split(" ");
	       for (int i = 0; i < word.length; i++) {
			count =1;
			for (int j = i+1; j < word.length; j++) {
				if(word[i].equals(word[j])) {
					count++;
					word[j]="0";
				}
			}
			if(count>1 && word[i]!="0")
				System.out.println(inputText);
		}
	    }
	
		
		

	}


