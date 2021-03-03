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
selenium.click("//a[@id='menu_recruitment_viewRecruitmentModule']/b")
selenium.click("id=menu_recruitment_viewJobVacancy")
selenium.click("link=Senior QA Lead")
selenium.click("id=btnBack")
selenium.click("id=btnAdd")
selenium.click("id=addJobVacancy_jobTitle")
selenium.select("id=addJobVacancy_jobTitle", "label=QA Engineer")
selenium.click("id=addJobVacancy_jobTitle")
selenium.click("id=addJobVacancy_name")
selenium.type("id=addJobVacancy_name", "Automation QA Engineer")
selenium.click("id=addJobVacancy_noOfPositions")
selenium.type("id=addJobVacancy_noOfPositions", "2")
selenium.click("id=addJobVacancy_description")
selenium.type("id=addJobVacancy_description", "We need an automation QA engineer with atleAST 2 YEARS EXPERIENCE IN AUTOMATING WEB APPS AND MOBILE")
selenium.click("id=addJobVacancy_hiringManager")
selenium.type("id=addJobVacancy_hiringManager", "Odis Adalwin")
selenium.click("id=btnSave")
selenium.click("id=btnBack")
selenium.click("id=vacancySearch_jobTitle")
selenium.select("id=vacancySearch_jobTitle", "label=QA Engineer")
selenium.click("id=vacancySearch_jobTitle")
selenium.click("id=vacancySearch_jobVacancy")
selenium.select("id=vacancySearch_jobVacancy", "label=Automation QA Engineer")
selenium.click("id=vacancySearch_jobVacancy")
selenium.click("id=btnSrch")
selenium.click("id=ohrmList_chkSelectAll")
selenium.click("id=btnDelete")
selenium.click("id=dialogDeleteBtn")
selenium.click("id=btnAdd")
selenium.click("id=addJobVacancy_jobTitle")
selenium.select("id=addJobVacancy_jobTitle", "label=QA Engineer")
selenium.click("id=addJobVacancy_jobTitle")
selenium.click("id=addJobVacancy_name")
selenium.type("id=addJobVacancy_name", "Automation QA Engineer")
selenium.click("id=addJobVacancy_hiringManager")
selenium.type("id=addJobVacancy_hiringManager", "Odis Adalwin")
selenium.click("//div[4]/ul/li[4]")
selenium.click("id=addJobVacancy_noOfPositions")
selenium.type("id=addJobVacancy_noOfPositions", "5")
selenium.click("id=addJobVacancy_description")
selenium.type("id=addJobVacancy_description", "Automation engineer with at least 2 years experience in building automation scripts for an e-commerce website.")
selenium.click("id=btnSave")
selenium.click("id=btnBack")

