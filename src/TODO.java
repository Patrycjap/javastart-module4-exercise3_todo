public class TODO {

    private String name;
    private String description;
    private int priority;
    private ResponsiblePerson person;


    public TODO(String name, String description, int priority, ResponsiblePerson person) {
        this(name, description);
        this.priority = priority;
        this.person = person;
    }


    public TODO(String name, String description, int priority) {
        this(name, description);
        this.priority = priority;
    }


    public TODO(String name, String description) {
        this.name = name;
        this.description = description;
    }


    public boolean highPriority() {
        return priority > 0;
    }

    public boolean lowPriority() {
        return priority < 0;
    }

    public boolean mediumPriority() {
        return priority == 0;
    }

    public void showInfoPriority() {
        if (highPriority()) {
            System.out.println("Task priority is high");
        } else if (mediumPriority()) {
            System.out.println("Task priority is medium");
        } else if (lowPriority()) {
            System.out.println("Task priority is low");
        }
    }


    public void showTODOinfo() {
        if (person != null) {
            System.out.println("Task name: " + name + "," + " Task description: " + description + ", " + person.getName() + " " + person.getSurname());
        } else
            System.out.println("Task name: " + name + "," + " Task description: " + description);


    }
}