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

WebUI.callTestCase(findTestCase('Compras/PedidoCompras/PedidoCompra - Ingresar'), [('TipoTRN') : TipoTrn, ('ProcesoCompra') : ProcesoCompra
        , ('Moneda') : Moneda, ('EsquemaDistribucion') : EsquemaDistribucion, ('TerminoPago') : TerminoPago, ('Producto') : Producto
        , ('Cantidad') : Cantidad, ('Precio') : Precio], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.selectOptionByValue(findTestObject('Compras/Proceso de compra agil/select_ProcesoCompraAgil_TipoTrnAdjudicacion'), 
    TipoTrnAdjudicacion, false)

WebUI.setText(findTestObject('Compras/Proceso de compra agil/input_CompraAgil_Proveedor_001'), 
    Proveedor)

WebUI.click(findTestObject('Compras/Proceso de compra agil/input_CompraAgil_CONTINUAR'))

WebUI.click(findTestObject('Compras/Proceso de compra agil/input_CompraAgil_CONFIRMAR'))

WebUI.callTestCase(findTestCase('Compras/Adjudicacion de compra/Adjudicacion - Generar Eventos'), [('TipoTransaccionOCAdj') : TipoTrnOCAdj], 
    FailureHandling.STOP_ON_FAILURE)

