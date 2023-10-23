
public class string1 {
    public static void main(String[] args) {
        String s1="";
        String s2="Golam ibadullaha";
        System.out.println("s1="+s1);
        System.out.println("s2="+s2);
        int len=s1.length();
        System.out.println("length="+len);
        if(s1.equals(s2)){
        System.out.println("equals");}
        else{
        System.out.println("not equals");}
        boolean con=s1.contains("iba");
        System.out.println(""+con);
        boolean b=s1.isEmpty();
        System.out.println(""+b);
    }
    
}




