import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import org.openqa.selenium.Keys as Keys


public class verify {
	/**
	 * @author Santhosh Kumar
	 * @description It will verify both the elements text is equal
	 * @param name will pass an TestObject needed for comparison
	 * @param verifytext will compare its defined text with current current 
	 */
	@Keyword
	def check(TestObject name, String verifytext) {
		try {

			WebUI.verifyElementText(name, verifytext)
			KeywordUtil.markPassed("****Verified Element Text****")
				
		} catch (Exception e) {

			KeywordUtil.markFailed("****Failed to verify the Element Text****")
		}
	}
	/**
	 * @author Santhosh Kumar
	 * @description It will verify both the elements text is equal
	 * @param Name will pass an TestObject needed for comparison
	 * @param Verifytext will compare its defined text with current current
	 */
	@Keyword
	def Verify(TestObject Name, String Verifytext) {
		check(Name,Verifytext)
	}
}
