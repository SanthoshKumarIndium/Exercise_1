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

WebUI.verifyElementClickable(findTestObject('Page_AddEmployee/Page_list/checkbox_list'))

WebUI.click(findTestObject('Page_AddEmployee/Page_list/checkbox_list'))

WebUI.verifyElementClickable(findTestObject('Page_AddEmployee/Page_list/button_Delete Selected'))

WebUI.click(findTestObject('Page_AddEmployee/Page_list/button_Delete Selected'))

WebUI.verifyElementClickable(findTestObject('Page_AddEmployee/Page_list/i_Yes, Delete_oxd-icon bi-trash oxd-button-icon'))

WebUI.click(findTestObject('Page_AddEmployee/Page_list/i_Yes, Delete_oxd-icon bi-trash oxd-button-icon'))

WebUI.verifyElementClickable(findTestObject('Page_AddEmployee/li_Add Employee'))

WebUI.click(findTestObject('Page_AddEmployee/li_Add Employee'))

WebUI.setText(findTestObject('Page_AddEmployee/input_Employee Full Name_firstName'), GlobalVariable.Firstname)

WebUI.setText(findTestObject('Page_AddEmployee/input_Employee Full Name_lastName'), GlobalVariable.Lastname)

WebUI.click(findTestObject('Page_AddEmployee/spanSwitch_Login details'))

WebUI.verifyElementVisible(findTestObject('Page_AddEmployee/input_Username_Login details'))

WebUI.setText(findTestObject('Page_AddEmployee/input_Username_Login details'), GlobalVariable.LoginName)

WebUI.verifyElementVisible(findTestObject('Page_AddEmployee/input_Password_Login details'))

WebUI.setText(findTestObject('Page_AddEmployee/input_Password_Login details'), GlobalVariable.LoginPassword)

WebUI.verifyElementVisible(findTestObject('Page_AddEmployee/input_Confirm Password_Login details'))

WebUI.setText(findTestObject('Page_AddEmployee/input_Confirm Password_Login details'), GlobalVariable.LoginPassword)

WebUI.verifyElementClickable(findTestObject('Page_AddEmployee/button_Save-add Employee'))

WebUI.click(findTestObject('Page_AddEmployee/button_Save-add Employee'))

