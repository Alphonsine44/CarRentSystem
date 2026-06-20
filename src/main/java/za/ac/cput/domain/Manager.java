package za.ac.cput.domain;

public class Manager extends Employee{
    private String managerId;
    private String employeeId;

    private Manager() {

    }

    private Manager(Builder builder) {
        this.managerId = builder.managerId;
        this.employeeId = builder.employeeId;
    }

    public String getManagerId() {
        return managerId;
    }

    public String getEmployeeId() {
        return employeeId;
    }
    public void approveBooking() {
        System.out.println("Booking approved by manager: " + managerId);
    }

    @Override
    public String toString() { return "Manager{" + "managerId='" + managerId + '\'' + ", employeeId='" + employeeId + '\'' + '}'; }

    public static class Builder extends Employee.Builder {
        private String managerId;
        private String employeeId;

        public Builder setManagerId(String managerId) {
            this.managerId = managerId;
            return this;
        }

        public Builder setEmployeeId(String employeeId) {
            this.employeeId = employeeId;
            return this;
        }

        public Builder copy(Manager manager) {
            this.managerId = manager.managerId;
            this.employeeId = manager.employeeId;
            return this;
        }

        @Override
        public Manager build() {
            return new Manager(this);
        }
    }

}
