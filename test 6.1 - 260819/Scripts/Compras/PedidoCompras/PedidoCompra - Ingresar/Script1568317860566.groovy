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
WebUI.delay(2)

WebUI.click(findTestObject('Menu/a_Compras'))

WebUI.delay(2)

WebUI.click(findTestObject('null'))

WebUI.delay(2)

WebUI.click(findTestObject('Compras/PedidoCompra/PedidoCompra - WW/input_PedidoCompraAgregar'))

WebUI.delay(2)

WebUI.setText(findTestObject('Compras/Page_Tipo Transaccion Compra Select By Usuario/input_FiltroTipoTransaccion'), TipoTRN)

WebUI.delay(2)

WebUI.click(findTestObject('Compras/Page_Tipo Transaccion Compra Select By Usuario/inputa_SelectorTipoTransaccionSelectorPrimerFIla'))

WebUI.click(findTestObject('Compras/Page_Tipo Transaccion Compra Select By Usuario/input_SelectorTipoTransaccionContinuar'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.selectOptionByValue(findTestObject('Compras/PedidoCompra/PedidoCompra - Transaccion/select_PCProcesoCompra'), ProcesoCompra, 
    false)

WebUI.selectOptionByValue(findTestObject('Compras/PedidoCompra/PedidoCompra - Transaccion/select_PCMoneda'), Moneda, false)

WebUI.setText(findTestObject('Compras/PedidoCompra/PedidoCompra - Transaccion/input_PCEsquemaDistribucion'), EsquemaDistribucion)

WebUI.selectOptionByValue(findTestObject('Compras/PedidoCompra/PedidoCompra - Transaccion/select_PCTerminoPago'), TerminoPago, 
    false)

not_run: WebUI.selectOptionByValue(findTestObject('Compras/OrdenCompra/Orden de compra_Transaccion/input_OCCentroAlmacenaje'), 
    '1', true)

WebUI.delay(2)

WebUI.setText(findTestObject('Compras/PedidoCompra/PedidoCompra - Transaccion/input_PCDetProducto'), Producto)

WebUI.delay(1)

WebUI.setText(findTestObject('Compras/PedidoCompra/PedidoCompra - Transaccion/input_PCDetCantidad'), Cantidad)

WebUI.delay(1)

WebUI.setText(findTestObject('Compras/PedidoCompra/PedidoCompra - Transaccion/input_PCDetPrecio'), Precio)

WebUI.delay(1)

WebUI.click(findTestObject('Compras/PedidoCompra/PedidoCompra - Transaccion/input_PCContinuar'))

not_run: WebUI.verifyElementText(findTestObject('Compras/Transaccion de negocio/PedidoCompra/PedidoCompra - EM/check_PCEstado'), 
    'En proceso de ingreso', FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.closeBrowser()

