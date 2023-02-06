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

WebUI.openBrowser('https://taskdev.mile.app/login')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('MileApp/Page_Mile.app  Login/input_Organization Name_organization'), 'testonboard')

WebUI.click(findTestObject('MileApp/Page_Mile.app  Login/img'))

WebUI.setText(findTestObject('MileApp/Page_Mile.app  Login/input_Email or Username_email or username'), 'testdata')

WebUI.setText(findTestObject('MileApp/Page_Mile.app  Login/input_Password_password'), 'testpassword')

WebUI.click(findTestObject('MileApp/Page_Mile.app  Login/button_Login'))

WebUI.verifyElementVisible(findTestObject('MileApp/Page_Mile.app  Login/Login failed, please check your email or password'))

WebUI.closeBrowser()

