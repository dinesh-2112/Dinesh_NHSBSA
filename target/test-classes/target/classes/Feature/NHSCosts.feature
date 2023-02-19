
@NHSInformation

Feature: Treatment Information from NHS

@NHS
Scenario Outline: Successfully Checking the NHS Information

	When User clicks on Startnow option
	And User enters "<country>" information
	And User enters "<GP>" practice information
	And User enters "<Dental>" practice information
	And User enters Date of Birth "<Date>" "<Month>" "<Year>"
	And User enters "<partner>" information
	And User enters "<TaxCredit>" information
	And User enters "<pregnancy>" information
	And User enters serving in "<armedforces>" information
	And User enters "<Diabetes>" information
	And User enters "<otherconditions>" information
	And User enters "<glaucoma>" information
	And User enters "<carehome>" information
	And User enters "<savings>" information
	Then User displayed with information from NHS cost successfully
	
	Examples:
	
	|country|GP|Dental|Date|Month|Year|partner|TaxCredit|pregnancy|armedforces|Diabetes|otherconditions|glaucoma|carehome|savings|
	|ENGLAND|Yes|ENGLAND|21|12 |1987|Yes	|	No			|	No		  |No			  	|No			 |	Yes		       |Yes			|	No			|Yes		|

@NHS_Diabetes_Medication
Scenario Outline: Successfully Checking the NHS Information for Diabetes with Medication

	When User clicks on Startnow option
	And User enters "<country>" information
	And User enters "<GP>" practice information
	And User enters "<Dental>" practice information
	And User enters Date of Birth <Date> <Month> <Year>
	And User enters "<partner>" information
	And User enters "<TaxCredit>" information
	And User enters "<pregnancy>" information
	And User enters serving in "<armedforces>" information
	And User enters "<Diabetes>" information
	And User enters "<BloodSugar>" level information
	And User enters "<carehome>" information
	And User enters "<savings>" information
	Then User displayed with information from NHS cost successfully
	
	Examples:
	
	|country|GP|Dental|Date|Month|Year|partner|TaxCredit|pregnancy|armedforces|Diabetes|BloodSugar|carehome|savings|
	|ENGLAND|Yes|ENGLAND|21|	12 |1987|Yes		|	No			|	No		  |No			  	|Yes		 |	Yes			|	No			|Yes	|
	
@NHS_Diabetes_Without_Medication
Scenario Outline: Successfully Checking the NHS Information for Diabetes without Medication

	When User clicks on Startnow option
	And User enters "<country>" information
	And User enters "<GP>" practice information
	And User enters "<Dental>" practice information
	And User enters Date of Birth <Date> <Month> <Year>
	And User enters "<partner>" information
	And User enters "<TaxCredit>" information
	And User enters "<pregnancy>" information
	And User enters serving in "<armedforces>" information
	And User enters "<Diabetes>" information
	And User enters "<BloodSugar>" level information
	And User enters "<otherconditions>" information
	And User enters "<glaucoma>" information
	And User enters "<carehome>" information
	And User enters "<savings>" information
	Then User displayed with information from NHS cost successfully
	
	Examples:
	
	|country|GP|Dental|Date|Month|Year|partner|TaxCredit|pregnancy|armedforces|Diabetes|BloodSugar|otherconditions|glaucoma|carehome|savings|
	|ENGLAND|Yes|ENGLAND|21|	12 |1987|Yes		|	No			|	No		  |No			  	|Yes		 |	No			|Yes		        |Yes			|	No		|Yes	  |
	
