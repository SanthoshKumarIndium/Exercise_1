import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('EX-5 Navigation to URL'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('EX-6 Verification of URL'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('EX-7 Login into the Account'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('EX-8 Verification of Account Logged in'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('EX-9 Add an Employee Employee page'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('EX-10 Add an Employee Personal details'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('EX-11 Add an Employee Contact details'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('EX-12 Add an Employee Emergency contacts'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('EX-13 Add an Employee Dependants'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('EX-14 Add an Employee Job'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('EX-15 Add an Employee Salary'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('EX-16 Add an Employee Report-to'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('EX-17 Verification of Employee data in Employee list'), [:], FailureHandling.STOP_ON_FAILURE)

