import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.logging.KeywordLogger as KeywordLogger

WebUI.openBrowser('')

WebUI.delay(5)

WebUI.navigateToUrl('http://test3.k2b.local:8080/k2bv61-sqlserver/servlet/com.k2b.hk2blogin')

WebUI.delay(2)

WebUI.setText(findTestObject('LoginManual/USERNAME'), 'jperez')

WebUI.setText(findTestObject('LoginManual/PASSWORD'), 'jperez')

WebUI.click(findTestObject('LoginManual/LOGIN'))

WebUI.delay(2)

WebUI.navigateToUrl('http://test3.k2b.local:8080/k2bv61-sqlserver/servlet/com.k2b.hviewordencompra?DSP,6795,')

WebUI.delay(2)

KeywordLogger log = new KeywordLogger()

log.logInfo('yourMsg')

variable = WebUI.getAttribute(findTestObject('Compras/Page_Orden de compra A00000465/a_A00000465'), 'text')

log.logInfo('La variable es')

log.logInfo(variable)

return variable

