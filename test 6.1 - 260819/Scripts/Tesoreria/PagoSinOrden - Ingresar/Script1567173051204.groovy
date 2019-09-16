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

WebUI.delay(1)

WebUI.click(findTestObject('Tesoreria/a_Pago Cobro'))

WebUI.delay(1)

WebUI.click(findTestObject('Tesoreria/a_Movimientos'))

WebUI.delay(1)

WebUI.click(findTestObject('Tesoreria/Movimientos/Movimientos - WW/input_NUEVO'))

WebUI.delay(1)

WebUI.click(findTestObject('Tesoreria/Movimientos/PagoSinOrden/PagoSinOrden - SelectTRN/span_Pago sin orden'))

WebUI.delay(1)

WebUI.click(findTestObject('Tesoreria/Movimientos/PagoSinOrden/PagoSinOrden - SelectTRN/input_No hay resultados_CONTINUAR'))

WebUI.delay(1)

WebUI.setText(findTestObject('Tesoreria/Movimientos/PagoSinOrden/PagoSinOrden - Transaccion/input_Persona'), 
    Proveedor)

WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('Tesoreria/Movimientos/PagoSinOrden/PagoSinOrden - Transaccion/select_Moneda'), 
    Moneda, false)

WebUI.delay(1)

WebUI.setText(findTestObject('Tesoreria/Movimientos/PagoSinOrden/PagoSinOrden - Transaccion/input_Esquema de distribucion'), 
    EsquemaDistribucion)

WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('Tesoreria/Movimientos/PagoSinOrden/PagoSinOrden - Transaccion/select_ConceptoEI'), 
    Concepto, false)

WebUI.delay(1)

WebUI.setText(findTestObject('Tesoreria/Movimientos/PagoSinOrden/PagoSinOrden - Transaccion/input_Importe'), 
    Importe)

WebUI.delay(1)

WebUI.click(findTestObject('Tesoreria/Movimientos/PagoSinOrden/PagoSinOrden - Transaccion/input_ENTER'), FailureHandling.STOP_ON_FAILURE)

