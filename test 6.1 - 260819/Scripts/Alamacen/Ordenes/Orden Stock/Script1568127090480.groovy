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
import com.kms.katalon.core.logging.KeywordLogger

WebUI.delay(1)

WebUI.click(findTestObject('Menu/a_Almacn'))

WebUI.waitForPageLoad(0)

WebUI.click(findTestObject('Alamacen/a_rdenes'))

WebUI.waitForPageLoad(0)

WebUI.click(findTestObject('Alamacen/Ordenes/a_Todas las rdenes'))

WebUI.waitForPageLoad(0)

WebUI.click(findTestObject('Alamacen/Ordenes/Orden de stock - WW/input_AGREGAR'))

WebUI.waitForPageLoad(0)

WebUI.click(findTestObject('Alamacen/Ordenes/OrdenStock - Select transaccion/span_Orden stock alta interactiva'))

WebUI.waitForPageLoad(0)

WebUI.click(findTestObject('Alamacen/Ordenes/OrdenStock - Select transaccion/input__CONTINUAR'))

WebUI.waitForPageLoad(0)

WebUI.selectOptionByValue(findTestObject('Alamacen/Ordenes/Orden de stock - Transaccion/select_Sector'), Sector, false)

WebUI.waitForPageLoad(1)

WebUI.click(findTestObject('Alamacen/Ordenes/Orden de stock - Transaccion/select_Sala KDC'))

WebUI.setText(findTestObject('Alamacen/Ordenes/Orden de stock - Transaccion/input_Esquema de distribucion'), EsquemaDistribucion, 
    FailureHandling.STOP_ON_FAILURE)

WebUI.waitForPageLoad(0)

WebUI.setText(findTestObject('Alamacen/Ordenes/Orden de stock - Transaccion/input_Producto'), Producto, FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)

WebUI.setText(findTestObject('Alamacen/Ordenes/Orden de stock - Transaccion/input_Deposito'), Deposito, FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)

WebUI.setText(findTestObject('Alamacen/Ordenes/Orden de stock - Transaccion/input_Cantidad'), Cantidad, FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

WebUI.click(findTestObject('Alamacen/Ordenes/Orden de stock - Transaccion/select_Sala KDC'))

WebUI.selectOptionByValue(findTestObject('Alamacen/Ordenes/Orden de stock - Transaccion/select_Sala KDC'), Sala, false)

WebUI.waitForPageLoad(0)

WebUI.click(findTestObject('Alamacen/Ordenes/Orden de stock - Transaccion/input_ENTER'))

NOrden = WebUI.getAttribute(findTestObject('Alamacen/Ordenes/Orden de stock - EM/a_Numero orden'), 'text')

KeywordLogger log = new KeywordLogger()
log.logInfo(NOrden)

