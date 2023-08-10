import java.time.LocalDateTime;

public class Package {
    int codeValidDays;
    String packageId;
    String lockerId;
    String code;
    LocalDateTime packageDeliveryTime;

    boolean isValidCode(){
        return true;
    }

    boolean verifyCode(String code){
        return true;
    }
}
