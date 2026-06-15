# Intro — Number Representation in Computers

## Context
This session ran before the practical labs, during the professor's Digital Design 1 review.
The goal was to connect what students already knew about binary and number systems in digital design
to how the same concepts appear in C code — making the hardware-software link concrete before
touching the breadboard.

## Topics Covered

**Signed vs unsigned integers**
The same 8 bits represent completely different values depending on how you interpret them:
- `signed char x = -128` and `unsigned char y = 255` hold the same bit pattern `10000000`
- Printing `x` as `%u` (unsigned) shows 4294967168 — the CPU has no idea which you meant

**ASCII encoding**
Characters are just numbers. `char c = 65` and `char A = 'A'` are identical — `printf` decides
whether to show you `65` or `A` based on the format specifier.

**Arithmetic with chars**
`int z = x + 129` — mixing signed char with int triggers implicit conversion.
Shows students that data types are not just labels; they change how the hardware computes.

## Students Were Directed To Research
- **IEEE 754** floating point representation
- **Fixed-point** representation and its role in digital design and embedded systems

## Code
[`main.c`](./main.c)
