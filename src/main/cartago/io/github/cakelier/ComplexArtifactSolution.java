package io.github.cakelier;

import cartago.Artifact;
import cartago.GUARD;
import cartago.OPERATION;

public class ComplexArtifactSolution extends Artifact {
    private int count;

    private void init() {
        this.count = 0;
    }

    @OPERATION
    public void complexOperation(final int limit) {
        signal("step1");
        await("guard", limit);
        signal("step2");
    }

    @OPERATION
    public void increment() {
        this.count++;
    }

    @GUARD
    private boolean guard(final int limit) {
        return this.count == limit;
    }
}
