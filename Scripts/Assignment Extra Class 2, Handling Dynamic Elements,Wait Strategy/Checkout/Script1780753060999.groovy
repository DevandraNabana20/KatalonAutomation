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

WebUI.openBrowser('https://www.saucedemo.com/')

WebUI.verifyElementPresent(findTestObject('Assignment Extra Class 2/UsernameField'), 0)

WebUI.verifyElementPresent(findTestObject('Assignment Extra Class 2/PasswordField'), 0)

WebUI.setText(findTestObject('Assignment Extra Class 2/UsernameField'), 'standard_user')

WebUI.setText(findTestObject('Assignment Extra Class 2/PasswordField'), 'secret_sauce')

WebUI.click(findTestObject('Assignment Extra Class 2/LoginBtn'))

WebUI.verifyElementPresent(findTestObject('Assignment Extra Class 2/ProductsText'), 0)

WebUI.verifyElementPresent(findTestObject('Assignment Extra Class 2/ShirtProduct'), 0)

WebUI.verifyElementPresent(findTestObject('Assignment Extra Class 2/CartBtn'), 0)

WebUI.verifyElementPresent(findTestObject('Assignment Extra Class 2/ShirtAddToCartBtn'), 0)

WebUI.click(findTestObject('Assignment Extra Class 2/ShirtAddToCartBtn'))

WebUI.verifyElementPresent(findTestObject('Assignment Extra Class 2/ShirtRemoveBtn'), 0)

WebUI.click(findTestObject('Assignment Extra Class 2/CartBtn'))

WebUI.verifyElementPresent(findTestObject('Assignment Extra Class 2/YourCartText'), 0)

WebUI.verifyElementPresent(findTestObject('Assignment Extra Class 2/ShirtProduct'), 0)

WebUI.verifyElementPresent(findTestObject('Assignment Extra Class 2/ShirtRemoveBtn'), 0)

WebUI.verifyElementPresent(findTestObject('Assignment Extra Class 2/CheckoutBtn'), 0)

WebUI.click(findTestObject('Assignment Extra Class 2/CheckoutBtn'))

WebUI.verifyElementPresent(findTestObject('Assignment Extra Class 2/CheckoutText'), 0)

WebUI.verifyElementPresent(findTestObject('Assignment Extra Class 2/FirstNameField'), 0)

WebUI.verifyElementPresent(findTestObject('Assignment Extra Class 2/LastNameField'), 0)

WebUI.verifyElementPresent(findTestObject('Assignment Extra Class 2/ZipPostalCodeField'), 0)

WebUI.setText(findTestObject('Assignment Extra Class 2/FirstNameField'), 'Devan')

WebUI.setText(findTestObject('Assignment Extra Class 2/LastNameField'), 'Nabana')

WebUI.setText(findTestObject('Assignment Extra Class 2/ZipPostalCodeField'), '11222')

WebUI.click(findTestObject('Assignment Extra Class 2/ContinueBtn'))

WebUI.verifyElementPresent(findTestObject('Assignment Extra Class 2/CheckoutOverviewText'), 0)

WebUI.verifyElementPresent(findTestObject('Assignment Extra Class 2/ShirtProduct'), 0)

WebUI.verifyElementPresent(findTestObject('Assignment Extra Class 2/FinishBtn'), 0)

WebUI.click(findTestObject('Assignment Extra Class 2/FinishBtn'))

WebUI.verifyElementPresent(findTestObject('Assignment Extra Class 2/CheckoutCompleteText'), 0)

WebUI.verifyTextPresent('Thank you for your order!', false)

WebUI.closeBrowser()

