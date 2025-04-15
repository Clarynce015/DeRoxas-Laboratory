//package Activity 3;

class Teacher extends Person {
    private String name;
    private int id;
    private String subject;

    public Teacher(String name, int id, String subject) {
        super(name, id); 
        this.name = name;
        this.id = id;
        this.subject = subject;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getSubject() {
        return subject;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Subject: " + subject);
    }
}
