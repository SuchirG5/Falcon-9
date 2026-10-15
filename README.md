# Rocket Launch Simulation | Java

Educational Java project exploring simplified vertical rocket motion and graphical visualization, inspired by Falcon launch vehicles.

The repository combines time-stepped motion calculations with a Java Swing/AWT interface and a console driver for inspecting simulation data.

### Technical Highlights

- Updates rocket mass, net force, acceleration, vertical velocity, and altitude over discrete time steps.
- Calculates gravitational force using the rocket's altitude above Earth.
- Changes thrust and mass-flow parameters between modeled burn phases.
- Separates rocket-state calculations from the graphical display.
- Includes a console driver that prints comma-separated simulation values for spreadsheet analysis.

### Technology

**Java · Swing · AWT · Object-Oriented Programming · Numerical Simulation**

### Source Guide

| File | Purpose |
| --- | --- |
| `Falcon10.java` | Rocket-state calculations and time-stepped vertical motion |
| `FalconHeavy.java` | Additional rocket implementation used by the visualization |
| `Falcon10Liftoff.java` | Swing visualization displaying both rockets and their time, altitude, and velocity |
| `Falcon10Tester.java` | Console driver printing time, mass, net force, acceleration, velocity, and altitude |

The repository is named `Falcon-9`; some source classes and display labels use `Falcon10`.

### Simulation Approach

The motion calculation updates vehicle mass using a specified mass-flow rate, subtracts gravitational force from thrust, and uses the resulting acceleration to update vertical velocity and altitude.

The visualization maps altitude to screen position and displays the evolving vehicle states. The console driver provides a separate way to inspect the calculated values.

### Current Repository Status

This repository currently contains a partial source upload.

The code references supporting classes that are not included in the current repository, including `Rocket`, `Farmer`, and `Star`. Those dependencies must be restored before the project can be compiled and run as a standalone application.

For source review, start with `Falcon10.java` for the motion calculations, followed by `Falcon10Tester.java` for the console workflow and `Falcon10Liftoff.java` for the visualization.

`Falcon10Tester.java` is a simulation-output driver, not an automated assertion-based test suite.

### Scope and Limitations

This is an educational programming and simulation project, not a validated flight-dynamics tool.

The inspected vertical-motion implementation does not model atmospheric drag, horizontal motion, guidance, or orbital insertion. Its results should not be interpreted as accurate predictions of actual launch-vehicle performance.

### Author

**Suchir Godavarthi**

[GitHub](https://github.com/SuchirG5) | [Portfolio](https://suchirg5.github.io/Portfolio-Website/portfolio.html)
