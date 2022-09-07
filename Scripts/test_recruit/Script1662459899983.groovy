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

WebUI.callTestCase(findTestCase('Employee/EX-5 Navigation to URL'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Employee/EX-6 Verification of URL'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Employee/EX-7 Login into the Account'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Employee/EX-8 Verification of Account Logged in'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Recruit/EX-32 Recruit a Candidate Recruitment page'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Recruit/EX-33 Recruit a Candidate Shortlist a Candidate'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Recruit/EX-34 Recruit a Candidate Schedule a interview for Candidate'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Recruit/EX-35 Recruit a Candidate Interview status of Candidate'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Recruit/EX-36 Recruit a Candidate Job Offer of Candidate'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Recruit/EX-37 Recruit a Candidate Hire a Candidate'), [:], FailureHandling.STOP_ON_FAILURE)

