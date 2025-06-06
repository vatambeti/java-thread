# Java Multithreading Project 🚀

This Java project demonstrates core concepts of **multithreading**, covering real-world use cases such as **deadlocks**, **synchronization**, **manual locks (ReentrantLock, ReadWriteLock, Semaphore)**, and essential **thread operations**. It is ideal for learners and interview preparation.

---

## 📚 Topics Covered

### ✅ 1. Thread Lifecycle

The lifecycle of a Java thread includes:
- **New** – Thread is created but not started.
- **Runnable** – Thread is ready to run.
- **Running** – Thread is executing.
- **Blocked/Waiting** – Waiting for resources or lock.
- **Terminated** – Thread has completed execution.

<img src="https://upload.wikimedia.org/wikipedia/commons/thumb/e/e0/Thread_Life_Cycle.PNG/800px-Thread_Life_Cycle.PNG" width="400"/>

---

### ✅ 2. Core Thread Methods

| Method      | Description                                       |
|-------------|---------------------------------------------------|
| `start()`   | Starts a new thread                               |
| `run()`     | Contains the code to be executed by the thread    |
| `sleep(ms)` | Pauses execution for a specified time             |
| `yield()`   | Hints to scheduler to allow other threads to run  |
| `join()`    | Waits for another thread to finish execution      |
| `isAlive()` | Checks if a thread is still alive                 |

---

### ✅ 3. Synchronization

Ensures **mutual exclusion** so only one thread can access critical code:

```java
synchronized (lockObject) {
    // critical section
}
