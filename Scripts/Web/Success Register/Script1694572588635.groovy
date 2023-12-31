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
import com.github.javafaker.Faker as Faker

def faker = new Faker()

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.baseUrl)

WebUI.click(findTestObject('Object Repository/Web/Register/a_ingin mencoba, daftar'))

nama_toko = faker.company().name()

WebUI.setText(findTestObject('Object Repository/Web/Register/input_nama toko_name'), nama_toko)

WebUI.setText(findTestObject('Object Repository/Web/Register/input_email_email'), faker.internet().emailAddress())

WebUI.setEncryptedText(findTestObject('Object Repository/Web/Register/input_password_password'), 'SOFEPrXv8/UJM0rtCZFNLQ==')

WebUI.click(findTestObject('Object Repository/Web/Register/button_daftar'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Web/Register/div_Toko berhasil didaftarkananda dapat men_b3a8bd'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Web/Register/div_Toko berhasil didaftarkan'), 0)

WebUI.verifyElementVisible(findTestObject('Object Repository/Web/Register/div_anda dapat menggunakan login sekarang'))

