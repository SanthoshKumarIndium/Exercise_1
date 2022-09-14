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

WebUI.click(findTestObject('Employee/Page_Depandant/a_Dependents'))

WebUI.click(findTestObject('Employee/Page_Depandant/button_Add'))

WebUI.setText(findTestObject('Employee/Page_Depandant/input_Name_oxd-input oxd-input--focus'), GlobalVariable.DependantName)

WebUI.click(findTestObject('Employee/Page_Depandant/Page_dropdown/dropdown_Relationship'))

WebUI.click(findTestObject('Employee/Page_Depandant/Page_dropdown/Select_Other'))

WebUI.setText(findTestObject('Employee/Page_Depandant/Page_dropdown/input_Relationship'), GlobalVariable.Relationship)

WebUI.setText(findTestObject('Employee/Page_Depandant/input_Date of Birth_oxd-input oxd-input--focus'), GlobalVariable.DependantDOB)

WebUI.click(findTestObject('Employee/Page_Depandant/button_Save'))

CustomKeywords.'verify.Verify'(findTestObject('Recruit/Page_Recruit/message_Successfully Updated'), GlobalVariable.successmessagesaved, 
    GlobalVariable.textDependants)

