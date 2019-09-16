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

WebUI.click(findTestObject('Menu/a_Configuracion'))

WebUI.delay(2)

WebUI.click(findTestObject('Menu/a_Personas'))

WebUI.delay(2)

WebUI.click(findTestObject('Nucleo/Persona/a_Proveedores'))

WebUI.delay(2)

WebUI.setText(findTestObject('Nucleo/Persona/Proveedor/Proveedor - WW/BuscarProveedor'), CodigoProveedor)

WebUI.delay(1)

WebUI.mouseOver(findTestObject('Nucleo/Persona/Proveedor/Proveedor - WW/p_UY RUT 466656440123'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)

WebUI.click(findTestObject('Nucleo/Persona/Proveedor/Proveedor - WW/BORRAR'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2)

WebUI.click(findTestObject('Nucleo/Persona/Proveedor/Proveedor - WW/eliminar -confirmar'), FailureHandling.CONTINUE_ON_FAILURE)

