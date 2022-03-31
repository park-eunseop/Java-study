package hashset;

import hashset.Member;

import java.util.HashSet;
import java.util.Iterator;

public class MemberHashSet {

    private HashSet<Member> hashSet;

    public MemberHashSet() {
        hashSet = new HashSet<Member>();
    }

    public void addMember(Member member) {
        hashSet.add(member);
    }

    public boolean removeMember(int memberId) {
        Iterator<Member> iterator = hashSet.iterator();

        while (iterator.hasNext()){ // 다음 요소가 있다면 true 반환
            Member member = iterator.next();
            int tempId = member.getMemberId();
            if (tempId == memberId) {
                hashSet.remove(member);
                return true;
            }
        }//while

        return false;
    }

    public void showAllMember() {
        for (Member member : hashSet) {
            System.out.println(member);
        }
        System.out.println();
    }
}