@NHS_Diabetes_CareHome_CouncilPay
Scenario Outline: Successfully Checking the NHS Information for Care Home People

	When User clicks on Startnow option
	And User enters "<country>" information
	And User enters "<GP>" practice information
	And User enters "<Dental>" practice information
	And User enters Date of Birth <Date> <Month> <Year>
	And User enters "<partner>" information
	And User enters "<TaxCredit>" information
	And User enters "<pregnancy>" information
	And User enters serving in "<armedforces>" information
	And User enters "<Diabetes>" information
	And User enters "<otherconditions>" information
	And User enters "<glaucoma>" information
	And User enters "<carehome>" information
	And User enters "<Council>" help for Care home information
	Then User displayed with information from NHS cost successfully
	
	Examples:
	
	|country|GP|Dental|Date|Month|Year|partner|TaxCredit|pregnancy|armedforces|Diabetes|otherconditions|glaucoma|carehome|Council|
	|ENGLAND|Yes|ENGLAND|21|	12 |1987|Yes		|	No			|	No		  |No			  	|No			 |	Yes		       |Yes			|	Yes		 |Yes		|
	
@NHS_Diabetes_CareHome_Without_CouncilPay
Scenario Outline: Successfully Checking the NHS Information for Care Home People without councilpay

	When User clicks on Startnow option
	And User enters "<country>" information
	And User enters "<GP>" practice information
	And User enters "<Dental>" practice information
	And User enters Date of Birth <Date> <Month> <Year>
	And User enters "<partner>" information
	And User enters "<TaxCredit>" information
	And User enters "<pregnancy>" information
	And User enters serving in "<armedforces>" information
	And User enters "<Diabetes>" information
	And User enters "<otherconditions>" information
	And User enters "<glaucoma>" information
	And User enters "<carehome>" information
	And User enters "<Council>" help for Care home information
	And User enters "<savings>" information
	Then User displayed with information from NHS cost successfully
	
	Examples:
	
	|country|GP|Dental|Date|Month|Year|partner|TaxCredit|pregnancy|armedforces|Diabetes|otherconditions|glaucoma|carehome|Council|savings|
	|ENGLAND|Yes|ENGLAND|21|	12 |1987|Yes		|	No			|	No		  |No			  	|No			 |	Yes		       |Yes			|	Yes		 |No		 | No		|
	
@NHS_Livein_Scotland
Scenario Outline: Successfully Checking the NHS Information for Scotland People

	When User clicks on Startnow option
	And User enters "<country>" information
	And User enters "<Highlands>" and Islands information
	And User enters "<GP>" practice information
	And User enters "<Dental>" practice information
	And User enters Date of Birth <Date> <Month> <Year>
	And User enters "<partner>" information
	And User enters "<TaxCredit>" information
	And User enters "<pregnancy>" information
	And User enters serving in "<armedforces>" information
	And User enters "<Diabetes>" information
	And User enters "<otherconditions>" information
	And User enters "<glaucoma>" information
	And User enters "<carehome>" information
	And User enters "<savings>" information
	Then User displayed with information from NHS cost successfully
	
	Examples:
	
	|country |Highlands|GP |Dental|Date|Month|Year|partner|TaxCredit|pregnancy|armedforces|Diabetes|otherconditions|glaucoma|carehome|savings|
	|SCOTLAND|Yes	|Yes|SCOTLAND|21 |	12 |1987|Yes		|	No			|	No		  |No			  	|No			 |	Yes		       |Yes			|	No			|Yes		|

@NHS_Livein_Northern_Ireland
Scenario Outline: Successfully Checking the NHS Information for Northern Ireland People

	When User clicks on Startnow option
	And User enters "<country>" information
	Then User displayed with information from NHS cost successfully
	
	Examples:
	
	|country		 |
	|NORTHERN_IRELAND|
	
	
@NHS_Universal_Credit
	
Scenario Outline: Successfully Checking the NHS Information for people who receive universal Credit

	When User clicks on Startnow option
	And User enters "<country>" information
	And User enters "<GP>" practice information
	And User enters "<Dental>" practice information
	And User enters Date of Birth <Date> <Month> <Year>
	And User enters "<partner>" information
	And User enters "<TaxCredit>" information
	And User enters "<universal>" credit information
	And User enters "<LCW>" information
	And User enters "<TakeHome>" Pay information
	Then User displayed with information from NHS cost successfully
	
Examples:
	
	|country|GP|Dental|Date|Month|Year|partner|TaxCredit|universal												|LCW|TakeHome|
	|ENGLAND|Yes|ENGLAND|21|	12 |1987|Yes		|	Yes			|	YES_I_RECEIVED_UNIVERSAL_CREDIT	|Yes|Yes		 |
	
