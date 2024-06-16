package src;

import java.util.ArrayList;
import java.util.List;

public class StaffManagement implements StaffManagementInterface {
    private List<Staff> staffList;

    public StaffManagement() {
        this.staffList = new ArrayList<>();
    }

    @Override
    public void addStaff(Staff staff) {
        staffList.add(staff);
    }

    @Override
    public void removeStaff(int id) {
        staffList.removeIf(staff -> staff.getId() == id);
    }

    @Override
    public void updateStaff(Staff updatedStaff) {
        for (Staff staff : staffList) {
            if (staff.getId() == updatedStaff.getId()) {
                staff.setName(updatedStaff.getName());
                staff.setPhone(updatedStaff.getPhone());
                staff.setPosition(updatedStaff.getPosition());
                if (staff instanceof FactoryStaff) {
                    ((FactoryStaff) staff).setFactoryId(((FactoryStaff) updatedStaff).getFactoryId());
                    ((FactoryStaff) staff).setType(((FactoryStaff) updatedStaff).getType());
                } else if (staff instanceof DeliveryStaff) {
                    ((DeliveryStaff) staff).setVehicleType(((DeliveryStaff) updatedStaff).getVehicleType());
                }
                break;
            }
        }
    }

    @Override
    public void displayStaffCount() {
        System.out.println("Total number of staff: " + staffList.size());
        long officeStaffCount = staffList.stream().filter(staff -> staff instanceof OfficeStaff).count();
        long factoryStaffCount = staffList.stream().filter(staff -> staff instanceof FactoryStaff).count();
        long deliveryStaffCount = staffList.stream().filter(staff -> staff instanceof DeliveryStaff).count();
        System.out.println("Office Staff: " + officeStaffCount);
        System.out.println("Factory Staff: " + factoryStaffCount);
        System.out.println("Delivery Staff: " + deliveryStaffCount);
    }

    @Override
    public void displayStaffByType(String type) {
        staffList.stream().filter(staff -> {
            if ("Office".equalsIgnoreCase(type)) {
                return staff instanceof OfficeStaff;
            } else if ("Factory".equalsIgnoreCase(type)) {
                return staff instanceof FactoryStaff;
            } else if ("Delivery".equalsIgnoreCase(type)) {
                return staff instanceof DeliveryStaff;
            }
            return false;
        }).forEach(System.out::println);
    }

    public List<Staff> getStaffList() {
        return staffList;
    }
}
