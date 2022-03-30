package com.example.collegearena;

public class Credits {

    private String Name,credit,Syllabus,description;

    public String getSyllabus() {
        return Syllabus;
    }

    public void setSyllabus(String syllabus) {
        Syllabus = syllabus;
    }

    public Credits(String syllabus) {
        Syllabus = syllabus;
    }

    private boolean expandable;

    public boolean isExpandable() {
        return expandable;
    }

    public void setExpandable(boolean expandable) {
        this.expandable = expandable;
    }

    public Credits(String name, String credit,String Syllabus, String description) {
        Name = name;
        this.credit = credit;
        this.description = description;
        this.expandable= false;
        this.Syllabus = Syllabus;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getCredit() {
        return credit;
    }

    public void setCredit(String credit) {
        this.credit = credit;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Credits{" +
                "Name='" + Name + '\'' +
                ", credit='" + credit + '\'' +
                ", Syllabus='" + Syllabus + '\'' +
                ", description='" + description + '\'' +
                ", expandable=" + expandable +
                '}';
    }
}
