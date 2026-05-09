package class3.policy;

public class StaffSubmitPolicy implements SubmitPolicy {

    @Override
    public boolean canSubmit() {
        return false;
    }
}
