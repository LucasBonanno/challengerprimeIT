# Using Gherkin, test cases are created based on user stories.
@EmailTest
Feature: Sending messages.

  Scenario: User sends a message to a Message Server.
    Given A User sends an "hello" message
    When The message is converted by the Adapter
    Then The Message server should contain the "hello" message in the queue
