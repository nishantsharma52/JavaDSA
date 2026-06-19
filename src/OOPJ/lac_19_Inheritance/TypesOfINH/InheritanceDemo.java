package OOPJ.lac_19_Inheritance.TypesOfINH;

interface ProjectManager {
    String projectManaged = "Default Project";   // implicitly public static final

    void manageProject();
}

interface TeamLead {
    int teamSize = 5;   // implicitly public static final

    void leadTeam();
}


//  BASE CLASS  (Root of hierarchy)
class Employee {
    protected String name;
    protected int employeeId;

    public Employee(String name, int employeeId) {
        this.name = name;
        this.employeeId = employeeId;
    }

    public void display() {
        System.out.println("Employee: " + name + " | ID: " + employeeId);
    }
}


// ─────────────────────────────────────────────
//  LEVEL-1 SUBCLASSES  (Hierarchical Inheritance)
//  All extend Employee directly
// ─────────────────────────────────────────────

// 1. SalesManager
class SalesManager extends Employee {

    public SalesManager(String name, int id) {
        super(name, id);
    }

    public void boostSales() {
        System.out.println("[SalesManager] " + name + " is boosting sales.");
    }

    @Override
    public void display() {
        super.display();
        System.out.println("  Role: Sales Manager");
    }
}

// 2. MarketingManager
class MarketingManager extends Employee {

    public MarketingManager(String name, int id) {
        super(name, id);
    }

    public void createMarketingStrategy() {
        System.out.println("[MarketingManager] " + name + " is creating marketing strategy.");
    }

    @Override
    public void display() {
        super.display();
        System.out.println("  Role: Marketing Manager");
    }
}

// 3. Executive  (will be further extended → Multilevel)
class Executive extends Employee {

    public Executive(String name, int id) {
        super(name, id);
    }

    public void makeExeDecision() {
        System.out.println("[Executive] " + name + " is making an executive decision.");
    }

    @Override
    public void display() {
        super.display();
        System.out.println("  Role: Executive");
    }
}

// 4. Developer
class Developer extends Employee {
    private String progLanguage;

    public Developer(String name, int id, String progLanguage) {
        super(name, id);
        this.progLanguage = progLanguage;
    }

    public void show() {
        System.out.println("[Developer] " + name + " codes in " + progLanguage);
    }

    @Override
    public void display() {
        super.display();
        System.out.println("  Role: Developer | Language: " + progLanguage);
    }
}

// 5. HRManager  (will be further extended → Multilevel)
class HRManager extends Employee {

    public HRManager(String name, int id) {
        super(name, id);
    }

    public void handleHRDuties() {
        System.out.println("[HRManager] " + name + " is handling HR duties.");
    }

    @Override
    public void display() {
        super.display();
        System.out.println("  Role: HR Manager");
    }
}

// 6. TechLead  (Hybrid: extends Employee + implements 2 interfaces)
class TechLead extends Employee implements ProjectManager, TeamLead {

    public TechLead(String name, int id) {
        super(name, id);
    }

    @Override
    public void manageProject() {
        System.out.println("[TechLead] " + name + " is managing project: " + projectManaged);
    }

    @Override
    public void leadTeam() {
        System.out.println("[TechLead] " + name + " is leading a team of " + teamSize + " members.");
    }

    public void displayInfo() {
        System.out.println("[TechLead] " + name + " | ID: " + employeeId);
    }

    @Override
    public void display() {
        super.display();
        System.out.println("  Role: Tech Lead");
    }
}


// ─────────────────────────────────────────────
//  LEVEL-2 SUBCLASSES  (Multilevel Inheritance)
// ─────────────────────────────────────────────

// Employee → Executive → CEO
class CEO extends Executive {

    public CEO(String name, int id) {
        super(name, id);
    }

    public void leadCompany() {
        System.out.println("[CEO] " + name + " is leading the company.");
    }

    @Override
    public void display() {
        super.display();
        System.out.println("  Role Override: CEO");
    }
}

// Employee → HRManager → HRDirector
class HRDirector extends HRManager {

    public HRDirector(String name, int id) {
        super(name, id);
    }

    public void manageHRDep() {
        System.out.println("[HRDirector] " + name + " is managing the entire HR department.");
    }

    @Override
    public void display() {
        super.display();
        System.out.println("  Role Override: HR Director");
    }
}

// Employee → MarketingManager → BusinessDevelopmentManager
class BusinessDevelopmentManager extends MarketingManager {

    public BusinessDevelopmentManager(String name, int id) {
        super(name, id);
    }

    public void coordinateBusinessDev() {
        System.out.println("[BizDevManager] " + name + " is coordinating business development.");
    }

    @Override
    public void display() {
        super.display();
        System.out.println("  Role Override: Business Development Manager");
    }
}


// ─────────────────────────────────────────────
//  MAIN CLASS  —  Driver / Demo
// ─────────────────────────────────────────────

public class InheritanceDemo {

    public static void main(String[] args) {
        System.out.println("  HIERARCHICAL INHERITANCE DEMO");
        System.out.println("  (Multiple classes inherit from Employee)");

        SalesManager sm = new SalesManager("Arjun", 101);
        sm.display();
        sm.boostSales();

        System.out.println();

        MarketingManager mm = new MarketingManager("Priya", 102);
        mm.display();
        mm.createMarketingStrategy();

        System.out.println();

        Developer dev = new Developer("Ravi", 103, "Java");
        dev.display();
        dev.show();

        System.out.println();

        System.out.println("  MULTILEVEL INHERITANCE DEMO");
        System.out.println("  Employee → Executive → CEO");
        System.out.println("  Employee → HRManager → HRDirector");
        System.out.println("  Employee → MarketingManager → BizDevManager");

        CEO ceo = new CEO("Ankit", 001);
        ceo.display();
        ceo.makeExeDecision();   // inherited from Executive
        ceo.leadCompany();       // own method

        System.out.println();

        HRDirector hrd = new HRDirector("SUSHY", 201);
        hrd.display();
        hrd.handleHRDuties();   // inherited from HRManager
        hrd.manageHRDep();      // own method

        System.out.println();

        BusinessDevelopmentManager bdm = new BusinessDevelopmentManager("SHASHI", 301);
        bdm.display();
        bdm.createMarketingStrategy();  // inherited from MarketingManager
        bdm.coordinateBusinessDev();    // own method

        System.out.println();

        System.out.println("  HYBRID INHERITANCE DEMO");
        System.out.println("  TechLead: extends Employee");
        System.out.println("          + implements ProjectManager");
        System.out.println("          + implements TeamLead");

        TechLead tl = new TechLead("Abhay", 401);
        tl.display();
        tl.manageProject();   // from ProjectManager interface
        tl.leadTeam();        // from TeamLead interface
        tl.displayInfo();     // own method

        System.out.println();

        System.out.println("  POLYMORPHISM CHECK (upcasting)");

        Employee[] team = {
                new SalesManager("Rohan", 501),
                new Developer("Kiran", 502, "Python"),
                new CEO("Suresh", 503),
                new TechLead("Mehul", 504),
                new HRDirector("Pooja", 505)
        };

        for (Employee e : team) {
            e.display();
            System.out.println("---");
        }

        System.out.println("\nAll systems operational, Boss.");
    }
}