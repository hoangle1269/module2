package src;

public interface StaffManagementInterface {
    void addStaff(Staff staff);
    void removeStaff(int id);
    void updateStaff(Staff staff);
    void displayStaffCount();
    void displayStaffByType(String type);
}
