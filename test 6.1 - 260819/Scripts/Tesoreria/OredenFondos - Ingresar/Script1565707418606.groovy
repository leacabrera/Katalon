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

WebUI.delay(2)

WebUI.click(findTestObject('Menu/a_Tesoreria'))

WebUI.delay(2)

WebUI.click(findTestObject('Tesoreria/a_Pago Cobro'))

WebUI.waitForPageLoad(10)

WebUI.click(findTestObject('Tesoreria/a_rdenes'))

WebUI.delay(2)

WebUI.click(findTestObject('Tesoreria/Orden Fondos/Orden de fondos-WW/nueva orden'))

WebUI.delay(2)

WebUI.click(findTestObject('Tesoreria/Orden Fondos/Tipos Ordenes de Fondo/Orden de reserva ingreso con conceptos'))

WebUI.delay(2)

WebUI.click(findTestObject('Tesoreria/Orden Fondos/Orden de fondos - Conceptos/CONTINUAR'))

WebUI.delay(2)

WebUI.setText(findTestObject('Tesoreria/Orden Fondos/Reserva Ingreso con Concepto - Transaccion/input_cliente'), Cliente)

WebUI.delay(1)

WebUI.setText(findTestObject('Tesoreria/Orden Fondos/Reserva Ingreso con Concepto - Transaccion/input_Cuenta comercial'), CuentaComercial)

WebUI.delay(2)

WebUI.setText(findTestObject('Tesoreria/Orden Fondos/Reserva Ingreso con Concepto - Transaccion/input_Esquema de distribucin'), EsqDistribucion)

WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('Tesoreria/Orden Fondos/Reserva Ingreso con Concepto - Transaccion/ConceptoIngreso'), '500', 
    false)

WebUI.delay(1)

WebUI.setText(findTestObject('Tesoreria/Orden Fondos/Reserva Ingreso con Concepto - Transaccion/input_Importe'), Importe)

WebUI.delay(1)

WebUI.click(findTestObject('Tesoreria/Orden Fondos/Reserva Ingreso con Concepto - Transaccion/ConfirmarOF'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(3)

WebUI.click(findTestObject('Tesoreria/Orden Fondos/Reserva Ingreso con Concepto - EM/CONFIRMAR(ProcAUT)'))

