public abstract class OrganizationComponent {
    protected String name;

    public OrganizationComponent(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void add(OrganizationComponent component) {
    }

    public void remove(OrganizationComponent component) {
    }

    public abstract double getSalary();

    public abstract String toXML();
}
