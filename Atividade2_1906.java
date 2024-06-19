package exercicios1206;

public class Atividade2_1906 {
	public static void main(String[] args) {


		char a [][]= {
				{'*','*','*','*',},
				{'*','*','*',},
				{'*','*'},
				{'*',}
		};
		for (char[]letra: a) {
			for(char coluna:letra) {
				System.out.print(coluna+"\t");
			}
			System.out.println("\n");
		}
		
		char b [][]= {
				{' ',' ',' ','*',},
				{' ',' ','*',},
				{' ','*'},
				{'*',}
		};
		for (char[]letra: b) {
			for(char coluna:letra) {
				System.out.print(coluna+"\t");
			}
			System.out.println("\n");
		}
		
		char c [][]= {
				{' ',' ','*',' ',' '},
				{' ',' ','*',' ',' '},
				{'*','*','*','*','*'},
				{' ',' ','*',' ',' '},
				{' ',' ','*',' ',' '}
		};
		for (char[]letra: c) {
			for(char coluna:letra) {
				System.out.print(coluna+"\t");
			}
			System.out.println("\n");
		}
		
	}
}