@NHS_Universal_Credit_WithoutLCW
	
Scenario Outline: Successfully Checking the NHS Information for people who receive universal Credit without LCW

	When User clicks on Startnow option
	And User enters "<country>" information
	And User enters "<GP>" practice information
	And User enters "<Dental>" practice information
	And User enters Date of Birth <Date> <Month> <Year>
	And User enters "<partner>" information
	And User enters "<TaxCredit>" information
	And User enters "<universal>" credit information
	And User enters "<LCW>" information
	And User enters "<TakeHome>" Pay information
	Then User displayed with information from NHS cost successfully
	
Examples:
	
	|country|GP|Dental|Date|Month|Year|partner|TaxCredit|universal											|LCW|TakeHome|
	|ENGLAND|Yes|ENGLAND|21|	12 |1987|Yes		|	Yes			|YES_I_RECEIVED_UNIVERSAL_CREDIT|No |Yes		 |
	
@NHS_Universal_Credit_WithoutLCW_MoreThan435
	
Scenario Outline: Successfully Checking the NHS Information for people who receive universal Credit without LCW and receives more than 435 pounds Take Home

	When User clicks on Startnow option
	And User enters "<country>" information
	And User enters "<GP>" practice information
	And User enters "<Dental>" practice information
	And User enters Date of Birth <Date> <Month> <Year>
	And User enters "<partner>" information
	And User enters "<TaxCredit>" information
	And User enters "<universal>" credit information
	And User enters "<LCW>" information
	And User enters "<TakeHome>" Pay information
	And User enters "<pregnancy>" information
	And User enters serving in "<armedforces>" information
	And User enters "<Diabetes>" information
	And User enters "<otherconditions>" information
	And User enters "<glaucoma>" information
	And User enters "<carehome>" information
	And User enters "<savings>" information
	Then User displayed with information from NHS cost successfully
	
Examples:
	
	|country|GP|Dental|Date|Month|Year|partner|TaxCredit|universal												|LCW|TakeHome|pregnancy|armedforces|Diabetes|otherconditions|glaucoma|carehome|savings|
	|ENGLAND|Yes|ENGLAND|21|	12 |1987|Yes		|	Yes			|	YES_I_RECEIVED_UNIVERSAL_CREDIT	|No |No		   |No		   |No			  	|No			 |	Yes		       |Yes			|	No			|Yes	|
	
	
@NHS_Universal_Credit_Applied
	
Scenario Outline: Successfully Checking the NHS Information for people who applied universal Credit

	When User clicks on Startnow option
	And User enters "<country>" information
	And User enters "<GP>" practice information
	And User enters "<Dental>" practice information
	And User enters Date of Birth <Date> <Month> <Year>
	And User enters "<partner>" information
	And User enters "<TaxCredit>" information
	And User enters "<universal>" credit information
	And User reads Decision information and clicks on Next
	And User enters multiple benefits information
	Then User displayed with information from NHS cost successfully
	
Examples:
	
	|country|GP|Dental|Date|Month|Year|partner|TaxCredit|universal|
	|ENGLAND|Yes|ENGLAND|21|	12 |1987|Yes		|	Yes			|	NOT_YET	|
	
@NHS_Universal_Credit_Applied_Without_Benefits
	
Scenario Outline: Successfully Checking the NHS Information for people who applied universal Credit without any benefits

	When User clicks on Startnow option
	And User enters "<country>" information
	And User enters "<GP>" practice information
	And User enters "<Dental>" practice information
	And User enters Date of Birth <Date> <Month> <Year>
	And User enters "<partner>" information
	And User enters "<TaxCredit>" information
	And User enters "<universal>" credit information
	And User reads Decision information and clicks on Next
	And User enters no benefits information
	And User enters "<pregnancy>" information
	And User enters serving in "<armedforces>" information
	And User enters "<Diabetes>" information
	And User enters "<otherconditions>" information
	And User enters "<glaucoma>" information
	And User enters "<carehome>" information
	And User enters "<savings>" information
	Then User displayed with information from NHS cost successfully
	
