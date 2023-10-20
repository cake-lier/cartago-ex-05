# CArtAgO by exercises — Exercise 05 — Structured Operations

In this exercise, two agents share and concurrently use an artifact, which provides a "complex" operation.
The operation is a "complex" one because it needs to be executed in two steps and,
between the two steps, it will suspend waiting for a condition to become true.
This exemplifies any long-running operation waiting for its results and suspending while they're not available.
The "userA" agent represents the client, creating the artifact and suspending while using it.
The "userB" agent represents the server,
doing some work onto the artifact until a condition is met, releasing the client.
Note that the suspension regards only the agent plan which encountered the suspension,
all other ones, especially the ones perceiving events, are still capable to be executed.
You can see all of this noting the interleaving between messages (and operations) in the console.

## Solution

All solution files are marked with the "solution" suffix, don't open them before solving the exercise!
