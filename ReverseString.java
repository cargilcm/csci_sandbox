public class ReverseString {
    String answer="";
    public String reverse(String input,String output){        
        String newOut = output;
        if(input.length()==0)
            return output;
        if(input.length()>0){
            newOut = newOut.concat(String.valueOf(
                    input.charAt(input.length()-1))
                    );
            return reverse(
                    input.substring(0,input.length()-1),
                    newOut);
        }
        return "fail";
    }
    public static void main(String[] args) {
        ReverseString rS = new ReverseString();    
        System.out.println(rS.reverse("program",""));
    }
}