Examples:
	
	|country|GP|Dental|Date|Month|Year|partner|TaxCredit|universal|pregnancy|armedforces|Diabetes|otherconditions|glaucoma|carehome|savings|
	|ENGLAND|Yes|ENGLAND|21|	12 |1987|Yes		|	Yes			|	NOT_YET	|No		  |No			  	|No			 |	Yes		       |Yes			|	No			|Yes		|

@NHS_Universal_Credit_Applied_MultipleBenefits_Error
	
Scenario Outline: Successfully Checking the NHS Information for people who applied universal Credit with ESA and JSA together

	When User clicks on Startnow option
	And User enters "<country>" information
	And User enters "<GP>" practice information
	And User enters "<Dental>" practice information
	And User enters Date of Birth <Date> <Month> <Year>
	And User enters "<partner>" information
	And User enters "<TaxCredit>" information
	And User enters "<universal>" credit information
	And User reads Decision information and clicks on Next
	And User enters ESA and JSA information together
	Then User displayed with error message
	
Examples:
	
	|country|GP|Dental|Date|Month|Year|partner|TaxCredit|universal|
	|ENGLAND|Yes|ENGLAND|21|	12 |1987|Yes		|	Yes			|	NOT_YET	|
	
@NHS_Universal_Credit_No_Benefits
Scenario Outline: Successfully Checking the NHS Information for people who receive universal Credit without any Benefits

	When User clicks on Startnow option
	And User enters "<country>" information
	And User enters "<GP>" practice information
	And User enters "<Dental>" practice information
	And User enters Date of Birth <Date> <Month> <Year>
	And User enters "<partner>" information
	And User enters "<TaxCredit>" information
	And User enters "<universal>" credit information
	And User enters no benefits information
	And User enters "<pregnancy>" information
	And User enters serving in "<armedforces>" information
	And User enters "<Diabetes>" information
	And User enters "<otherconditions>" information
	And User enters "<glaucoma>" information
	And User enters "<carehome>" information
	And User enters "<savings>" information
	Then User displayed with information from NHS cost successfully
	
Examples:
	
	|country|GP|Dental|Date|Month|Year|partner|TaxCredit|universal										|pregnancy|armedforces|Diabetes|otherconditions|glaucoma|carehome|savings|
	|ENGLAND|Yes|ENGLAND|21|	12 |1987|Yes		|	Yes			|	NO_I_GET_DIFFERENT_BENEFIT	|No		   |No			  	|No			 |	Yes		       |Yes			|	No			|Yes	|
	
@NHS_Universal_Credit_Tax_Credit_Benefits
Scenario Outline: Successfully Checking the NHS Information for people who applied universal Credit with Tax Credit Benefits

	When User clicks on Startnow option
	And User enters "<country>" information
	And User enters "<GP>" practice information
	And User enters "<Dental>" practice information
	And User enters Date of Birth <Date> <Month> <Year>
	And User enters "<partner>" information
	And User enters "<TaxCredit>" information
	And User enters "<universal>" credit information
	And User selects "<TaxCreditType>" information
	Then User displayed with information from NHS cost successfully
	
Examples:
	
	|country|GP|Dental|Date|Month|Year|partner|TaxCredit|universal									|TaxCreditType				|
	|ENGLAND|Yes|ENGLAND|21|	12 |1987|Yes		|	Yes			|	NO_I_GET_DIFFERENT_BENEFIT|workingChildTaxCredit|
	
@NHS_Universal_Credit_IncomeSupport_Benefits
Scenario Outline: Successfully Checking the NHS Information for people who applied universal Credit with IS Benefits

	When User clicks on Startnow option
	And User enters "<country>" information
	And User enters "<GP>" practice information
	And User enters "<Dental>" practice information
	And User enters Date of Birth <Date> <Month> <Year>
	And User enters "<partner>" information
	And User enters "<TaxCredit>" information
	And User enters "<universal>" credit information
	And User selects Income Support information
	Then User displayed with information from NHS cost successfully
	
