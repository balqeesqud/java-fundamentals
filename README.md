# java-fundamentals

**Lab-01**
> Methods Used in this Repo => [Main-Java](./basics/Main.java)
- Pluralize
- flipNHeads
- clock

**Lab-02**
> Methods created in [Library](./basiclibrary/lib/src/main/Library.java)
- roll
- containsDuplicates
- calculateAverage
- calculateLowestAverage

> - Created Test cases in [Library Test](./basiclibrary/LibraryTest.java)

**Lab-03**
 
> Methods created in [Library](./basiclibrary/lib/src/main/Library.java)
- AnalyzingWeatherData
- tally 
- linter directory to read a JS file; which checks for an errors 
 

> - Created Test cases in [App Test](./linter/app/src/test/java/linter/AppTest.java)
- FewErrors.js 
- ManyErrors.js
- SingleError.js


**Lab-06**
>Classes created in [Library](./inheritance/lib/src/main/java/inheritance/Library.java)
- `Restaurant` class represents a restaurant and contains the following attributes:
    - `name`: The name of the restaurant.
    - `stars`: The average star rating of the restaurant.
    - `priceCategory`: The price category of the restaurant (number of dollar signs).
    - `reviews`: A list of associated reviews.
- Methods in the `Restaurant` class:
    - Constructor: Initializes the restaurant with a name, star rating, and price category.
    - `addReview(Review review)`: Adds a review to the restaurant and updates the star rating accordingly.
    - `toString()`: Generates a string representation of the restaurant, including its name, star rating, price category, and associated reviews.

- `Review` class represents a review and contains the following attributes:
    - `body`: The content of the review.
    - `author`: The author of the review.
    - `numberOfStars`: The number of stars in the review.
    - `restaurant`: The restaurant being reviewed.
- Methods in the `Review` class:
    - Constructor: Initializes the review with the review content, author, number of stars, and associated restaurant.
    - `getNumberOfStars()`: Returns the number of stars in the review.
    - `toString()`: Generates a string representation of the review, including its content, author, and number of stars.

