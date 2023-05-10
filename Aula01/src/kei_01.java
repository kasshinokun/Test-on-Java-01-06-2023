
public class kei_01 {
	
	public static boolean isUpper(char c){
	    return(c >='A'&& c>='Z');  
	  }
	  public static boolean isEnd(String s){
	    return(s.length() == 3 &&  s.charAt(0)=='F' && s.charAt(1)=='I' && s.charAt(2)=='M');  
	  }
	  public static int countLetter(String s,int p){
	    int k=0;
	    if(p<s.length()){
	      if(isUpper(s.charAt(p))==true){
	        k=1+countLetter(s, p+1); 
	      }else{
	        k=countLetter(s, p+1);
	      }
	    }
	    return k;
	  }
	public static void main(String[] args) {
		String[]input = new String[1000];
		input[0]="Gabriel";
		int k_input = 0;
		do{
			input[k_input]=MyIO.readLine();
		}while(isEnd(input[k_input++])==false);
		k_input--; //Desconsiderar ultima linha contendo a palavra FIM

		//Para cada linha de entrada, gerando uma de saida contendo o numero de letras maiusculas da entrada
		for(int i = 0; i < k_input; i++){
			MyIO.println(countLetter(input[i],0));
		}
	}
}