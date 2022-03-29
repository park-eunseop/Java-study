package collection;

import java.util.ArrayList;

public class MemberArrayList {

    private ArrayList<Member> arrayList;

    public MemberArrayList() {
        arrayList = new ArrayList<>();
    }

    public void addMember(Member member) {
        arrayList.add(member);
    }

    public void addMemberIndex(Member member, int idx) {
        arrayList.add(idx, member);
    }

    public boolean removeMember(int memberId) {
        for (int i = 0; i < arrayList.size(); i++) {
            Member member = arrayList.get(i);
            if(memberId==member.getMemberId()){
                arrayList.remove(member);
                return true;
            }
        }

        return false;
    }


    public void showAllMember(){
        for (Member member : arrayList) {
            System.out.println(member);
        }
    }
}
