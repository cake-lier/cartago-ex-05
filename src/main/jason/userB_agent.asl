!do_test.

+!do_test : true <-
    !discover("art", ArtId);
    focus(ArtId).

+step1 : true <-
    !use_artifact(3).

+!use_artifact(N) : N > 0 <-
    increment;
    println("[userB] Used the artifact");
    !use_artifact(N - 1).

+!use_artifact(0) <-
    println("[userB] Completed its use of the artifact").

+!discover(N, I) : true <-
    lookupArtifact(N, I).

-!discover(N, I) : true <-
    !discover(N, I).

{ include("$jacamoJar/templates/common-cartago.asl") }
