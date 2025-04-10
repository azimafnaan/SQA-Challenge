# SQA-Challenge

## QA Challenge : https://github.com/azimafnaan/SQA-Challenge/tree/main/qa-code-quiz

- Step-1

  - Test Case Writing

  ### This is the first step I need to take. The test case is the foundation for all testing. In this step, I will choose:

  - We will look at the username and password entries. This means we will check if they are filled in correctly. We will also see how the system responds to wrong passwords.
  - We will show what the expected output should seem like.
  - We will give clear steps on how to do the tests.
  - Test Case Link: https://docs.google.com/spreadsheets/d/1qf6-BIL_7cJ2VF5ELKo58uAE5iVAvMjID_anRNpb_Pg/edit?usp=sharing

- Step-2

  - API Testing (Manual API Testing using Postman)

  ### I want to test the APIs by myself. I will use the test cases for this. This will help me make sure they work correctly. If I do not do this, I will not know if there are any problems in the code or with the API. This is important when I try to automate the process.

  - Tools: Postman
  - What to test:
  - Use the Login API with a POST request to /login.
  - It helps to create and check tokens.
  - You will get responses for errors like 401 or 400.

- Step-3

  - API Test Automation (Using tools like cypress)

  ### Once you feel good about the manual testing results, start automating the APIs. This step will make regression testing easier.

  - Tools: Cypress
    `GitHub Link: https://github.com/azimafnaan/SQA-Challenge/tree/main/Cypress-api-testing`

- Step-4
  - UI/End-to-End Test Automation (Using Selenium )
  ### Automating the whole process using the user interface is very important. This is key because it relies on all the other tests.
  - What to test:
  - Fill out the form.
  - Click the login button.
  - You will go to a new page.
  - You may see some error messages on the screen, etc.
  - Tools: Selenium
    `GitHub Link: https://github.com/azimafnaan/SQA-Challenge/tree/main/TestAutomation`
