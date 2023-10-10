import cartago.Artifact;
import cartago.GUARD;
import cartago.OPERATION;

public class ComplexArtifactSolution extends Artifact {
    private int count;

    void init() {
        this.count = 0;
    }

    @OPERATION
    void complexOperation(final int limit) {
        signal("step1");
        await("guard", limit);
        signal("step2");
    }

    @OPERATION
    void increment() {
        this.count++;
    }

    @GUARD
    boolean guard(final int limit) {
        return this.count == limit;
    }
}
