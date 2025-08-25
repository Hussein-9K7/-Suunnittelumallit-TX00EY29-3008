import java.util.ArrayList;
import java.util.List;

public class Department extends OrganizationComponent {
    private List<OrganizationComponent> components = new ArrayList<>();

    public Department(String name) {
        super(name);
    }

    @Override
    public void add(OrganizationComponent component) {
        components.add(component);
    }

    @Override
    public void remove(OrganizationComponent component) {
        components.remove(component);
    }

    @Override
    public double getSalary() {
        double total = 0;
        for (OrganizationComponent c : components) {
            total += c.getSalary();
        }
        return total;
    }

    @Override
    public String toXML() {
        StringBuilder sb = new StringBuilder();
        sb.append("<Department name=\"").append(name).append("\">");
        for (OrganizationComponent c : components) {
            sb.append(c.toXML());
        }
        sb.append("</Department>");
        return sb.toString();
    }
}
