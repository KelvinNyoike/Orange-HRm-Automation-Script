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
selenium.click("//a[@id='menu_leave_viewLeaveModule']/b")
selenium.click("id=menu_leave_Entitlements")
selenium.click("id=menu_leave_addLeaveEntitlement")
selenium.click("id=entitlements_filters_bulk_assign")
selenium.click("id=entitlements_filters_location")
selenium.select("id=entitlements_filters_location", "label=regexp:\\s+Canadian Regional HQ")
selenium.click("id=entitlements_filters_location")
selenium.click("id=entitlements_filters_subunit")
selenium.select("id=entitlements_filters_subunit", "label=Engineering")
selenium.click("id=entitlements_filters_subunit")
selenium.click("id=entitlements_leave_type")
selenium.select("id=entitlements_leave_type", "label=US - Vacation")
selenium.click("id=entitlements_leave_type")
selenium.click("id=period")
selenium.click("id=period")
selenium.click("id=entitlements_entitlement")
selenium.type("id=entitlements_entitlement", "12")
selenium.click("id=entitlements_entitlement")
selenium.click("id=btnSave")
selenium.click("//*[@id=\"dialogConfirmBtn\"]")
selenium.click("id=menu_leave_assignLeave")
selenium.click("id=assignleave_txtEmployee_empName")
selenium.type("id=assignleave_txtEmployee_empName", "Lisa Andrews")
selenium.click("id=assignleave_txtLeaveType")
selenium.select("id=assignleave_txtLeaveType", "label=US - Vacation")
selenium.click("id=assignleave_txtLeaveType")
selenium.click("//form[@id='frmLeaveApply']/fieldset/ol/li[4]/img")
selenium.click("link=8")
selenium.click("//form[@id='frmLeaveApply']/fieldset/ol/li[5]/img")
selenium.click("link=12")
selenium.click("id=assignleave_txtComment")
selenium.type("id=assignleave_txtComment", "Enjoy your vacation Lisa")
selenium.click("id=assignBtn")
selenium.click("//a[@id='menu_leave_viewLeaveModule']/b")
selenium.click("id=menu_leave_viewLeaveList")
selenium.click("id=leaveList_chkSearchFilter_checkboxgroup_allcheck")
selenium.click("id=leaveList_txtEmployee_empName")
selenium.type("id=leaveList_txtEmployee_empName", "Lisa Andrews")
selenium.click("//form[@id='frmFilterLeave']/fieldset")
selenium.click("id=btnSearch")
selenium.click("id=btnReset")

