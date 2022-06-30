Feature: Calculation with 2 inputs

Scenario Outline: Calcaulate the final amount
Given Billing amount is <BillingAmount>
When Tax amount is <TaxAmount>
Then Final amount is <FinalAmount>

Examples:
| BillingAmount | TaxAmount | FinalAmount | 
| 100 | 10 | 110 |
| 225 | 4.5 | 229.5 |