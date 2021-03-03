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
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS

import com.thoughtworks.selenium.Selenium
import org.openqa.selenium.firefox.FirefoxDriver
import org.openqa.selenium.WebDriver
import com.thoughtworks.selenium.webdriven.WebDriverBackedSelenium
import static org.junit.Assert.*
import java.util.regex.Pattern
import static org.apache.commons.lang3.StringUtils.join

WebUI.openBrowser('https://www.google.com/')
def driver = DriverFactory.getWebDriver()
String baseUrl = "https://www.google.com/"
selenium = new WebDriverBackedSelenium(driver, baseUrl)
selenium.open("https://opensource-demo.orangehrmlive.com/index.php/dashboard")
selenium.click("//a[@id='menu_pim_viewPimModule']/b")
selenium.click("id=menu_pim_viewEmployeeList")
selenium.click("link=0002")
selenium.click("//a[@id='menu_pim_viewPimModule']/b")
selenium.click("id=menu_pim_viewEmployeeList")
selenium.click("id=btnAdd")
selenium.click("id=firstName")
selenium.type("id=firstName", "Kelvin")
selenium.type("id=lastName", "Nyoiks")
selenium.click("id=employeeId")
selenium.type("id=employeeId", "1234")
selenium.click("id=btnSave")
selenium.click("id=personal_txtLicenNo")
selenium.click("id=personal_txtLicenNo")
selenium.click("id=btnSave")
selenium.click("//*[@id=\"personal_txtLicenNo\"]")
selenium.type("//*[@id=\"personal_txtLicenNo\"]", "123456")
//selenium.click("id=personal_txtNICNo")
//selenium.type("id=personal_txtNICNo", "1234")
selenium.click("id=personal_txtEmpMiddleName")
selenium.type("id=personal_txtEmpMiddleName", "Full")
selenium.click("//form[@id='frmEmpPersonalDetails']/fieldset/ol[2]/li[4]/img")
selenium.click("link=2")
selenium.click("id=personal_cmbMarital")
selenium.select("id=personal_cmbMarital", "label=Single")
selenium.click("id=personal_cmbMarital")
selenium.click("//form[@id='frmEmpPersonalDetails']/fieldset/ol[3]/li[4]/img")
selenium.click("link=10")
selenium.click("//*[@id=\"personal_txtEmpNickName\"]")
selenium.type("//*[@id=\"personal_txtEmpNickName\"]", "Vinnie")
selenium.click("id=personal_txtMilitarySer")
selenium.type("id=personal_txtMilitarySer", "Yes")
selenium.click("id=personal_chkSmokeFlag")
selenium.click("id=btnSave")

