import cartago.Artifact;
import cartago.OPERATION;

public class ComplexArtifact extends Artifact {
    private int count;

    void init() {
        this.count = 0;
    }

    @OPERATION
    void complexOperation(final int limit) {
        signal("step1");
        /* Add your code here for suspending the operation. */
        signal("step2");
    }

    @OPERATION
    void increment() {
        this.count++;
    }

    /* Add your code here for implementing the suspension guard. */
}
