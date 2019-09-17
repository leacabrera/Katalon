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

WebUI.callTestCase(findTestCase('Alamacen/Ordenes/Orden Stock'), [('Sector') : Sector, ('Sala') : Sala, ('EsquemaDistribucion') : EsquemaDistribucion
<<<<<<< HEAD
        , ('Producto') : Producto, ('Deposito') : Deposito, ('Cantidad') : Cantidad, ('NOrden') : NOrden], FailureHandling.STOP_ON_FAILURE)
=======
        , ('Producto') : Producto, ('Deposito') : Deposito, ('Cantidad') : Cantidad, ('NOrden') : ''], FailureHandling.STOP_ON_FAILURE)
>>>>>>> Maria

WebUI.delay(2)

WebUI.click(findTestObject('Menu/clockMENU'))

WebUI.delay(1)

WebUI.click(findTestObject('Menu/a_Almacn'))

WebUI.delay(1)

WebUI.click(findTestObject('Alamacen/a_Movimientos'))

WebUI.waitForPageLoad(0)

WebUI.click(findTestObject('Alamacen/Movimientos/a_Entradas'))

WebUI.waitForPageLoad(0)

WebUI.click(findTestObject('Alamacen/Movimientos/Movimientos Stock - WW/input_Agregar'))

WebUI.waitForPageLoad(0)

WebUI.click(findTestObject('Alamacen/Movimientos/Movimiento Stock - Tipo TRN/span_Movimiento stock alta'))

WebUI.click(findTestObject('Alamacen/Movimientos/Movimiento Stock - Tipo TRN/input__CONTINUAR'))

WebUI.waitForPageLoad(0)

<<<<<<< HEAD
WebUI.setText(findTestObject('Alamacen/Movimientos/Movimiento Stock - Select OC/input_Buscar'), NOrden)

KeywordLogger log = new KeywordLogger()

log.logInfo(NOrden)
=======
String returnString = WebUI.callTestCase(findTestCase('Alamacen/Ordenes/Orden Stock'), [('NOrden') : ''], FailureHandling.CONTINUE_ON_FAILURE)

println(returnString)

WebUI.setText(findTestObject('Alamacen/Movimientos/Movimiento Stock - Select OC/input_Buscar'), returnString)

KeywordLogger log = new KeywordLogger()

log.logInfo(returnString)
>>>>>>> Maria

not_run: WebUI.click(findTestObject('Alamacen/Movimientos/Movimiento Stock - Select OC/img_K2 BTools Generic Search Field_FILTERTOGGLE_COMBINED (1)'))

not_run: WebUI.waitForPageLoad(0)

not_run: WebUI.setText(findTestObject('Alamacen/Movimientos/Movimiento Stock - Select OC/input_Filtro Producto'), 'Hojas')

not_run: WebUI.waitForPageLoad(0)

not_run: WebUI.click(findTestObject('Alamacen/Movimientos/Movimiento Stock - Select OC/img_K2 BTools Generic Search Field_FILTERTOGGLE_COMBINED (1)'))

not_run: WebUI.delay(1)

not_run: WebUI.click(findTestObject('Alamacen/Movimientos/Movimiento Stock - Select OC/span_Fecha valor(Ordenar)'))

not_run: WebUI.delay(1)

not_run: WebUI.click(findTestObject('Alamacen/Movimientos/Movimiento Stock - Select OC/span_Fecha valor(Ordenar)'))

WebUI.waitForPageLoad(0)

WebUI.click(findTestObject('Alamacen/Movimientos/Movimiento Stock - Select OC/span_Cdigo concatenacin de Id y DetId_icon cb-icon-check'))

