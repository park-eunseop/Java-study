package treemap;

import collection.Member;

public class MemberTreeMapTest {
    public static void main(String[] args) {
        MemberTreeMap memberTreeMap = new MemberTreeMap();

        Member memberPark = new Member(1003, "Park");
        Member memberKim = new Member(1001, "Kim");
        Member memberLee = new Member(1002, "Lee");
        Member memberHong = new Member(1004, "Hong");

        memberTreeMap.addMember(memberHong);
        memberTreeMap.addMember(memberPark);
        memberTreeMap.addMember(memberLee);
        memberTreeMap.addMember(memberKim);

        memberTreeMap.showAllMember();

        memberTreeMap.removeMember(1002);

        memberTreeMap.showAllMember();
    }
}
