# Spring 2025 Fundamentals of Computing I — Assignment 3

* **Read these instructions repeatedly until you understand the requirements for this assignment, then begin your project. If something is not clear, ask.**

## ❖ Before You Begin ❖

1. Log in to GitHub.
2. Fork this repo(sitory). See [this video](http://code-warrior.github.io/tutorials/git/github/forking-and-cloning-at-the-github-web-site/) on how to carry out this and the following step.
3. Clone your fork, using the website or the GitHub Desktop client.
4. Checkout your personalized branch, the one with your name.

Also, ensure VS Code’s settings includes the following

```json
  "files.eol": "\n",
  "files.insertFinalNewline": true,
  "files.trimFinalNewlines": true,
```

1. Launch VS Code’s settings.
2. If your settings are set to the graphical interface, search for “workbench settings editor”, then choose `json` under the dropdown menu for **Workbench** > Settings: **Editor**.
3. Close and relaunch your settings.
4. Copy the entries above into your settings. 

---

## ❖ Instructions ❖

In this assignment, you’ll be writing two programs. For the first one, you’ll be writing a program that accepts input from the user in the form of an integer, then creates a diamond whose width (in columns) and height (in rows) are dictated by user input. For example, if the user enters 5, then the height of the diamond is 5 rows and the width of the diamond is 5 columns. **A movie of how this program should behave in its resolved state is available at [https://roy.vanegas.org/video/diamond-program-in-java.mp4](https://roy.vanegas.org/video/diamond-program-in-java.mp4).**

**Note**: Odd and even versions of the diamond are rendered differently. Review the aforementioned video carefully for an example.

Here are two examples of the output, one for an even situation, the other for an odd.

```bash
Enter a number
8
        *
       * *
     * * * *
   * * * * * *
 * * * * * * * *
   * * * * * *
     * * * *
       * *
        *

Enter a number
5
  *
 ***
*****
 ***
  *
```

For the second program, you’ll be rendering a matrix whose size is dictated by user input, based on the following rules:

1. Requests from the user a positive number representing the size of a matrix.
2. Prints a matrix consisting of `0`s.
3. Populates the matrix with values from `1–(input × input)`.
4. Prints the matrix with the newly-populated values.
5. Swaps the contents of the matrix on one side of the diagonal formed from top right to bottom left with the other side, highlighting the elements along the diagonal and leaving them untouched/unswapped.
6. Prints the flipped matrix.

As mentioned in item 5, the elements in the diagonal **must not be touched**, while the other elements in the matrix **must be swapped**. The numbers in every cell of the matrix is arbitrary; each cell could have contained a letter, string, image, or other object/primitive. Numbers are being used in this assignment because they produce a sequence that is easy to follow when working with the matrix. **A movie of how this program should behave in its resolved state is available at [https://roy.vanegas.org/video/matrix-flip-along-diagonal--java.mp4](https://roy.vanegas.org/video/matrix-flip-along-diagonal--java.mp4).**

---

---

## ❖ Grading ❖

| Item                                                                                  | Points |
|---------------------------------------------------------------------------------------|:------:|
| Diamond program works according to instructions                                       |  `20`  |
| Matrix program works according to instructions                                        |  `20`  |
| Variables, and methods, if applicable, use intelligent and logical names              |  `20`  |
| Code is neat, professional, and formatted according to conventions discussed in class |  `20`  |
| Assignment rules followed                                                             |  `20`  |

---

## ❖ Due ❖

Thursday, 10 April 2025, at 5:00 PM.

---

## ❖ Submission ❖

Issue a pull request back into the original repo, the one from which your fork was created for this project. See the **Issuing Pull Requests** section of [this site](http://code-warrior.github.io/tutorials/git/github/index.html) for help on how to submit your assignment.

**Note**: This assignment may _only_ be submitted via GitHub. **No other form of submission will be accepted**.