Examples:
	
	|country|GP|Dental|Date|Month|Year|partner|TaxCredit|universal									|
	|ENGLAND|Yes|ENGLAND|21|	12 |1987|Yes		|	Yes			|	NO_I_GET_DIFFERENT_BENEFIT|
	
@NHS_Universal_Credit_ESA_Benefits
Scenario Outline: Successfully Checking the NHS Information for people who applied universal Credit with ESA Benefits

	When User clicks on Startnow option
	And User enters "<country>" information
	And User enters "<GP>" practice information
	And User enters "<Dental>" practice information
	And User enters Date of Birth <Date> <Month> <Year>
	And User enters "<partner>" information
	And User enters "<TaxCredit>" information
	And User enters "<universal>" credit information
	And User selects ESA information
	Then User displayed with information from NHS cost successfully
	
Examples:
	
	|country|GP|Dental|Date|Month|Year|partner|TaxCredit|universal									|
	|ENGLAND|Yes|ENGLAND|21|	12 |1987|Yes		|	Yes			|	NO_I_GET_DIFFERENT_BENEFIT|
	
@NHS_Universal_Credit_ESA__Contribution_Benefits
Scenario Outline: Successfully Checking the NHS Information for people who applied universal Credit with ESA Contribution Benefits

	When User clicks on Startnow option
	And User enters "<country>" information
	And User enters "<GP>" practice information
	And User enters "<Dental>" practice information
	And User enters Date of Birth <Date> <Month> <Year>
	And User enters "<partner>" information
	And User enters "<TaxCredit>" information
	And User enters "<universal>" credit information
	And User selects contribution based ESA information
	And User enters "<pregnancy>" information
	And User enters serving in "<armedforces>" information
	And User enters "<Diabetes>" information
	And User enters "<otherconditions>" information
	And User enters "<glaucoma>" information
	And User enters "<carehome>" information
	And User enters "<savings>" information
	Then User displayed with information from NHS cost successfully
	
Examples:
	
	|country|GP|Dental|Date|Month|Year|partner|TaxCredit|universal									|pregnancy|armedforces|Diabetes|otherconditions|glaucoma|carehome|savings|
	|ENGLAND|Yes|ENGLAND|21|	12 |1987|Yes		|	Yes			|	NO_I_GET_DIFFERENT_BENEFIT|No		   |No			  	|No			 |	Yes		       |Yes			|	No			|Yes	|

	
@NHS_Universal_Credit_JSA_Benefits
Scenario Outline: Successfully Checking the NHS Information for people who applied universal Credit with JSA Benefits

	When User clicks on Startnow option
	And User enters "<country>" information
	And User enters "<GP>" practice information
	And User enters "<Dental>" practice information
	And User enters Date of Birth <Date> <Month> <Year>
	And User enters "<partner>" information
	And User enters "<TaxCredit>" information
	And User enters "<universal>" credit information
	And User selects JSA information
	Then User displayed with information from NHS cost successfully
	
Examples:
	
	|country|GP|Dental|Date|Month|Year|partner|TaxCredit|universal									|
	|ENGLAND|Yes|ENGLAND|21|	12 |1987|Yes		|	Yes			|	NO_I_GET_DIFFERENT_BENEFIT|
	
@NHS_Universal_Credit_ESA__Contribution_Benefits
Scenario Outline: Successfully Checking the NHS Information for people who applied universal Credit with JSA Contribution Benefits

	When User clicks on Startnow option
	And User enters "<country>" information
	And User enters "<GP>" practice information
	And User enters "<Dental>" practice information
	And User enters Date of Birth <Date> <Month> <Year>
	And User enters "<partner>" information
	And User enters "<TaxCredit>" information
	And User enters "<universal>" credit information
	And User selects contribution based JSA information
	And User enters "<pregnancy>" information
	And User enters serving in "<armedforces>" information
	And User enters "<Diabetes>" information
	And User enters "<otherconditions>" information
	And User enters "<glaucoma>" information
	And User enters "<carehome>" information
	And User enters "<savings>" information
	Then User displayed with information from NHS cost successfully
	
