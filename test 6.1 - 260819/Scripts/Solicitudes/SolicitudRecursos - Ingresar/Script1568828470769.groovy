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
WebUI.waitForElementPresent(findTestObject('Solicitudes/a_Mis Solicitudes'), 0)

WebUI.click(findTestObject('Solicitudes/a_Mis Solicitudes'))

WebUI.waitForElementPresent(findTestObject('Solicitudes/a_Solicitudes'), 0)

WebUI.click(findTestObject('Solicitudes/a_Solicitudes'))

WebUI.waitForElementPresent(findTestObject('Solicitudes/SolicitudRecursos/Solicitudes de recursos_WW/NuevaSolicitud'), 0)

WebUI.click(findTestObject('Solicitudes/SolicitudRecursos/Solicitudes de recursos_WW/NuevaSolicitud'))

WebUI.delay(5)

WebUI.selectOptionByValue(findTestObject('Solicitudes/SolicitudRecursos/Solicitud de recursos_Transaccion/select_SolLugarFisico'), 
    LugarFisico, false)

WebUI.selectOptionByValue(findTestObject('Solicitudes/SolicitudRecursos/Solicitud de recursos_Transaccion/select_SolMoneda'), 
    Moneda, true)

WebUI.setText(findTestObject('Solicitudes/SolicitudRecursos/Solicitud de recursos_Transaccion/input_SolEsquema de distribucion'), 
    EsqDistribucion)

WebUI.delay(2)

WebUI.setText(findTestObject('Solicitudes/SolicitudRecursos/Solicitud de recursos_Transaccion/input_SolDetProducto'), Producto)

WebUI.delay(1)

WebUI.setText(findTestObject('Solicitudes/SolicitudRecursos/Solicitud de recursos_Transaccion/input_SolDetCantidad'), Cantidad)

WebUI.delay(1)

WebUI.setText(findTestObject('Solicitudes/SolicitudRecursos/Solicitud de recursos_Transaccion/input_SolDetPrecio'), Precio)

WebUI.delay(2)

WebUI.click(findTestObject('Solicitudes/SolicitudRecursos/Solicitud de recursos_Transaccion/input_SolContinuar'))

WebUI.delay(7)

WebUI.verifyElementText(findTestObject('Solicitudes/SolicitudRecursos/Solicitud-EM/span_SolEstado'), 'En Proceso de Ingreso', 
    FailureHandling.STOP_ON_FAILURE)

