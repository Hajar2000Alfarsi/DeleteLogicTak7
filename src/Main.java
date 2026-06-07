public class Main {
    public static void main(String[] args) {
        LibraryManager manager = new LibraryManager();

        manager.initializeMembers();
        //Add new members
        manager.addMember(new LibraryMember("M104", "Ali", "Standard"));
        manager.addMember(new LibraryMember("M105", "Hajar", "Premium"));
        manager.addMember(new LibraryMember("M106", "Safa","Standard"));

        //display members
        manager.displayMembers();

        //delete member
        manager.deleteMemberById("M105");

        //display members after delete
        manager.displayMembers();
    }
}