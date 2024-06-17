package src;

public class StaffManagement implements StaffManagementInterface {
    private Staff[] staffList;
    private int size;

    public StaffManagement() {
        this.staffList = new Staff[10];
        this.size = 0;
    }

    @Override
    public void addStaff(Staff staff) {
        if (size == staffList.length) {
            resizeArray();
        }
        staffList[size++] = staff;
    }

    private void resizeArray() {
        Staff[] newArray = new Staff[staffList.length * 2];
        System.arraycopy(staffList, 0, newArray, 0, staffList.length);
        staffList = newArray;
    }

    @Override
    public void removeStaff(int id) {
        for (int i = 0; i < size; i++) {
            if (staffList[i].getId() == id) {
                staffList[i] = staffList[size - 1];
                staffList[size - 1] = null;
                size--;
                break;
            }
        }
    }

    @Override
    public void updateStaff(Staff updatedStaff) {
        for (int i = 0; i < size; i++) {
            if (staffList[i].getId() == updatedStaff.getId()) {
                staffList[i].setName(updatedStaff.getName());
                staffList[i].setPhone(updatedStaff.getPhone());
                staffList[i].setPosition(updatedStaff.getPosition());
                if (staffList[i] instanceof FactoryStaff) {
                    ((FactoryStaff) staffList[i]).setFactoryId(((FactoryStaff) updatedStaff).getFactoryId());
                    ((FactoryStaff) staffList[i]).setType(((FactoryStaff) updatedStaff).getType());
                } else if (staffList[i] instanceof DeliveryStaff) {
                    ((DeliveryStaff) staffList[i]).setVehicleType(((DeliveryStaff) updatedStaff).getVehicleType());
                }
                break;
            }
        }
    }

    @Override
    public void displayStaffCount() {
        int officeStaffCount = 0;
        int factoryStaffCount = 0;
        int deliveryStaffCount = 0;

        for (int i = 0; i < size; i++) {
            if (staffList[i] instanceof OfficeStaff) {
                officeStaffCount++;
            } else if (staffList[i] instanceof FactoryStaff) {
                factoryStaffCount++;
            } else if (staffList[i] instanceof DeliveryStaff) {
                deliveryStaffCount++;
            }
        }

        System.out.println("Total number of staff: " + size);
        System.out.println("Office Staff: " + officeStaffCount);
        System.out.println("Factory Staff: " + factoryStaffCount);
        System.out.println("Delivery Staff: " + deliveryStaffCount);
    }

    @Override
    public void displayStaffByType(String type) {
        for (int i = 0; i < size; i++) {
            if ("Office".equalsIgnoreCase(type) && staffList[i] instanceof OfficeStaff) {
                System.out.println(staffList[i]);
            } else if ("Factory".equalsIgnoreCase(type) && staffList[i] instanceof FactoryStaff) {
                System.out.println(staffList[i]);
            } else if ("Delivery".equalsIgnoreCase(type) && staffList[i] instanceof DeliveryStaff) {
                System.out.println(staffList[i]);
            }
        }
    }

    public Staff[] getStaffList() {
        Staff[] currentStaff = new Staff[size];
        System.arraycopy(staffList, 0, currentStaff, 0, size);
        return currentStaff;
    }
}
