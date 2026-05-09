package class3.role;

import class3.policy.LionSubmitPolicy;
import class3.policy.SubmitPolicy;

public class Lion extends Member {

    private final String studentId;

    public Lion(String name, String major, int generation, String part, String studentId) {
        super(name, major, generation, part);
        this.studentId = studentId;
    }

    @Override
    public SubmitPolicy getSubmitPolicy() {
        return new LionSubmitPolicy();
    }

    @Override
    public String getDetailInfo() {
        return "=== 아기사자 ===\n"
             + super.getCommonInfo() + "\n"
             + "학번    : " + studentId;
    }
}
