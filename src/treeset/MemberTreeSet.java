package treeset;

import hashset.Member;

import java.util.Iterator;
import java.util.TreeSet;

public class MemberTreeSet {

    private TreeSet<Member> treeSet;

    public MemberTreeSet() {
        treeSet = new TreeSet<Member>();
    }

    public void addMember(Member member) {
        treeSet.add(member);
    }

    public boolean removeMember(int memberId) {
        Iterator<Member> iterator = treeSet.iterator();

        while (iterator.hasNext()) {
            Member next = iterator.next();
            int memberIdNext = next.getMemberId();

            if (memberIdNext == memberId) {
                treeSet.remove(next);
                return true;
            }
        }
        return false;
    }

    public void showAllMember() {
        for (Member member : treeSet) {
            System.out.println(member);
        }

        System.out.println();
    }
}
