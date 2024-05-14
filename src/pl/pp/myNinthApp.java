package pl.pp;

class Warehouse {
    // Fields
    private int warehouseNumber;
    private int availableSpace;
    private String ownerName;
    private String ownerEmail;
    private String ownerPhone;

    // Constructor
    public Warehouse(int warehouseNumber, int availableSpace, String ownerName, String ownerEmail, String ownerPhone) {
        this.warehouseNumber = warehouseNumber;
        this.availableSpace = availableSpace;
        this.ownerName = ownerName;
        this.ownerEmail = ownerEmail;
        this.ownerPhone = ownerPhone;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerEmail(String ownerEmail) {
        this.ownerEmail = ownerEmail;
    }

    public String getOwnerPhone() {
        return ownerPhone;
    }

    public void setOwnerPhone(String ownerPhone) {
        this.ownerPhone = ownerPhone;
    }

    // Methods
    public void addGoods(int units) {
        if (units > availableSpace) {
            System.out.println("Not enough space in the warehouse to add " + units + " units of goods.");
            return;
        }
        availableSpace -= units;
        System.out.println("Added " + units + " units of goods. Remaining warehouse space: " + availableSpace + " units.");
    }

    public void removeGoods(int units) {
        if (units > (5000 - availableSpace)) {
            System.out.println("Not enough goods in the warehouse to remove " + units + " units.");
            return;
        }
        availableSpace += units;
        System.out.println("Removed " + units + " units of goods. Remaining warehouse space: " + availableSpace + " units.");
    }

    public void checkOccupancy() {
        int occupiedSpace = 5000 - availableSpace;
        System.out.println("Occupied warehouse space: " + occupiedSpace + " units.");
        System.out.println("Available warehouse space: " + availableSpace + " units.");
    }

    public void updateContact(String newEmail, String newPhone) {
        ownerEmail = newEmail;
        ownerPhone = newPhone;
        System.out.println("Owner's contact details updated successfully.");
    }

    public static void main(String[] args) {
        // Create a Warehouse object
        Warehouse warehouse = new Warehouse(123, 5000, "John Doe", "john@example.com", "123-456-7890");

        // Example operations
        warehouse.addGoods(3000);
        warehouse.removeGoods(1000);
        warehouse.addGoods(2500);
        warehouse.checkOccupancy();
        warehouse.updateContact("newemail@example.com", "987-654-3210");
    }

    public int getWarehouseNumber() {
        return warehouseNumber;
    }
}
