package map.hashmap;

import collection.Member;

public class MemberHashMapTest {
    public static void main(String[] args) {
        MemberHashMap memberHashMap = new MemberHashMap();

        Member memberLee = new Member(1001,"Lee");
        Member memberPark = new Member(1002,"Park");
        Member memberHong = new Member(1003,"Hong");
        Member memberKim = new Member(1004,"Kim");

        memberHashMap.addMember(memberKim);
        memberHashMap.addMember(memberHong);
        memberHashMap.addMember(memberPark);
        memberHashMap.addMember(memberLee);

        memberHashMap.showAllMember();

        memberHashMap.removeMember(1003);

        memberHashMap.showAllMember();
    }
}
