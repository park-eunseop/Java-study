package treeset;

import hashset.Member;

public class MemberTreeSetTest {

    public static void main(String[] args) {
        MemberTreeSet memberTreeSet = new MemberTreeSet();

        Member memberPark = new Member(1003, "Park");
        Member memberKim = new Member(1001, "Kim");
        Member memberLee = new Member(1002, "Lee");

        memberTreeSet.addMember(memberPark);
        memberTreeSet.addMember(memberLee);
        memberTreeSet.addMember(memberKim);

        memberTreeSet.showAllMember();

        memberTreeSet.removeMember(1002);
        memberTreeSet.showAllMember();
    }
}
