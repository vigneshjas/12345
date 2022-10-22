Feature: Verify the Calculator and Tools modules

  Scenario Outline: Verify User added details ,earning and expenses
    Given User is an calculator and tools page
    When User should perform "<numberOfDependants>","<yourAnnualIncome>","<yourAnnualOtherIncome>","<monthlyLivingExpenses>","<currentHomeLoanMonthlyRepayments>","<otherLoanMonthlyRepayments>","<otherMonthlyCommitments>" and "<totalCreditCardLimits>"
    Then We estimate you could borrow values "4,79,000"
    And Click the start over

    Examples: 
      | numberOfDependants | yourAnnualIncome | yourAnnualOtherIncome | monthlyLivingExpenses | currentHomeLoanMonthlyRepayments | otherLoanMonthlyRepayments | otherMonthlyCommitments | totalCreditCardLimits |
      |                  0 |           80,000 |                17,000 |                   500 |                                0 |                        100 |                       0 |                10,000 |

  Scenario Outline: Entering the monthly living expences value only
    Given User is an calculator and tools page
    When User should perform "<monthlyLivingExpenses>"
    And User should be verify the message as "Based on the details you've entered, we're unable to give you an estimate of your borrowing power with this calculator. For questions, call us on 1800 035 500."

    Examples: 
      | monthlyLivingExpenses |
      |                     1 |
