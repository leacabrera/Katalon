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

<<<<<<< HEAD
WebUI.delay(2)
=======
WebUI.delay(1)
>>>>>>> origin/Maria

WebUI.click(findTestObject('Cuentas a Pagar/Documentos Compra/Documentos comerciales - WW/input_INSERT'))

WebUI.delay(1)

WebUI.click(findTestObject('Cuentas a Pagar/Documentos Compra/Factura Servicio/FacturaServicios - SelectTRN/span_Factura compra de servicios'))

WebUI.delay(1)

WebUI.click(findTestObject('Cuentas a Pagar/Documentos Compra/Factura Servicio/FacturaServicios - SelectTRN/CONTINUAR'))

WebUI.delay(1)

WebUI.setText(findTestObject('Cuentas a Pagar/Documentos Compra/Factura Servicio/FacturaServicio - Transaccion/input_DOCCOMSERIE'), 
    Serie)

WebUI.delay(1)

WebUI.setText(findTestObject('Cuentas a Pagar/Documentos Compra/Factura Servicio/FacturaServicio - Transaccion/input_DOCCOMSUCURSAL'), 
    Sucursal)

WebUI.delay(1)

WebUI.setText(findTestObject('Cuentas a Pagar/Documentos Compra/Factura Servicio/FacturaServicio - Transaccion/input_DOCCOMNUMERO'), 
    Numero)

WebUI.delay(1)

WebUI.setText(findTestObject('Cuentas a Pagar/Documentos Compra/Factura Servicio/FacturaServicio - Transaccion/input_DOCCOMPERSONARESPPAGOID'), 
    Proveedor)

WebUI.click(findTestObject('Cuentas a Pagar/Documentos Compra/Factura Servicio/FacturaServicio - Transaccion/select_Moneda'))

WebUI.selectOptionByValue(findTestObject('Cuentas a Pagar/Documentos Compra/Factura Servicio/FacturaServicio - Transaccion/select_Moneda'), 
    Moneda, false)

WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('Cuentas a Pagar/Documentos Compra/Factura Servicio/FacturaServicio - Transaccion/select_Cuenta comercial'), 
    CuentaComercial, false)

WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('Cuentas a Pagar/Documentos Compra/Factura Servicio/FacturaServicio - Transaccion/select_FORMAPAGOEDITADAJR'), 
    FormaPago, false)

WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('Cuentas a Pagar/Documentos Compra/Factura Servicio/FacturaServicio - Transaccion/select_cuenta bancaria'), 
    CuentaBancaria, false)

WebUI.delay(1)

WebUI.setText(findTestObject('Cuentas a Pagar/Documentos Compra/Factura Servicio/FacturaServicio - Transaccion/input_Esquema de distribucin'), 
    EsquemaDistribucion)

WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('Cuentas a Pagar/Documentos Compra/Factura Servicio/FacturaServicio - Transaccion/select_Centro operativo'), 
    CentroAdmPagos, false)

WebUI.delay(1)

WebUI.setText(findTestObject('Cuentas a Pagar/Documentos Compra/Factura Servicio/FacturaServicio - Transaccion/input_DETPRODUCTOID'), 
    Producto)

WebUI.delay(1)

WebUI.setText(findTestObject('Cuentas a Pagar/Documentos Compra/Factura Servicio/FacturaServicio - Transaccion/input_DETCANTIDAD'), 
    Cantidad)

WebUI.delay(1)

WebUI.setText(findTestObject('Cuentas a Pagar/Documentos Compra/Factura Servicio/FacturaServicio - Transaccion/input_DETPRECIOUNITARIO'), 
    Precio)

WebUI.delay(1)

WebUI.click(findTestObject('Cuentas a Pagar/Documentos Compra/Factura Servicio/FacturaServicio - Transaccion/bt_ENTER'), 
    FailureHandling.STOP_ON_FAILURE)

