package exception;

public class IDFormatTest {
    private String userID;

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) throws IDFormatException {
        if (userID == null) {
            throw new IDFormatException("아이디는 null 일 수 없습니다.");
        } else if (userID.length() < 8 || userID.length() > 20) {
            throw new IDFormatException("아이디는 8자 이상 20자 이하로 쓰세요");
        }
        this.userID = userID;
    }

    public static void main(String[] args) {
        IDFormatTest test = new IDFormatTest();
        String userId = null;
        try {
            test.setUserID(userId);
        } catch (IDFormatException e) {
            e.printStackTrace();
        }
        userId = "1234567";
        try {
            test.setUserID(userId);
        } catch (IDFormatException e) {
            e.printStackTrace();
        }
    }
    /*
    예외 처리르 할 때는 로그를 잘 남기자

     */
}
