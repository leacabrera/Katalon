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
<<<<<<< HEAD:test 6.1 - 260819/Scripts/Cuantas a Pagar/Documentos a Pagar/Buscar-Eliminar/Script1567107360364.groovy
<<<<<<< HEAD
import org.openqa.selenium.Keys as Keys
=======
>>>>>>> origin/Maria
=======
import org.openqa.selenium.Keys as Keys
>>>>>>> Maria:test 6.1 - 260819/Scripts/Cuantas a Pagar/Documentos a Pagar/Buscar-Eliminar/Script1568729798295.groovy

WebUI.delay(2)

WebUI.click(findTestObject('Menu/a_Cuentas a pagar'))

WebUI.delay(1)

WebUI.click(findTestObject('Cuentas a Pagar/a_Documentos de compra'))

<<<<<<< HEAD:test 6.1 - 260819/Scripts/Cuantas a Pagar/Documentos a Pagar/Buscar-Eliminar/Script1567107360364.groovy
<<<<<<< HEAD
WebUI.delay(2)

WebUI.setText(findTestObject('Cuentas a Pagar/Documentos Compra/Documentos comerciales - WW/input_Buscar'), WebUI.concatenate ([Serie,'-',Sucursal,'-',Numero]as String[], FailureHandling.STOP_ON_FAILURE))

WebUI.waitForPageLoad(2)

WebUI.mouseOver(findTestObject('Cuentas a Pagar/Documentos Compra/Documentos comerciales - WW/span_04092019'))

WebUI.delay(2)

WebUI.click(findTestObject('Cuentas a Pagar/Documentos Compra/Documentos comerciales - WW/img_Interactiva_vDELETE_0001'))

WebUI.delay(2)

WebUI.click(findTestObject('Cuentas a Pagar/Documentos Compra/Documentos comerciales - WW/input_Anula formulario de impresin_ANULAR'))
=======
WebUI.delay(1)
=======
WebUI.delay(2)
>>>>>>> Maria:test 6.1 - 260819/Scripts/Cuantas a Pagar/Documentos a Pagar/Buscar-Eliminar/Script1568729798295.groovy

WebUI.setText(findTestObject('Cuentas a Pagar/Documentos Compra/Documentos comerciales - WW/input_Buscar'), WebUI.concatenate ([Serie,'-',Sucursal,'-',Numero]as String[], FailureHandling.STOP_ON_FAILURE))

WebUI.waitForPageLoad(2)

WebUI.mouseOver(findTestObject('Cuentas a Pagar/Documentos Compra/Documentos comerciales - WW/span_04092019'))

WebUI.delay(2)

WebUI.click(findTestObject('Cuentas a Pagar/Documentos Compra/Documentos comerciales - WW/img_Interactiva_vDELETE_0001'))

WebUI.delay(2)

<<<<<<< HEAD:test 6.1 - 260819/Scripts/Cuantas a Pagar/Documentos a Pagar/Buscar-Eliminar/Script1567107360364.groovy
WebUI.click(findTestObject('Cuentas a Pagar/Documentos Compra/Factura Servicio/Page_Eliminar documento/input_Anula formulario de impresin_ANULAR'))
>>>>>>> origin/Maria
=======
WebUI.click(findTestObject('Cuentas a Pagar/Documentos Compra/Documentos comerciales - WW/input_Anula formulario de impresin_ANULAR'))
>>>>>>> Maria:test 6.1 - 260819/Scripts/Cuantas a Pagar/Documentos a Pagar/Buscar-Eliminar/Script1568729798295.groovy

