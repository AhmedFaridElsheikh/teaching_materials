# CSE141 — Programming Languages (Java)

Teaching materials for **CSE141: Introduction to Programming Languages**, taught to **electrical power engineering students** at Mansoura University.

> 🌐 **[Open Course Site →](https://ahmedfaridelsheikh.github.io/teaching_materials/CSE141-Java-for-Engineers/)**

---

## Interactive Materials

| Material | Link |
|----------|------|
| Introduction to Java (LaTeX · 11 slides) | [Open PDF ↗](https://ahmedfaridelsheikh.github.io/teaching_materials/CSE141-Java-for-Engineers/01-introduction/java_presentation.pdf) |
| Java for Power Engineers | [Open ↗](https://ahmedfaridelsheikh.github.io/teaching_materials/CSE141-Java-for-Engineers/04-arrays/java_for_power_engineers.html) |
| Loop Control — break & continue | [Open ↗](https://ahmedfaridelsheikh.github.io/teaching_materials/CSE141-Java-for-Engineers/05-data-structures/java-loop-control.html) |
| Iterations Practice Sheet | [Open ↗](https://ahmedfaridelsheikh.github.io/teaching_materials/CSE141-Java-for-Engineers/03-iterations/Java_Iterations_Section.html) |
| Array Exercises | [Open ↗](https://ahmedfaridelsheikh.github.io/teaching_materials/CSE141-Java-for-Engineers/04-arrays/java_array_exercises.html) |
| Bonus Task — Power Consumption Analyzer | [Open ↗](https://ahmedfaridelsheikh.github.io/teaching_materials/CSE141-Java-for-Engineers/08-bonus-task/bonus_task.html) |

---

## Screenshots

### Introduction to Java — LaTeX Beamer Slides
[![Introduction to Java](https://ahmedfaridelsheikh.github.io/teaching_materials/CSE141-Java-for-Engineers/docs/screenshots/java_presentation.png)](https://ahmedfaridelsheikh.github.io/teaching_materials/CSE141-Java-for-Engineers/01-introduction/java_presentation.pdf)

### Java for Power Engineers
[![Java for Power Engineers](https://ahmedfaridelsheikh.github.io/teaching_materials/CSE141-Java-for-Engineers/docs/screenshots/java_for_power_engineers.png)](https://ahmedfaridelsheikh.github.io/teaching_materials/CSE141-Java-for-Engineers/04-arrays/java_for_power_engineers.html)

### Loop Control — break & continue
[![Loop Control](https://ahmedfaridelsheikh.github.io/teaching_materials/CSE141-Java-for-Engineers/docs/screenshots/java_loop_control.png)](https://ahmedfaridelsheikh.github.io/teaching_materials/CSE141-Java-for-Engineers/05-data-structures/java-loop-control.html)

### Iterations Practice Sheet
[![Iterations](https://ahmedfaridelsheikh.github.io/teaching_materials/CSE141-Java-for-Engineers/docs/screenshots/java_iterations.png)](https://ahmedfaridelsheikh.github.io/teaching_materials/CSE141-Java-for-Engineers/03-iterations/Java_Iterations_Section.html)

### Array Exercises
[![Array Exercises](https://ahmedfaridelsheikh.github.io/teaching_materials/CSE141-Java-for-Engineers/docs/screenshots/java_array_exercises.png)](https://ahmedfaridelsheikh.github.io/teaching_materials/CSE141-Java-for-Engineers/04-arrays/java_array_exercises.html)

### Bonus Task
[![Bonus Task](https://ahmedfaridelsheikh.github.io/teaching_materials/CSE141-Java-for-Engineers/docs/screenshots/bonus_task.png)](https://ahmedfaridelsheikh.github.io/teaching_materials/CSE141-Java-for-Engineers/08-bonus-task/bonus_task.html)

---

## Course Structure

| # | Topic | Materials |
|---|-------|-----------|
| 01 | [Introduction](./01-introduction/) | Slides PDF · HelloWorld · UserInput |
| 02 | [Operators & If-Else](./02-operators/) | Teaching guide PDF · 6 demo files |
| 03 | [Iterations](./03-iterations/) | Interactive HTML · PDF · Examples · Exercises · Challenge |
| 04 | [Arrays](./04-arrays/) | Exercises HTML · Power Engineers reference HTML |
| 05 | [Data Structures + Loop Control](./05-data-structures/) | Interactive HTML with flowcharts · PDF · 9 source files |
| 06 | [Floating Point](./06-floating-point/) | IEEE 754 edge cases |
| 07 | [Engineering Applications ⚡](./07-engineering-applications/) | RC circuit · RLC step response · Quadratic solver |
| 08 | [Bonus Task](./08-bonus-task/) | Assignment PDF + HTML |

---

## Acknowledgments

**Eng. Doaa Ahmed Arafa** — Teaching Assistant, Faculty of Engineering, Mansoura University.

The four problems in the [Loop Control section](https://ahmedfaridelsheikh.github.io/teaching_materials/CSE141-Java-for-Engineers/05-data-structures/java-loop-control.html) were assigned by the course instructor. Code solutions, SVG flowcharts, and the interactive page are by Ahmed Farid Elsheikh.

---

## Engineering Applications

**`RLCStepResponse.java`** — Simulates an RLC circuit responding to a 5V step input using state-space representation and Euler numerical integration — the same method used in EMTP for power systems simulation.

**`RCCircuit.java`** — Computes V(t) = V₀·e^(−t/RC).

**`QuadraticEquation.java`** — Solves ax² + bx + c = 0.

## How to Run

```bash
javac 07-engineering-applications/RLCStepResponse.java
java RLCStepResponse
```

Requires **Java 11+**. Each file is standalone — no build tool needed.

## Reference Book

*Think Java* by Allen Downey & Chris Mayfield — free at [greenteapress.com](https://greenteapress.com/wp/think-java-2e/)
