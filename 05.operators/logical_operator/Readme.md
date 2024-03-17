## Logical Operators

### AND (`&`)

### OR (`|`)

### NOT (`!`)

#### Short Circuit Evaluation

In Java, short-circuit evaluation is applicable to both `&&` (logical AND) and `||` (logical OR) operators. If the result of the expression can be determined by evaluating the first operand, the second operand is not evaluated.

- **AND (`&&`)**:

  - `true && true` => `true`
  - `true && false` => `false`
  - `false && true` => `false`
  - `false && false` => `false`

- **OR (`||`)**:

  - `true || true` => `true`
  - `true || false` => `true`
  - `false || true` => `true`
  - `false || false` => `false`

- **NOT (`!`)**:
  - `!true` => `false`
  - `!false` => `true`

Short-circuit evaluation means that for `&&` operator, if the left operand is `false`, the right operand will not be evaluated, and for `||` operator, if the left operand is `true`, the right operand will not be evaluated.
