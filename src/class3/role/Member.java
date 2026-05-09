package class3.role;

import class3.policy.SubmitPolicy;

public abstract class Member {

    private final String name;
    private final String major;
    private final int    generation;
    private final String part;

    public Member(String name, String major, int generation, String part) {
        this.name       = name;
        this.major      = major;
        this.generation = generation;
        this.part       = part;
    }

    public String getName()       { return name; }
    public String getMajor()      { return major; }
    public int    getGeneration() { return generation; }
    public String getPart()       { return part; }

    public abstract SubmitPolicy getSubmitPolicy();

    public abstract String getDetailInfo();

    public boolean canSubmit() {
        return getSubmitPolicy().canSubmit();
    }

    protected String getCommonInfo() {
        return "이름    : " + name       + "\n"
             + "전공    : " + major      + "\n"
             + "기수    : " + generation + "기\n"
             + "파트    : " + part;
    }
}
