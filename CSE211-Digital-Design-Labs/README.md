# CSE211 — Digital Design 2 (Lab Materials)

Lab materials for **CSE211: Digital Design 2**, taught to computer and communication engineering students at Mansoura University.

Students built and tested real circuits on breadboards. Each lab folder contains a circuit explanation, wiring guide, demo video, and where available a photo of the build.

> **Note:** The circuits demonstrated in these labs follow educational content by [Ben Eater](https://www.youtube.com/playlist?list=PLowKtXNTBypGqImE405J2565dvjafglHU) and [Walid Issa](https://www.youtube.com/playlist?list=PLww54WQ2wa5obq6IbRbIiql8oHaTUp3T_). This repo documents the classroom demonstrations — videos, photos, and circuit notes from the lab sessions.

---

## Labs

| # | Circuit | IC | Video | Photo |
|---|---------|-----|-------|-------|
| [Intro](./intro/) | Number Representation in C | — | — | — |
| [Lab 1](./lab-1-sr-latch/) | SR Latch | NOR / NAND gates | ✓ | — |
| [Lab 2](./lab-2-555-timer/) | 555 Timer Square Wave | LM555 | ✓ | ✓ |
| [Lab 3](./lab-3-4bit-parallel-register/) | 4-Bit Parallel Register | 74HC175 | ✓ | — |
| [Lab 4](./lab-4-4bit-shift-register/) | 4-Bit Shift Register | 74HC175 | — | ✓ |
| [Lab 5](./lab-5-decade-counter-0-9/) | Decade Counter (0–9) | SN74LS90 | ✓ | ✓ |

---

## Datasheets

All IC datasheets in [`/datasheets`](./datasheets/)

| File | IC |
|------|----|
| [74HC_HCT175.pdf](./datasheets/74HC_HCT175.pdf) | Quad D Flip-Flop |
| [LM555.pdf](./datasheets/LM555.pdf) | Timer |
| [SN74LS175.pdf](./datasheets/SN74LS175.pdf) | Quad D Flip-Flop (LS) |
| [SN74LS90.pdf](./datasheets/SN74LS90.pdf) | Decade Counter |

## Intro — Data Types in C

[`intro/main.c`](./intro/main.c) — demonstrates signed/unsigned char, ASCII encoding, and integer overflow at the byte level.

---

## Credits

**Eng. Aya Adel** — Teaching Assistant, Mansoura University.

**Ben Eater** and **Walid Issa** — whose educational content the circuit demonstrations follow.

---

## Learning Resources

### 🎥 Video Guides

| Resource | Description | Language | Link |
|----------|-------------|----------|------|
| **Ben Eater** | Building an 8-bit breadboard computer from scratch — registers, ALU, clock, RAM, CPU. Best visual explanation of how digital logic becomes a working computer | English | [Playlist ↗](https://www.youtube.com/playlist?list=PLowKtXNTBypGqImE405J2565dvjafglHU) |
| **Walid Issa** | دورة الالكترونيات الرقمية — comprehensive Arabic digital electronics course covering gates, flip-flops, counters, and more | Arabic | [Playlist ↗](https://www.youtube.com/playlist?list=PLww54WQ2wa5obq6IbRbIiql8oHaTUp3T_) |
| **ETH Zürich — Onur Mutlu** | Digital Design and Computer Architecture (Spring 2026) — university-level course covering logic design through processor architecture | English | [Playlist ↗](https://www.youtube.com/playlist?list=PL5Q2soXY2Zi-yo9kK-BKrq11ykNKkVEpd) |
| **Ain Shams University (FOE ASU)** | Logic Circuits — Faculty of Engineering, 2nd year Electrical — Arabic university course aligned with the same curriculum | Arabic | [Playlist ↗](https://www.youtube.com/playlist?list=PLkOpA9uAb9H3e0isTeEqkR-W5PwV8OSTG) |
