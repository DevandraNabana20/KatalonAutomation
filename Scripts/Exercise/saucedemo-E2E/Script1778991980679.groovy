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

WebUI.openBrowser(GlobalVariable.saucedemoUrl)

WebUI.verifyElementPresent(findTestObject('saucedemo/Page_Swag Labs/username_Field'), 0)

WebUI.verifyElementPresent(findTestObject('saucedemo/Page_Swag Labs/password_Field'), 0)

WebUI.verifyElementPresent(findTestObject('saucedemo/Page_Swag Labs/login_Btn'), 0)

WebUI.setText(findTestObject('saucedemo/Page_Swag Labs/username_Field'), GlobalVariable.saucedemoUsername)

WebUI.setText(findTestObject('saucedemo/Page_Swag Labs/password_Field'), GlobalVariable.saucedemoPassword)

WebUI.click(findTestObject('saucedemo/Page_Swag Labs/login_Btn'))

WebUI.verifyTextPresent('Products', false)

WebUI.verifyTextPresent('Sauce Labs Backpack', false)

WebUI.verifyElementPresent(findTestObject('saucedemo/Page_Swag Labs/addtocart_Btn'), 0)

WebUI.click(findTestObject('saucedemo/Page_Swag Labs/addtocart_Btn'))

WebUI.click(findTestObject('saucedemo/Page_Swag Labs/cart_Btn'))

WebUI.verifyElementText(findTestObject('saucedemo/Page_Swag Labs/Your Cart_Text'), 'Your Cart')

WebUI.verifyElementText(findTestObject('saucedemo/Page_Swag Labs/Sauce Labs Backpack_Text'), 'Sauce Labs Backpack')

WebUI.verifyElementPresent(findTestObject('saucedemo/Page_Swag Labs/checkout_Btn'), 0)

WebUI.click(findTestObject('saucedemo/Page_Swag Labs/checkout_Btn'))

WebUI.verifyElementText(findTestObject('saucedemo/Page_Swag Labs/Checkout Your Information_Text'), 'Checkout: Your Information')

WebUI.verifyElementPresent(findTestObject('saucedemo/Page_Swag Labs/input_first-name'), 0)

WebUI.verifyElementPresent(findTestObject('saucedemo/Page_Swag Labs/input_last-name'), 0)

WebUI.verifyElementPresent(findTestObject('saucedemo/Page_Swag Labs/input_postal-code'), 0)

WebUI.verifyElementPresent(findTestObject('saucedemo/Page_Swag Labs/continue_Btn'), 0)

WebUI.setText(findTestObject('saucedemo/Page_Swag Labs/input_first-name'), GlobalVariable.sauceformName)

WebUI.setText(findTestObject('saucedemo/Page_Swag Labs/input_last-name'), GlobalVariable.sauceformLastName)

WebUI.setText(findTestObject('saucedemo/Page_Swag Labs/input_postal-code'), GlobalVariable.sauceformPostalCode)

WebUI.click(findTestObject('saucedemo/Page_Swag Labs/continue_Btn'))

WebUI.verifyElementText(findTestObject('saucedemo/Page_Swag Labs/Checkout Overview_Text'), 'Checkout: Overview')

WebUI.verifyElementText(findTestObject('saucedemo/Page_Swag Labs/Sauce Labs Backpack_Text'), 'Sauce Labs Backpack')

WebUI.verifyElementPresent(findTestObject('saucedemo/Page_Swag Labs/finish_Btn'), 0)

WebUI.click(findTestObject('saucedemo/Page_Swag Labs/finish_Btn'))

WebUI.verifyElementText(findTestObject('saucedemo/Page_Swag Labs/Thank you for your order_Text'), 'Thank you for your order!')

WebUI.closeBrowser()

