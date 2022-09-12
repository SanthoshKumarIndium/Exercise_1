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

WebUI.click(findTestObject('Employee/Page_Salary/a_Salary'))

WebUI.click(findTestObject('Employee/Page_Salary/button_Add'))

WebUI.setText(findTestObject('Employee/Page_Salary/input_Salary Component_oxd-input oxd-input--focus'), GlobalVariable.SalaryComponent)

WebUI.click(findTestObject('Employee/Page_Salary/Page_dropdown/dropdown_PayGrade'))

WebUI.click(findTestObject('Employee/Page_Salary/Page_dropdown/select_PayGrade', [('paygrade') : GlobalVariable.PayGrade]))

WebUI.click(findTestObject('Employee/Page_Salary/Page_dropdown/dropdown_PayFrequency'))

WebUI.click(findTestObject('Employee/Page_Salary/Page_dropdown/select_PayFrequency', [('payfrequency') : GlobalVariable.PayFrequency]))

WebUI.click(findTestObject('Employee/Page_Salary/Page_dropdown/dropdown_Currency'))

WebUI.click(findTestObject('Employee/Page_Salary/Select_currency', [('currency') : GlobalVariable.Currency]))

WebUI.setText(findTestObject('Employee/Page_Salary/input_Amount_oxd-input oxd-input--focus'), GlobalVariable.Amount)

WebUI.click(findTestObject('Employee/Page_Salary/button_Save'))

CustomKeywords.'verify.Verify'(findTestObject('Recruit/Page_Recruit/message_Successfully Updated'), GlobalVariable.successmessagesaved)

