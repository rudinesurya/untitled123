### Version.java
Version is a Data Structure used for easy storing of version data class. eg. "1.2.9.9.9.9" and allow easy comparison with another version object using the compareTo() method.

### Functionality:
Compare two version numbers version1 and version2.

```
If version1 > version2 return 1
If version1 < version2 return -1
otherwise return 0
```

### Input Constraint:
You may assume that the version strings are non-empty and contain only digits and the 'dot' character. The 'dot' character does not represent a
decimal point and is used to separate number sequences. For instance '2.5' is not "two and a half" or "half way to version three", it is the fifth
second-level revision of the second first-level revision.

### Example:
Here is an example of version numbers ordering: 0.1 < 1.1 < 1.2 < 1.2.9.9.9.9 < 1.3 < 1.3.4 < 1.10
