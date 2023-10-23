
public class ExceptionDemo {
    public static void main(String[] args) {
        try{
        int x=10;
        int y=0;
        int result=x/y;
            System.out.println("result="+result);}
        catch(ArrayIndexOutOfBoundsException a){
            System.out.println(a); 
        }
        catch(Exception e){
            System.out.println(e);
        }
        finally{
        System.out.println("thank you our respectabel teacher surav chandra Das sir");
    }
        
    }
    
}
