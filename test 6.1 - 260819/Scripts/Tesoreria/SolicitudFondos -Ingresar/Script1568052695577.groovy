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

WebUI.delay(1)

WebUI.click(findTestObject('Menu/a_Tesoreria'))

WebUI.waitForPageLoad(1)

WebUI.click(findTestObject('Tesoreria/a_Pago Cobro'))

WebUI.waitForPageLoad(1)

WebUI.click(findTestObject('Tesoreria/a_rdenes'))

WebUI.waitForPageLoad(1)

WebUI.click(findTestObject('Tesoreria/Orden Fondos/Orden de fondos-WW/nueva orden'))

WebUI.waitForPageLoad(1)

WebUI.click(findTestObject('Tesoreria/Orden Fondos/Tipos Ordenes de Fondo/span_Solicitud de fondo a rendir'))

WebUI.click(findTestObject('Tesoreria/Orden Fondos/input_CONTINUAR'))

WebUI.waitForPageLoad(1)

WebUI.selectOptionByValue(findTestObject('Tesoreria/Orden Fondos/Solicitud de Fondos - Transaccion/select_Moneda'), Moneda, 
    false)

WebUI.setText(findTestObject('Tesoreria/Orden Fondos/Solicitud de Fondos - Transaccion/input_Importe'), Importe)

WebUI.setText(findTestObject('Tesoreria/Orden Fondos/Solicitud de Fondos - Transaccion/input_Persona'), Persona)

WebUI.setText(findTestObject('Tesoreria/Orden Fondos/Solicitud de Fondos - Transaccion/input_Cuenta financiera destino'), 
    CuentaComercial)

WebUI.delay(1)

WebUI.click(findTestObject('Tesoreria/Orden Fondos/Solicitud de Fondos - Transaccion/input_ENTER'))

WebUI.waitForPageLoad(1)

WebUI.verifyElementPresent(findTestObject('Tesoreria/Orden Fondos/Solicitud de Fondos - EM/span_En ingreso'), 0)

