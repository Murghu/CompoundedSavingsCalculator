## CompoundInterest

### Description

The `CompoundInterest` program calculates the compounded amount of daily contributions over a specified number of days and converts the amount to words in Indian currency format.

### Features

- **User Input:**
  - Daily contribution amount in Rupees.
  - Number of days for compounding.
  
- **Compounded Amount Calculation:**
  - Uses the formula \( \text{totalAmount} += \text{dailyContribution} \times 2^i \).
  
- **Amount in Words Conversion:**
  - Converts the compounded amount to words in Indian currency format.

### Code Walkthrough

- **Main Method:**
  - Reads user input for daily contribution and number of days.
  - Computes the compounded amount.
  - Converts the compounded amount to words.
  - Prints the results.

- **calculateCompoundedAmount Method:**
  - Calculates the compounded amount by doubling the contribution each day.

- **convertToWords Method:**
  - Converts an integer to its word representation using the Indian numbering system.

### Usage
 **Follow Prompts:**
   - Enter daily contribution in Rupees.
   - Enter number of days.
   - View compounded amount and its word representation.

This program helps understand the growth of daily contributions and provides a textual representation of the final amount for financial records.
