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

WebUI.waitForElementVisible(findTestObject('Menu/a_Configuracion'), 0)

WebUI.click(findTestObject('Menu/a_Configuracion'))

WebUI.waitForElementVisible(findTestObject('Menu/a_Personas'), 0)

WebUI.click(findTestObject('Menu/a_Personas'))

WebUI.delay(1, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Nucleo/Persona/a_Clientes'))

WebUI.waitForElementVisible(findTestObject('Nucleo/Persona/Cliente/Cliente - WW/BuscarCliente'), 0)

WebUI.setText(findTestObject('Nucleo/Persona/Cliente/Cliente - WW/BuscarCliente'), CodigoCli)

<<<<<<< HEAD
<<<<<<< HEAD
WebUI.delay(1, FailureHandling.STOP_ON_FAILURE)
=======
WebUI.waitForElementPresent(findTestObject('Nucleo/Persona/Cliente/Cliente - WW/span_UY RUT 466656442808'), 1)
>>>>>>> origin/Maria
=======
WebUI.delay(1, FailureHandling.STOP_ON_FAILURE)
>>>>>>> Maria

WebUI.mouseOver(findTestObject('Nucleo/Persona/Cliente/Cliente - WW/span_UY RUT 466656442808'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('Nucleo/Persona/Cliente/Cliente - WW/Eliminar'), 1)

WebUI.click(findTestObject('Nucleo/Persona/Cliente/Cliente - WW/Eliminar'), FailureHandling.CONTINUE_ON_FAILURE)

<<<<<<< HEAD
<<<<<<< HEAD
WebUI.waitForElementPresent(findTestObject('Nucleo/Persona/Cliente/Cliente - WW/ConfirmaEliminar'), 1)
=======
WebUI.waitForElementPresent(findTestObject('Nucleo/Persona/Cliente/Cliente - WW/ConfirmaEliminar'), 0)
>>>>>>> origin/Maria
=======
WebUI.waitForElementPresent(findTestObject('Nucleo/Persona/Cliente/Cliente - WW/ConfirmaEliminar'), 1)
>>>>>>> Maria

WebUI.click(findTestObject('Nucleo/Persona/Cliente/Cliente - WW/ConfirmaEliminar'), FailureHandling.CONTINUE_ON_FAILURE)

