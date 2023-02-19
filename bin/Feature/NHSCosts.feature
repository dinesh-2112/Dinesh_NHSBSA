#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template

@NHSInformation

Feature: Treatment Information from NHS

@NHS
Scenario Outline: Successfully Checking the NHS Information

	Given User is on NHSBSA Home Page
	When User clicks on Startnow option
	And User enters <country> information
	And User enters <GP> practice information
	And User enters <Dental> practice information
	And User enters Date of Birth <Date> <Month> <Year>
	And User enters <partner> information
	And User enters <TaxCredit> information
	And User enters <pregnancy> information
	And User enters serving in <armedforces> information
	And User enters <Diabetes> information
	And User enters <otherconditions> information
	And User enters <glaucoma> information
	And User enters <carehome> information
	And User enters <savings> information
	Then User displayed with information from NHS cost successfully
	
	Examples:
	
	|country|GP|Dental|Date|Month|Year|partner|TaxCredit|pregnancy|armedforces|Diabetes|otherconditions|glaucoma|carehome|savings|
	|ENGLAND|Yes|ENGLAND|21|	12 |1987|Yes		|	No			|	No		  |No			  	|No			 |	Yes		       |Yes			|	No			|Yes		|

Scenario: Successfully Checking the NHS Information for Diabetes with Medication

	Given User is on NHSBSA Home Page
	When User clicks on Startnow option
	And User enters country information
	And User enters GP practice information
	And User enters Dental practice information
	And User enters Date of Birth
	And User enters partner information
	And User enters benefits information
	And User enters pregnancy information
	And User enters serving in armed forces information
	And User enters diabetes information
	And User enters Blood Sugar level information
	And User enters care home information
	And User enters savings information
	Then User displayed with information from NHS cost successfully
	
	Scenario: Successfully Checking the NHS Information for Diabetes without Medication

	Given User is on NHSBSA Home Page
	When User clicks on Startnow option
	And User enters country information
	And User enters GP practice information
	And User enters Dental practice information
	And User enters Date of Birth
	And User enters partner information
	And User enters benefits information
	And User enters pregnancy information
	And User enters serving in armed forces information
	And User enters diabetes information
	And User enters Blood Sugar level information
	And User enters other conditions information
	And User enters glaucoma information
	And User enters care home information
	And User enters savings information
	Then User displayed with information from NHS cost successfully
	
Scenario: Successfully Checking the NHS Information for Care Home People

	Given User is on NHSBSA Home Page
	When User clicks on Startnow option
	And User enters country information
	And User enters GP practice information
	And User enters Dental practice information
	And User enters Date of Birth
	And User enters partner information
	And User enters benefits information
	And User enters pregnancy information
	And User enters serving in armed forces information
	And User enters diabetes information
	And User enters other conditions information
	And User enters glaucoma information
	And User enters care home information
	And User enters Council help for Care home information
	Then User displayed with information from NHS cost successfully
	
	Scenario: Successfully Checking the NHS Information for people who receive universal Credit

	Given User is on NHSBSA Home Page
	When User clicks on Startnow option
	And User enters country information
	And User enters GP practice information
	And User enters Dental practice information
	And User enters Date of Birth
	And User enters partner information
	And User enters benefits information
	And User enters universal credit information
	And User enters LCW information
	And User enters Take Home Pay information
	Then User displayed with information from NHS cost successfully
	
	Scenario: Successfully Checking the NHS Information for people who applied universal Credit

	Given User is on NHSBSA Home Page
	When User clicks on Startnow option
	And User enters country information
	And User enters GP practice information
	And User enters Dental practice information
	And User enters Date of Birth
	And User enters partner information
	And User enters benefits information
	And User enters universal credit information
	And User reads through Universal Credit conditions and clicks on Next
	And User enters other benefits information
	And User enters pregnancy information
	And User enters serving in armed forces information
	And User enters diabetes information
	And User enters other conditions information
	And User enters glaucoma information
	And User enters care home information
	And User enters savings information
	Then User displayed with information from NHS cost successfully

Feature: Title of your feature
  I want to use this template for my feature file

  @tag1
  Scenario: Title of your scenario
    Given I want to write a step with precondition
    And some other precondition
    When I complete action
    And some other action
    And yet another action
    Then I validate the outcomes
    And check more outcomes

  @tag2
  Scenario Outline: Title of your scenario outline
    Given I want to write a step with <name>
    When I check for the <value> in step
    Then I verify the <status> in step

    Examples: 
      | name  | value | status  |
      | name1 |     5 | success |
      | name2 |     7 | Fail    |
