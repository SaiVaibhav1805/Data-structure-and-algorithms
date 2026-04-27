# Data Structures and Algorithms (DSA) in Java

This repository contains my implementations of various Data Structures and Algorithms (DSA) problems in Java. The codebase is organized by topics to facilitate learning and practice.

## Repository Structure & Code Functionality Analysis

### 1. `arrays/`
Contains solutions for standard array-based problems, ranging from basic operations to complex optimized algorithms.

- **`two_sum.java`**: Implements the Two Sum algorithm using a two-pointers method.
- **`threesum.java`**: Solves the 3Sum algorithm, relying on a HashSet logic to capture unique triplets summing to 0.
- **`kadane.java`**: Implements Kadane's Algorithm to locate the maximum sub-array sum.
- **`majority.java`**: Identifies the majority element (appears >N/2 times) in an array using a HashMap.
- **`rotateimage.java`**: Rotates a 2D matrix 90 degrees iteratively by transposing before reversing the rows.
- **`longest_subarray.java`**: Finds the longest contiguous sub-array matching a sum `k` using a prefix sum mapped in a HashMap.
- **`MajorityII.java`**: Locates all numbers appearing >N/3 times.
- **`buy_sell.java`**: Stock Buy and Sell solver recording maximum positive differences between future prices and historical minimums.
- **`duplicates.java`**: Compresses an array in-place by dropping consecutive duplicate values (ideal for sorted inputs).
- **`dutch_nat.java`**: Sorts arrays strictly containing 0s, 1s, and 2s via the Dutch National Flag algorithm (3 pointers).
- **`issorted.java`**: Checks if an array is strictly ascending or descending via boolean toggles.
- **`largest.java` / `seclargest.java`**: Loops linearly to pull the absolute maximum and the second-largest limits from the input.
- **`leaders.java`**: Collects "leaders" (values strictly higher than any trailing to their right).
- **`leftrotate1.java` / `leftbydplaces.java` / `leftrotate_optimal.java`**: Standard rotation suites moving indexes backward. The optimal variation leverages triple reversing chunks without allocating temporary arrays.
- **`linear.java`**: Standard linear search matching a target against indices.
- **`pascal.java`**: Generates full rows representing Pascal's Triangle layers analytically without massive recursive overhead.
- **`setmatrixzero.java`**: Finds 0 entries in an n x m matrix and propagates 0 onto their parent rows/columns.
- **`union.java`**: Uses a `HashSet` structure to unify deduplicated integers pooled mutually from two target arrays.

### 2. `basic_maths/`
Focuses on fundamental mathematical concepts and number theory algorithms.

- **`armstrong.java`**: Verifies if numerical inputs structurally equal the digit cubes total sums (e.g. 153 == 1^3 + 5^3 + 3^3).
- **`count.java`**: Arithmetic iteration counter dividing out integer bounds by 10 per step.
- **`divisors.java`**: Highly-efficient divisor finder pulling twin multiplier combinations under `i*i <= n` checks.
- **`factors.java`**: Standard non-optimized linear `O(n)` scan for divisors.
- **`gcd.java`**: Traditional Greatest Common Divisor calculator using repeated modulus loops (Euclidean form).
- **`prime.java`**: Loops cleanly mapping checks through square root upper bounds determining true indivisible elements.
- **`sqrtt.java`**: Placeholder script block setup for square root derivations.
- **Directory `hashing/`**
  - **`charhash.java`**: Allocates a 26-slot static array matching alphabetic indexing traits counting query hits.
  - **`fetch.java`**: Massively allocating raw frequency counting into direct 1x1 arrays indexing up to enormous maximums.
  - **`mapped.java`**: Optimal hashing fetching integers through a memory-dynamic `HashMap<Integer, Integer>`.

### 3. `patterns/`
Features code to print various loop-based patterns (e.g., pyramids, diamonds, specific numeric/star patterns).

- **`pattern1.java` through `pattern21.java`**: These utilize highly-nested bounded `for(i){ for(j){ } }` structures tracking spaces dynamically opposite to structural characters (like strings of `*` or sequences matching `1,2,3...`). Ranges cover basic rectangular matrix blocking, stepped half-pyramids, inverted geometries, and complex numeric centric square reductions (`pattern21.java`).

### 4. `recursions/`
Covers introductory and intermediate recursion problems tracing memory call stacks utilizing base condition breakers.

- **`factorial.java`**: Recursive cascading returns tracking N decrements to figure base 0 or 1 breaking points resolving `N * F(N-1)`.
- **`nnumbers.java`**: Implements specialized backtracking patterns stepping downwards natively to reverse incrementative logs up.
- **`nsum.java`**: Maps cumulative parameters inside depth recursions pulling out a localized final `sum`.
- **`palindrome.java`**: Two-pointer array mirror tracking looping toward index `N/2` bypassing literal loop iterators. (Demonstrates reversing array sequences).
- **`printn.java`**: Maintains a global-state object property variable iterating a localized word print 5 times continuously.
- **`revers.java`**: Identical to pointer swapping traits mirroring full integer array ranges seamlessly.

### 5. `sorting/`
Contains implementations of core sorting algorithms.

- **`bubblesort.java`**: Adjacent comparator loops continuously trailing massive indices upward towards trailing arrays chunk by chunk.
- **`insertionsort.java`**: Inner looping logic shifting higher-value entries down dragging evaluated points up correctly indexing local prefix structures.
- **`selection.java`**: Searches exclusively bounded arrays per round picking the strict lowest value available overriding current iteration thresholds dynamically making `n-1` clean sweeps.

## Getting Started

To run any of the programs:
1. Ensure you have the Java Development Kit (JDK) installed.
2. Navigate to the desired directory, compile, and run the file. For example:
   ```bash
   cd arrays
   javac two_sum.java
   java two_sum
   ```
   *Note: Many files are structured with custom class names; ensure you run the class that contains the `main` method.*

## Technologies
- Language: **Java**

*Happy Coding!*
