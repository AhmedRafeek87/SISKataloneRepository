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

WebUI.doubleClick(findTestObject('Object Repository/Home Room/Page_Emirates Schools Establishment/span_6021 Al-Rashedia Boys School - Cycle 3'))

WebUI.click(findTestObject('Object Repository/Home Room/Page_Emirates Schools Establishment/span_Classrooms'))

WebUI.click(findTestObject('Object Repository/Home Room/Page_Emirates Schools Establishment/span_09Advanced1'))

WebUI.click(findTestObject('Object Repository/Home Room/Page_Emirates Schools Establishment/span_Classroom Details'))

WebUI.click(findTestObject('Object Repository/Home Room/Page_Emirates Schools Establishment/button_Courses'))

WebUI.click(findTestObject('Object Repository/Home Room/Page_Emirates Schools Establishment/button_Information'))

WebUI.click(findTestObject('Object Repository/Home Room/Page_Emirates Schools Establishment/button_Save'))

WebUI.click(findTestObject('Object Repository/Home Room/Page_Emirates Schools Establishment/button_Courses'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Home Room/Page_Emirates Schools Establishment/select_AMER AHMAD (275824)ELSAYED ALI FARAG_7231c0'), 
    'AMER AHMAD (275824)', true)

WebUI.click(findTestObject('Object Repository/Home Room/Page_Emirates Schools Establishment/button_Save'))

WebUI.click(findTestObject('Object Repository/Home Room/Page_Emirates Schools Establishment/button_Members'))

not_run: WebUI.openBrowser('')

not_run: WebUI.navigateToUrl('https://sis-test.itworxedu.net/SIS-TEST04/ZLMSWeb.html?login=1&locale=default')

WebUI.doubleClick(findTestObject('Object Repository/Test Page/Page_Emirates Schools Establishment/span_6021 Al-Rashedia Boys School - Cycle 3'))

WebUI.click(findTestObject('Object Repository/Test Page/Page_Emirates Schools Establishment/span_Classrooms'))

WebUI.click(findTestObject('Object Repository/Test Page/Page_Emirates Schools Establishment/span_09Advanced1'))

WebUI.click(findTestObject('Object Repository/Test Page/Page_Emirates Schools Establishment/span_Classroom Details'))

WebUI.click(findTestObject('Object Repository/Test Page/Page_Emirates Schools Establishment/button_Courses'))

WebUI.click(findTestObject('Object Repository/Test Page/Page_Emirates Schools Establishment/button_Information'))

WebUI.click(findTestObject('Object Repository/Test Page/Page_Emirates Schools Establishment/button_Save'))

WebUI.click(findTestObject('Object Repository/Test Page/Page_Emirates Schools Establishment/button_Courses'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Test Page/Page_Emirates Schools Establishment/select_AMER AHMAD (275824)ELSAYED ALI FARAG_7231c0'), 
    'AMER AHMAD (275824)', true)

WebUI.click(findTestObject('Object Repository/Test Page/Page_Emirates Schools Establishment/button_Save'))

WebUI.click(findTestObject('Object Repository/Test Page/Page_Emirates Schools Establishment/button_Members'))

WebUI.openBrowser('')

WebUI.navigateToUrl('https://sis-test.itworxedu.net/SIS-TEST04/ZLMSWeb.html?login=1&locale=default')

WebUI.click(findTestObject('Object Repository/Test Page/Page_Emirates Schools Establishment/img_house_z-DisclosureIcon-Image'))

WebUI.setText(findTestObject('Object Repository/Test Page/Page_Emirates Schools Establishment/input_Student_z-TextBox z-TextBoxWithIcon'), 
    '202422')

WebUI.click(findTestObject('Object Repository/Test Page/Page_Emirates Schools Establishment/button_Search'))

WebUI.click(findTestObject('Object Repository/Test Page/Page_Emirates Schools Establishment/div_Filters'))

WebUI.doubleClick(findTestObject('Object Repository/Test Page/Page_Emirates Schools Establishment/input_Student_z-TextBox z-TextBoxWithIcon'))

