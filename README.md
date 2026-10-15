# Rocket Launch Simulation

An educational Java project that combines simplified rocket-flight calculations with an animated graphical display. Inspired by Falcon launch vehicles, the simulation visualizes two rockets ascending side by side while displaying their elapsed time, altitude, and vertical velocity.

### Features

- Animated launch visualization built with Java Swing and AWT.
- Time-stepped calculations for vehicle mass, gravitational force, acceleration, velocity, and altitude.
- Altitude-dependent gravity and changing thrust and fuel-consumption parameters across two powered-flight phases.
- Side-by-side displays for the `Falcon10` and `FalconHeavy` implementations.
- A console driver that prints simulation data in comma-separated format for spreadsheet analysis.

### Technologies

Java · Swing · AWT · Object-Oriented Programming · Numerical Simulation

### How It Works

At each simulation step, the program:

1. Reduces vehicle mass according to the mass-flow rate and time step.
2. Calculates gravitational force using the vehicle’s current altitude.
3. Subtracts gravitational force from thrust to determine net vertical force.
4. Updates acceleration, vertical velocity, and altitude.
5. Maps altitude to a screen position and refreshes the graphical display.

The two vehicle implementations use different starting parameters. Each changes thrust and mass-flow rate for its second powered-flight phase.

This is a simplified educational model of vertical powered flight, not a validated prediction of actual launch-vehicle performance.

### Getting Started

#### Requirements

- A Java Development Kit (JDK) with `javac` and `java` available.
- A desktop environment for the graphical simulation.

The project uses standard Java libraries and does not require external dependencies.

#### Compile

Download or clone the repository, open a terminal in its root directory, and run:

```bash
javac *.java
```

#### Run the Main Simulation

```bash
java Falcon10Liftoff
```

This opens the side-by-side rocket visualization with live time, altitude, and velocity readouts.

Keep `theRockMeme.jpg` in the repository root and launch the application from that directory so the rocket artwork can load.

#### Run the Console Driver

```bash
java Falcon10Tester
```

The driver prints first-phase simulation data in the following column order:

```text
time, mass, net force, acceleration, vertical velocity, altitude
```

To save the output for spreadsheet analysis:

```bash
java Falcon10Tester > simulation_output.csv
```

The output contains data rows without a header.

#### Run the Basic Animation

```bash
java Liftoff
```

This launches a separate, simpler rocket animation rather than the two-vehicle physics simulation.

### Repository Structure

| File | Purpose |
| --- | --- |
| `Falcon10.java` | Time-stepped flight calculations for the first vehicle |
| `FalconHeavy.java` | Time-stepped flight calculations for the second vehicle |
| `Falcon10Liftoff.java` | Main graphical simulation and vehicle-data display |
| `Falcon10Tester.java` | Console driver for exporting numerical simulation data |
| `Rocket.java` | Shared rocket drawing, position, and velocity functionality |
| `Liftoff.java` | Standalone basic rocket animation |
| `Star.java` | Animated background stars |
| `Villager.java` | Abstract base class for scene characters |
| `Farmer.java` | Pixel-art characters used in the main scene |
| `theRockMeme.jpg` | Image used in the rocket artwork |

The repository is named `Falcon-9`; the first vehicle’s source classes and display labels use `Falcon10`.

### Author

**Suchir Godavarthi**

[GitHub](https://github.com/SuchirG5) · [Portfolio](https://suchirg5.github.io/Portfolio-Website/portfolio.html)
