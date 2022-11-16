package step._11;

import java.util.Optional;

public class B18870 {
    public static void main(String[] args) {
        
        B18870 b = new B18870();
        b.findUserEmailOrElseGet();
	}

    public void findUserEmailOrElseGet() {
            
        System.out.println(Optional.ofNullable("null 아님")
        .orElseGet(this::getUserEmail));
    }
    
    private String getUserEmail() {
        System.out.println("getUserEmail() Called");
        return "mangkyu@tistory.com";
    }
	
}
