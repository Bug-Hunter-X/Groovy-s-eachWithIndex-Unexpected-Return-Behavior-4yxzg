# Groovy's `eachWithIndex` Pitfalls

This example demonstrates a common misunderstanding regarding the `eachWithIndex` method in Groovy.  Many developers assume `return` exits the loop, but it only exits the closure.

**Problem:** The code intends to double each element after the third index.  However, due to the premature return within the closure, `eachWithIndex` continues to iterate without producing the intended results.

**Solution:** Utilize `collect` or `collectEntries` for processing and transforming collections in a way that provides a result.