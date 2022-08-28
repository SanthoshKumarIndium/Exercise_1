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

WebUI.setText(findTestObject('Page_PersonalDetails/input_DrivingLicense'), GlobalVariable.DrivingLicence)

WebUI.setText(findTestObject('Page_PersonalDetails/input_License Expiry Date'), GlobalVariable.LicenceExpiry)

WebUI.setText(findTestObject('Page_PersonalDetails/input_SSN Number'), GlobalVariable.SSNNUmber)

WebUI.setText(findTestObject('Page_PersonalDetails/input_SIN Number'), GlobalVariable.SINNumber)

WebUI.selectOptionByLabel(findTestObject('Page_PersonalDetails/Select_Nationality'), GlobalVariable.Nationality, false)

WebUI.selectOptionByLabel(findTestObject('Page_PersonalDetails/Select_Marital status'), GlobalVariable.MaritalStatus, false)

WebUI.setText(findTestObject('Page_PersonalDetails/input_Date of Birth'), GlobalVariable.DOB)

WebUI.click(findTestObject('Page_PersonalDetails/label_Gender'))

WebUI.setText(findTestObject('Page_PersonalDetails/input_Military Service'), GlobalVariable.MilitaryService)

WebUI.click(findTestObject('Page_PersonalDetails/button_Save1'))

WebUI.selectOptionByLabel(findTestObject('Page_PersonalDetails/Select_Blood type'), GlobalVariable.BloodType, false)

WebUI.click(findTestObject('Page_PersonalDetails/button_Save2'))

