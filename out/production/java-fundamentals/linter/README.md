**JavaScript Linter**

The JavaScript Linter is a simple tool that analyzes JavaScript code files and checks for missing semicolons at the end of lines. It helps developers identify potential syntax errors in their code and ensures proper code formatting.

**How It Works**
The linter reads through each line of a given JavaScript file and checks if the line meets the following criteria:

   - It's not empty.
   - It doesn't end with an opening curly brace {.
   - It doesn't end with a closing curly brace }.
   - It doesn't contain the keywords if or else.

> If a line doesn't meet any of these criteria and doesn't end with a semicolon, 
  the linter considers it a missing semicolon error and generates an error message 
  indicating the line number.

**Example Output**
- Error in line 5: Missing semicolon.
- Error in line 12: Missing semicolon.