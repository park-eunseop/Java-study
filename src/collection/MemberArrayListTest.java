package collection;

import java.util.ArrayList;

public class MemberArrayListTest {


    public static void main(String[] args) {

        MemberArrayList memberArrayList = new MemberArrayList();

        Member memberLee = new Member(1001, "lee");
        Member memberPakr = new Member(1002, "park");

        memberArrayList.addMember(memberPakr);
        memberArrayList.addMember(memberLee);

        memberArrayList.showAllMember();

        memberArrayList.removeMember(1001);

        memberArrayList.showAllMember();


    }
}
