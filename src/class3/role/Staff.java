package class3.role;

import class3.policy.StaffSubmitPolicy;
import class3.policy.SubmitPolicy;

public class Staff extends Member {

    private final String position;

    public Staff(String name, String major, int generation, String part, String position) {
        super(name, major, generation, part);
        this.position = position;
    }

    @Override
    public SubmitPolicy getSubmitPolicy() {
        return new StaffSubmitPolicy();
    }

    @Override
    public String getDetailInfo() {
        return "=== 운영진 ===\n"
             + super.getCommonInfo() + "\n"
             + "직책    : " + position;
    }
}
