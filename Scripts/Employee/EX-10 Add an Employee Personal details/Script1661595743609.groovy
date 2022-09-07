import internal.GlobalVariable as GlobalVariable
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
import org.openqa.selenium.Keys as Keys

WebUI.setText(findTestObject('Employee/Page_PersonalDetails/input_DrivingLicense'), GlobalVariable.DrivingLicence)

WebUI.setText(findTestObject('Employee/Page_PersonalDetails/input_License Expiry Date'), GlobalVariable.LicenceExpiry)

WebUI.setText(findTestObject('Employee/Page_PersonalDetails/input_SSN Number'), GlobalVariable.SSNNUmber)

WebUI.setText(findTestObject('Employee/Page_PersonalDetails/input_SIN Number'), GlobalVariable.SINNumber)

WebUI.click(findTestObject('Employee/Page_PersonalDetails/Page_dropdown/dropdown_Nationality'))

WebUI.click(findTestObject('Employee/Page_PersonalDetails/Page_dropdown/select_nationality', [('nationality') : GlobalVariable.Nationality]))

WebUI.click(findTestObject('Employee/Page_PersonalDetails/Page_dropdown/dropdown_Maritalstatus'))

WebUI.click(findTestObject('Employee/Page_PersonalDetails/Page_dropdown/select_maritalstatus', [('maritalstatus') : GlobalVariable.MaritalStatus]))

WebUI.setText(findTestObject('Employee/Page_PersonalDetails/input_Date of Birth'), GlobalVariable.DOB)

WebUI.click(findTestObject('Employee/Page_PersonalDetails/label_Gender'))

WebUI.setText(findTestObject('Employee/Page_PersonalDetails/input_Military Service'), GlobalVariable.MilitaryService)

WebUI.click(findTestObject('Employee/Page_PersonalDetails/button_Save1'))

WebUI.click(findTestObject('Employee/Page_PersonalDetails/Page_dropdown/dropdown_Bloodgroup'))

WebUI.click(findTestObject('Employee/Page_PersonalDetails/Page_dropdown/select_bloodgroup', [('bloodgroup') : GlobalVariable.BloodType]))

WebUI.click(findTestObject('Employee/Page_PersonalDetails/button_Save2'))

WebUI.scrollToElement(findTestObject('Employee/Page_PersonalDetails/Page_OrangeHRM/h6_Personal Details'), 3)

not_run: WebUI.scrollToElement(findTestObject('Employee/Page_PersonalDetails/Page_OrangeHRM/a_Personal Details'), 3)

not_run: WebUI.setText(findTestObject('Employee/Page_PersonalDetails/Page_OrangeHRM/input_Employee Full Name_firstName'), '')

