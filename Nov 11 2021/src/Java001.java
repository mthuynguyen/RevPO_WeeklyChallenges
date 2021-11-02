class Java001 {
    public static void rps(String str1, String str2) {
        
        int iState = str1.equals("rock")?1:str1.equals("paper")?0:2;
        iState += str2.equals("rock")?2:str2.equals("paper")?0:1;
        iState %= 3;
        System.out.print(iState==0?"TIE":iState==1?"Player 2 wins":"Player 1 wins");
        
        int iState2 = str1.compareTo(str2);
        if ((str1.equals("paper") || str2.equals("paper")) != (str1.equals("scissors") || str2.equals("scissors"))) {
            iState2 = iState2 * -1;
        }
        System.out.println(", " + (iState2==0?"TIE":iState2<0?"Player 2 wins":"Player 1 wins"));
        
    }

    public static void main(String[] args) {
        System.out.println("I attempted two different approaches, their results are printed back-to-back to show that both work:");
        rps("rock", "paper");
        rps("paper", "rock");
        rps("paper", "scissors");
        rps("scissors", "scissors");
        rps("scissors", "paper");
        rps("rock", "scissors");
    }
}