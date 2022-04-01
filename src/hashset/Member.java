package hashset;

public class Member implements Comparable<Member> {

    private int memberId;
    private String memberName;

    public Member(int memberId, String memberName) {
        this.memberId = memberId;
        this.memberName = memberName;
    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    @Override
    public String toString() {
        return "Member{" +
                "memberId=" + memberId +
                ", memberName='" + memberName + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return memberId;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Member) {
            Member member = (Member) obj;
            if (this.memberId == member.getMemberId()) {
                return true;
            }
            else
                return false;
        }

        return false;
    }


    @Override
    public int compareTo(Member member) {
        //return (this.memberId - member.memberId) * -1;  회원 아이디 순
        //return member.memberName.compareTo(this.memberName);  // 이름 역 순
        return this.memberName.compareTo(member.memberName);  // 이름 순
        //K L P
    }
}
