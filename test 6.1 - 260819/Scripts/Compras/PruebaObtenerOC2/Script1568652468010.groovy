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

String returnString = WebUI.callTestCase(findTestCase('Compras/PruebaObtenerOC'), [('variable') : ''], FailureHandling.STOP_ON_FAILURE)

println(returnString)

WebUI.navigateToUrl('http://test3.k2b.local:8080/k2bv61-sqlserver/servlet/com.k2b.hwwordencompra?,NINGUNO')

WebUI.setText(findTestObject('Compras/Page_rdenes de compra/input_K2 BTools Generic Search Field_vK2BTOOLSGENERICSEARCHFIELD'), 
    returnString)

