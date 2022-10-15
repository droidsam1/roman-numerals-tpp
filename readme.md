# Roman Numerals by cyber-dojo

* This is part of my practice of exercises provided by the book _Agile Technical Practices Distilled_

Write a function to convert Arabic numbers to Roman numerals as good as you can, following the TDD practices we have
been using.

Cyber-dojo foundation (See license): http://www.cyber-dojo.org/

Given a positive integer number (for example, 42) determine its Roman numeral representation as a string (for example,
XLII). You cannot write numerals like IM for 999

Examples of Roman numerals by cyber-dojo are as follows:

| Arabic | Roman    | Arabic | Roman   |
|--------|----------|--------|---------|
| 1      | I        | 60     | LX      |
| 2      | II       | 70     | LXX     |
| 3      | III      | 80     | LXXX    |
| 4      | IV       | 90     | XC      |
| 5      | V        | 100    | C       |
| 6      | VI       | 200    | CC      |
| 7      | VII      | 300    | CCC     |
| 8      | VIII     | 400    | CD      |
| 9      | IX       | 500    | D       |
| 10     | X        | 600    | DC      |
| 20     | XX       | 700    | DCC     |
| 30     | XXX      | 800    | DCCC    |
| 40     | XL       | 900    | CM      |
| 50     | L        | 1000   | M       | 
| 846    | DCCCXLVI | 1999   | MCMXCIX | 
 | 999    | CMXCIX   | 2008   | MMVIII  | 

# [Transformation Priority Premise(TPP)](https://blog.cleancoder.com/uncle-bob/2013/05/27/TheTransformationPriorityPremise.html)

## The Transformations
* ({} → nil) no code at all → code that employs nil
* (nil → constant)
* (constant → constant+) a simple constant to a more complex constant
* (constant → scalar) replacing a constant with a variable or an argument
* (statement → statements) adding more unconditional statements.
* (unconditional → if) splitting the execution path
* (scalar → array)
* (array → container)
* (statement → tail-recursion)
* (if → while)
* (statement → non-tail-recursion)
* (expression → function) replacing an expression with a function or algorithm
* (variable → assignment) replacing the value of a variable.
* (case) adding a case (or else) to an existing switch or if


> [I] think that the priority list is language specific... In Java, for example, we might move (if→while) and (variable→assignment) above (statement→tail-recursion) so that iteration is always preferred above recursion, and assignment is preferred above parameter passing ... because Java is not a functional language.

—Robert Martin, blog post [Fib. The T-P Premise](https://blog.cleancoder.com/uncle-bob/2013/05/27/FibTPP.html)