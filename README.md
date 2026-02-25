# 🔁 PalindromeCheckerApp

A **console-based Java application** that validates whether a given string is a palindrome under different conditions, while strengthening core programming fundamentals and data structure concepts.

Each **use case** is implemented on its own Git branch, building incrementally on top of the previous one.

---

## 📂 Branch Structure

| Branch | Use Case | Implementation Details | File Name |
| :--- | :--- | :--- | :--- |
| `main` | — | This README and project overview | — |
| `usecase1` | UC1: Welcome Message | Displays welcome message and version | `UC01_WelcomeMessage.java` |
| `usecase2` | UC2: Hardcoded Check | Checks hardcoded string via char loop | `UC02_HardcodedPalindrome.java` |
| `usecase3` | UC3: String Reverse | Reverses string with loop + concatenation | `UC03_StringReverse.java` |
| `usecase4` | UC4: char[] Two-Pointer | Converts to char[], uses two-pointer approach | `UC04_CharArrayTwoPointer.java` |
| `usecase5` | UC5: Stack (LIFO) | Uses Stack push/pop to reverse and compare | `UC05_StackBased.java` |
| `usecase6` | UC6: Queue + Stack | Compares Queue (FIFO) vs Stack (LIFO) | `UC06_QueueStackComparison.java` |
| `usecase7` | UC7: Deque (Optimized) | Uses Deque removeFirst/removeLast | `UC07_DequeOptimized.java` |
| `usecase8` | UC8: Linked List | Uses LinkedList bidirectional removal | `UC08_LinkedListBased.java` |
| `usecase9` | UC9: Recursion | Recursive method comparing start/end indices | `UC09_RecursivePalindrome.java` |
| `usecase10` | UC10: Normalization | Normalizes input (regex + lowercase) | `UC10_NormalizedPalindrome.java` |
| `usecase11` | UC11: OOP Service | Encapsulates logic in Service class (SRP) | `UC11_OopEncapsulation.java` |
| `usecase12` | UC12: Strategy Pattern | Interchangeable algorithms via Interface | `UC12_StrategyPattern.java` |
| `usecase13` | UC13: Performance | Benchmarks multiple algorithms | `UC13_PerformanceComparison.java` |

> More use case branches will be added as they are implemented.

---

## 🚀 How to Use

1. **Clone the repo:**
   ```bash
   git clone https://github.com/<username>/PalindromeCheckerApp.git
   cd PalindromeCheckerApp
   ```

2. **Switch to a use case branch:**
   ```bash
   git checkout usecase1
   ```

3. **Compile & Run:**
   ```bash
   javac UC01_WelcomeMessage.java
   java UC01_WelcomeMessage
   ```

---

## 🎯 Key Concepts Covered

- Class, Object, Main Method, Static Keyword
- Console I/O with `System.out.println()`
- Application flow control
- Data structures (Stack, Arrays) *(in later use cases)*
- Recursion, String manipulation *(in later use cases)*

---

## 📄 License

This project is released under the [MIT License](https://opensource.org/licenses/MIT).
