# Turing Machine Assignment
Program a Turing Machine.

## Background
[Alan Turing][turing] was an

> English computer scientist, mathematician, logician, cryptanalyst, philosopher, and theoretical biologist.
> Turing was highly influential in the development of theoretical computer science

Turing formalised important concepts such as algorithm and computation by introducing the concept now known as a [Turing machine][machine].

## Short Introduction
A turing machine can be thought of as a machine with

1. An infinite _tape_ which can be read from and written to.
2. A IO _head_ does the reading and writing.
3. An internal _state_, which influences the actions of the machine.
4. A _transition table_ that together with the state determines the next action.

The transition table and the state the machine is determine the next action in the following way.
For a state the machine can be in, and for a symbol that the head can read from the tape there is a row in the transition table.
That row describes 

1. which state the machine should transition in.
2. What symbol to write to the tape.
3. Which way to move the head.

Below is an example of a transition table.

| Current state | Symbol read | Next state | Symbol to write | Head movement |
|---------------|-------------|------------|-----------------|---------------|
| 0             | 'A'         | 0          | 'A'             | **R**(ight)   |
| 0             | 'B'         | 1          | 'B'             | **R**         |
| 1             | '_'         | 2          | 'B'             | **L**(eft)    |
| 2             | 'A'         | 2          | 'A'             | **L**         |
| 2             | '_'         | 3          | '_'             | **R**         |

If a combination of a state and a symbol is not present in the table, the machine halts.

[turing]: https://en.wikipedia.org/wiki/Alan_Turing
[machine]: https://en.wikipedia.org/wiki/Turing_machine
