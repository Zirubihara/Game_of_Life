class Employee {

    // write fields
    protected String name;
    protected String email;
    protected int experience;

    // write constructor
    Employee(String name, String email, int experience) {
        this.name = name;
        this.email = email;
        this.experience = experience;
    }

    // write getters
    protected String getName() {
        return this.name;
    }

    protected String getEmail() {
        return this.email;
    }

    protected int getExperience() {
        return this.experience;
    }
}

class Developer extends Employee {

    // write fields
    protected String mainLanguage;
    protected String[] skills;

    // write constructor
    Developer(String name, String email, int experience, String mainLanguage, String[] skills) {
        super(name, email, experience);
        this.mainLanguage = mainLanguage;
        this.skills = java.util.Arrays.copyOf(skills, skills.length);
    }

    // write getters
    String getMainLanguage() {
        return this.mainLanguage;
    }

    String[] getSkills() {
        return java.util.Arrays.copyOf(this.skills, this.skills.length);
    }
}

class DataAnalyst extends Employee {

    // write fields
    protected boolean phd;
    protected String[] methods;

    // write constructor
    DataAnalyst(String name, String email, int experience, boolean phd, String[] methods) {
        super(name, email, experience);
        this.phd = phd;
        this.methods = java.util.Arrays.copyOf(methods, methods.length);
    }

    // write getters
    boolean isPhd() {
        return this.phd;
    }

    String[] getMethods() {
        return java.util.Arrays.copyOf(this.methods, this.methods.length);
    }
}
