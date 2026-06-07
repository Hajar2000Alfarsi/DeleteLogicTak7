import java.util.ArrayList;

public class LibraryManager {
    private ArrayList<LibraryMember> members;

    public LibraryManager(){
        members = new ArrayList<>();
    }

    public void initializeMembers() {
        members.add(new LibraryMember("M101", "Ahmed", "Standard"));
        members.add(new LibraryMember("M102", "Sara", "Premium"));
        members.add(new LibraryMember("M103", "John", "Standard"));
    }

    public void addMember(LibraryMember member) {
        members.add(member);
    }

    public void displayMembers(){
        if (members.isEmpty()) {
            System.out.println("No members found.");
            return;
        }

        for (LibraryMember member : members) {
            System.out.println("Member ID: " + member.getMemberId() + "\n" +
                    "Full Name: " + member.getFullName() + "\n" +
                    "Membership Type: " + member.getMembershipType() + "\n");
        }
    }

    public boolean deleteMemberById(String memberId) {
        for (int i = 0; i < members.size(); i++) {
            if (members.get(i).getMemberId().equals(memberId)) {
                members.remove(i);
                System.out.println("Member with ID " + memberId + " deleted successfully." + "\n");

                return true;
            }
        }
        System.out.println("Member not found." + "\n");
        return false;
    }



}
