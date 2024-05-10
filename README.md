## Solid with Design Pattern

### The NEU Library offers a variety of resources, including books, theses, capstones, internet access, journals, and newspapers.
- Currently, the Student object has methods like borrowBook(), borrowJournal() with a parameter of title, which directly depend on specific resource types.
- To adhere to the Dependency Inversion Principle (DIP) and ensure flexibility for future changes (such as introducing audio books or e-journals), we need to refactor the program while maintaining SOLID principles. The goal is to create a robust system that can seamlessly accommodate new resource types in the future.


![Blank diagram (5)](https://github.com/ItsMaynardk/SolidDesign/assets/142737277/712a5b26-8d42-4f55-8673-dd30708e4ff2)
