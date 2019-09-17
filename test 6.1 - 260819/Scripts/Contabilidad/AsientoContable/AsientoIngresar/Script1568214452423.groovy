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
import org.openqa.selenium.Keys as Keys

/*Por el momento este caso ingresa un asiento de dos lineas, las cuentas asociadas no analizan por CC
 * la primer linea es debito y la segunda es crédito
 * Existe mas de un tipo de asiento que se puede seleccionar */
WebUI.openBrowser('')

WebUI.delay(5)

WebUI.navigateToUrl('http://test3.k2b.local:8080/k2bv62-sqlserver/servlet/com.k2b.hk2blogin')

WebUI.delay(2)

WebUI.setText(findTestObject('LoginManual/USERNAME'), 'jperez')

WebUI.setText(findTestObject('LoginManual/PASSWORD'), 'jperez')

WebUI.click(findTestObject('LoginManual/LOGIN'))

WebUI.delay(2)

WebUI.navigateToUrl('http://test3.k2b.local:8080/k2bv62-sqlserver/servlet/com.k2b.hwwasiento')

WebUI.delay(2)

WebUI.click(findTestObject('Contabilidad/Asientocontable/AsientoWW/input_AGREGAR'))

WebUI.waitForElementPresent(findTestObject('Contabilidad/Asientocontable/AsientoSelectorTipoTransaccion/input_FiltroTipoTransaccionContable'), 
    10)

WebUI.setText(findTestObject('Contabilidad/Asientocontable/AsientoSelectorTipoTransaccion/input_FiltroTipoTransaccionContable'), 
    'Predeterminado')

WebUI.click(findTestObject('Contabilidad/Asientocontable/AsientoSelectorTipoTransaccion/p_SelectorTipoTransaccionContableSelectorPrimerFila'))

WebUI.delay(2)

WebUI.click(findTestObject('Contabilidad/Asientocontable/AsientoSelectorTipoTransaccion/input_SelectorTipoTransaccionContable_CONTINUAR'))

WebUI.delay(2)

WebUI.setText(findTestObject('Contabilidad/Asientocontable/AsientoTransaccion/input_AsientoDet_CuentaContable_0001'), 
    '1.1.1.1.01 - CAJA MONEDA NACIONAL')

WebUI.delay(1)

WebUI.setText(findTestObject('Contabilidad/Asientocontable/AsientoTransaccion/input_AsientoDet_CuentaAuxiliar_0001'), 
    '12345 - RUBEN ALVAREZ')

WebUI.delay(2)

WebUI.setText(findTestObject('Contabilidad/Asientocontable/AsientoTransaccion/input_AsientoDet_Proyecto_0001'), 
    '1')

WebUI.selectOptionByValue(findTestObject('Contabilidad/Asientocontable/AsientoTransaccion/select_AsientoDet_Moneda_001'), 
    '840', false)

WebUI.delay(2)

WebUI.setText(findTestObject('Contabilidad/Asientocontable/AsientoTransaccion/input_AsientoDet_Importe_0001'), 
    '100')

WebUI.delay(2)

WebUI.setText(findTestObject('Contabilidad/Asientocontable/AsientoTransaccion/input_AsientoDet_CuentaContable_0002'), 
    '1.1.1.1.01 - CAJA MONEDA NACIONAL')

WebUI.delay(2)

WebUI.setText(findTestObject('Contabilidad/Asientocontable/AsientoTransaccion/input_AsientoDet_CuentaAuxiliar_0002'), 
    '12345 - RUBEN ALVAREZ')

WebUI.delay(2)

WebUI.setText(findTestObject('Contabilidad/Asientocontable/AsientoTransaccion/input_AsientoDet_Proyecto_0002'), 
    '1')

WebUI.delay(2)

WebUI.selectOptionByIndex(findTestObject('Contabilidad/Asientocontable/AsientoTransaccion/select_AsientoDet_DebitoCredito_002'), 
    1)

WebUI.delay(2)

WebUI.selectOptionByValue(findTestObject('Contabilidad/Asientocontable/AsientoTransaccion/select_AsientoDet_Moneda_002'), 
    '840', false)

WebUI.setText(findTestObject('Contabilidad/Asientocontable/AsientoTransaccion/input_AsientoDet_Importe_0002'), 
    '100')

