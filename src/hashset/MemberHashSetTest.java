package hashset;

public class MemberHashSetTest {

    public static void main(String[] args) {
        MemberHashSet memberHashSet = new MemberHashSet();

        Member memberLee = new Member(1001, "Lee");
        Member memberPark = new Member(1002, "Park");
        Member memberKim = new Member(1003, "Kim");

        memberHashSet.addMember(memberLee);
        memberHashSet.addMember(memberPark);
        memberHashSet.addMember(memberKim);

        memberHashSet.showAllMember();

        Member memberHong = new Member(1003, "Hong");  //들어가지 않아
        Member memberHong2 = new Member(1004, "Hong");
        memberHashSet.addMember(memberHong);
        memberHashSet.addMember(memberHong2);
        memberHashSet.showAllMember();
    }
}