Examples:
	
	|country|GP|Dental|Date|Month|Year|partner|TaxCredit|universal									|pregnancy|armedforces|Diabetes|otherconditions|glaucoma|carehome|savings|
	|ENGLAND|Yes|ENGLAND|21|	12 |1987|Yes		|	Yes			|	NO_I_GET_DIFFERENT_BENEFIT|No		   |No			  	|No			 |	Yes		       |Yes			|	No			|Yes	|

@NHS_Universal_Credit_Pension_Benefits
Scenario Outline: Successfully Checking the NHS Information for people who applied universal Credit with Pension Benefits

	When User clicks on Startnow option
	And User enters "<country>" information
	And User enters "<GP>" practice information
	And User enters "<Dental>" practice information
	And User enters Date of Birth <Date> <Month> <Year>
	And User enters "<partner>" information
	And User enters "<TaxCredit>" information
	And User enters "<universal>" credit information
	And User selects "<PensionType>" information
	Then User displayed with information from NHS cost successfully
	
Examples:
	
	|country|GP|Dental|Date|Month|Year|partner|TaxCredit|universal									|PensionType				|
	|ENGLAND|Yes|ENGLAND|21|	12 |1987|Yes		|	Yes			|	NO_I_GET_DIFFERENT_BENEFIT|guaranteecreditonly|

@NHS_Universal_Credit_Pension_Savings
Scenario Outline: Successfully Checking the NHS Information for people who applied universal Credit with Pension savings Benefits

	When User clicks on Startnow option
	And User enters "<country>" information
	And User enters "<GP>" practice information
	And User enters "<Dental>" practice information
	And User enters Date of Birth <Date> <Month> <Year>
	And User enters "<partner>" information
	And User enters "<TaxCredit>" information
	And User enters "<universal>" credit information
	And User selects pension based savings information
	And User enters "<pregnancy>" information
	And User enters serving in "<armedforces>" information
	And User enters "<Diabetes>" information
	And User enters "<otherconditions>" information
	And User enters "<glaucoma>" information
	And User enters "<carehome>" information
	And User enters "<savings>" information
	Then User displayed with information from NHS cost successfully
	
Examples:
	
	|country|GP|Dental|Date|Month|Year|partner|TaxCredit|universal									|pregnancy|armedforces|Diabetes|otherconditions|glaucoma|carehome|savings|
	|ENGLAND|Yes|ENGLAND|21|	12 |1987|Yes		|	Yes			|	NO_I_GET_DIFFERENT_BENEFIT|No		   |No			  	|No			 |	Yes		       |Yes			|	No			|Yes	|
	
@NHS_Universal_Credit_TaxCredit_WorkingTax
Scenario Outline: Successfully Checking the NHS Information for people who applied universal Credit with Working Tax Benefits

	When User clicks on Startnow option
	And User enters "<country>" information
	And User enters "<GP>" practice information
	And User enters "<Dental>" practice information
	And User enters Date of Birth <Date> <Month> <Year>
	And User enters "<partner>" information
	And User enters "<TaxCredit>" information
	And User enters "<universal>" credit information
	And User selects TaxCredit based working tax information
	And User enters "<pregnancy>" information
	And User enters serving in "<armedforces>" information
	And User enters "<Diabetes>" information
	And User enters "<otherconditions>" information
	And User enters "<glaucoma>" information
	And User enters "<carehome>" information
	And User enters "<savings>" information
	Then User displayed with information from NHS cost successfully
	
Examples:
	
	|country|GP|Dental|Date|Month|Year|partner|TaxCredit|universal									|pregnancy|armedforces|Diabetes|otherconditions|glaucoma|carehome|savings|
	|ENGLAND|Yes|ENGLAND|21|	12 |1987|Yes		|	Yes			|	NO_I_GET_DIFFERENT_BENEFIT|No		   |No			  	|No			 |	Yes		       |Yes			|	No			|Yes	|
	


