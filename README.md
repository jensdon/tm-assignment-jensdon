# Turing Machine Assignment
Program a Turing Machine.

## Background
[Alan Turing][turing] was an

> English computer scientist, mathematician, logician, cryptanalyst, philosopher, and theoretical biologist.
> Turing was highly influential in the development of theoretical computer science

Turing formalised important concepts such as algorithm and computation by introducing the concept now known as a [Turing machine][machine].

## Short Introduction
![A detail of a Turing Machine](http://fifth-postulate.nl/turing-machine/image/tm_detail.png)
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

## Programming
![The complete Turing Machine](http://fifth-postulate.nl/turing-machine/image/tm.png)
In this assignment you are going to [program a Turing Machine][program]. The Turing Machine accepts a JSON file. Below you can find the above transition table translated into a loadable JSON file.

```json
{
  "tm": {
    "tape": {
      "left": [],
      "current": "A",
      "right": ["A", "A", "A"]
    },
    "state": 0,
    "transitions": [
      { "current": [0, "A"], "next": [0, "A", "R"] },
      { "current": [0, "B"], "next": [1, "B", "R"] },
      { "current": [1, "_"], "next": [2, "B", "L"] },
      { "current": [2, "A"], "next": [2, "A", "L"] },
      { "current": [2, "_"], "next": [3, "_", "R"] }
    ]
  },
  "blank": "_",
  "visible_tape": 5,
  "running": false
}
```

There are two buttons on the Turing Machine. One button labelled `>`. This allows one to step through the operation of the machine.
The other button is labelled `>>`. When pressed the machine will automatically step through the its program. Pressing it again will pauze the machine.

You can paste a JSON program into the textarea. The `load` button loads the program in the Turing machine. An other option is to select a JSON program file, which then get loaded automatically.

## Assignment
Take your pick of the problems below and write a Turing Machine program for it.

### Problems
#### Binary Successor
> Given a number `n` written down in [binary][], determine the binary representation of the successor, i.e. the binary representation of `n+`.

##### Example
37 is `10101` in binary. The succcessor of 37 is 38, which is `10110` in binary.

#### Parity of Ones
> Given a [binary][] number, e.g. `10101` for 37, determine the [*parity*][parity] of the number of ones in the representation.

##### Example
In `10101` there are 3 `1`s. 3 is an *odd* number so the parity of the number of `1`s in `10101` is *`1`*. If the number of `1`s would be *even* the parity should be `0`.

[turing]: https://en.wikipedia.org/wiki/Alan_Turing
[machine]: https://en.wikipedia.org/wiki/Turing_machine
[program]: http://fifth-postulate.nl/turing-machine/
[binary]: https://en.wikipedia.org/wiki/Binary_number
[parity]: https://en.wikipedia.org/wiki/Parity_(mathematics)
