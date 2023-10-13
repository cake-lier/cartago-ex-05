package io.github.cakelier;

import cartago.Artifact;
import cartago.OPERATION;

public class ComplexArtifact extends Artifact {
    private int count;

    private void init() {
        this.count = 0;
    }

    @OPERATION
    public void complexOperation(final int limit) {
        signal("step1");
        /* Add your code here for suspending the operation. */
        signal("step2");
    }

    @OPERATION
    public void increment() {
        this.count++;
    }

    /* Add your code here for implementing the suspension guard. */
}
