import java.time.LocalDateTime;

public class LockerPackage extends Package{
    int codeValidDays;
    String lockerId;
    String packageId;
    String code;
    LocalDateTime packageDeliveryTime;

    @Override
    boolean isValidCode() {
        return super.isValidCode();
    }

    @Override
    boolean verifyCode(String code) {
        return super.verifyCode(code);
    }
}
