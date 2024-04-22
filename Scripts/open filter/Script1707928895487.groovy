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

not_run: WebUI.openBrowser('')

not_run: WebUI.navigateToUrl('https://sis-test.itworxedu.net/SIS-TEST04/ZLMSWeb.html?login=1&locale=default')

WebUI.click(findTestObject('Object Repository/School details/Page_Emirates Schools Establishment/img_info_z-DisclosureIcon-Image'))

WebUI.selectOptionByValue(findTestObject('Object Repository/School details/Page_Emirates Schools Establishment/select_MinistryEducation EmirateSchool Oper_fc72fc'), 
    'School', true)

WebUI.setText(findTestObject('Object Repository/School details/Page_Emirates Schools Establishment/input_Code_z-TextBox z-TextBoxWithIcon'), 
    '6021')

WebUI.click(findTestObject('Object Repository/School details/Page_Emirates Schools Establishment/button_Search'))

not_run: WebUI.doubleClick(findTestObject('Object Repository/School details/Page_Emirates Schools Establishment/span_6021 Al-Rashedia Boys School - Cycle 3'))

not_run: WebUI.click(findTestObject('Object Repository/School details/Page_Emirates Schools Establishment/span_School Details'))

not_run: WebUI.waitForAlert(5000)

