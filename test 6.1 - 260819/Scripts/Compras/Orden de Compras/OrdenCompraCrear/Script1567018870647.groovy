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

/*OBjetivo del caso: ingreso de datos en la transacción de orden de compra
 * Se verifica que la OC quede en proceso de ingreso
 * Archivo de datos en */
WebUI.waitForElementClickable(findTestObject('Menu/a_Compras'), 0)

WebUI.click(findTestObject('Menu/a_Compras'))

WebUI.delay(2)

WebUI.click(findTestObject('Compras/OrdenCompra/Page_Inicio/a_rdenes de compra'))

WebUI.delay(2)

WebUI.click(findTestObject('Compras/OrdenCompra/Orden de compra - WW/input_AGREGAR'))

WebUI.delay(2)

not_run: WebUI.setText(findTestObject('Compras/OrdenCompra/Orden de compra_Transaccion/input_OCFecha'), '28/08/2019')

not_run: WebUI.setText(findTestObject('Compras/OrdenCompra/Orden de compra_Transaccion/input_OCFecha valor'), '28/08/2019')

WebUI.setText(findTestObject('Compras/OrdenCompra/Orden de compra_Transaccion/input_OCProveedor'), Proveedor)

WebUI.selectOptionByValue(findTestObject('Compras/OrdenCompra/Orden de compra_Transaccion/input_OCMoneda'), Moneda, true)

WebUI.setText(findTestObject('Compras/OrdenCompra/Orden de compra_Transaccion/input_OCEsquema de distribucion'), EsquemaDistribucion)

WebUI.setText(findTestObject('Compras/OrdenCompra/Orden de compra_Transaccion/input_OCTerminoComercial'), TermComercial)

WebUI.setText(findTestObject('Compras/OrdenCompra/Orden de compra_Transaccion/input_OCTerminoFiscal'), TermFiscal)

WebUI.selectOptionByValue(findTestObject('Compras/OrdenCompra/Orden de compra_Transaccion/input_OCCentroAlmacenaje'), CA, 
    true)

WebUI.delay(1)

WebUI.setText(findTestObject('Compras/OrdenCompra/Orden de compra_Transaccion/input_OCDetProducto'), Producto)

WebUI.delay(1)

WebUI.setText(findTestObject('Compras/OrdenCompra/Orden de compra_Transaccion/input_OCDetCantidad'), Cantidad)

WebUI.delay(1)

WebUI.setText(findTestObject('Compras/OrdenCompra/Orden de compra_Transaccion/input_OCDetPrecio'), Precio)

WebUI.delay(1)

WebUI.click(findTestObject('Compras/OrdenCompra/Orden de compra_Transaccion/input_Continuar'))

not_run: WebUI.closeBrowser()

