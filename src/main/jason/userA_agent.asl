!do_test.

+!do_test : true <-
    println("[userA] Before creating the artifact");
    makeArtifact("art", "io.github.cakelier.ComplexArtifact", [], ArtId);
    focus(ArtId);
    println("[userA] Before executing the action");
    .wait(1000);
    complexOperation(3);
    println("[userA] After executing the action").

+step1 : true <-
    println("User A has entered the complex operation").

+step2 : true <-
    println("User A is exiting the operation").

{ include("$jacamoJar/templates/common-cartago.asl") }
