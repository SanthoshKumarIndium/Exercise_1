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

WebUI.click(findTestObject('Employee/Page_Job/a_Job'))

WebUI.setText(findTestObject('Employee/Page_Job/input_Joined Date_oxd-input oxd-input--focus'), GlobalVariable.JoinDate)

WebUI.click(findTestObject('Employee/Page_Job/Page_dropdown/dropdown_JobTitle'))

WebUI.click(findTestObject('Employee/Page_Job/Page_dropdown/select_Jobtitle', [('jobtitle') : GlobalVariable.JobTitle]))

WebUI.click(findTestObject('Employee/Page_Job/Page_dropdown/dropdown_JobCategory'))

WebUI.click(findTestObject('Employee/Page_Job/Page_dropdown/select_JobCategory', [('jobcategory') : GlobalVariable.JobCategory]))

WebUI.click(findTestObject('Employee/Page_Job/Page_dropdown/dropdown_SubUnit'))

WebUI.click(findTestObject('Employee/Page_Job/Page_dropdown/select_SubUnit', [('subunit') : GlobalVariable.SubUnit]))

WebUI.click(findTestObject('Employee/Page_Job/Page_dropdown/dropdown_Location'))

WebUI.click(findTestObject('Employee/Page_Job/Page_dropdown/select_Location', [('location') : GlobalVariable.JobLocation]))

WebUI.click(findTestObject('Employee/Page_Job/Page_dropdown/dropdown_EmploymentStatus'))

WebUI.click(findTestObject('Employee/Page_Job/Page_dropdown/select_EmploymentStatus', [('employmentstatus') : GlobalVariable.EmploymentStatus]))

WebUI.click(findTestObject('Employee/Page_Job/button_Save'))

CustomKeywords.'verify.Verify'(findTestObject('Recruit/Page_Recruit/message_Successfully Updated'), GlobalVariable.successmessage, 
    GlobalVariable.textJob)

