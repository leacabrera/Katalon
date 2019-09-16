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

WebUI.delay(1)

WebUI.click(findTestObject('Nucleo/Persona/Cliente/Cliente - WW/AgregarCliente'))

WebUI.waitForElementPresent(findTestObject('Nucleo/Persona/Cliente/Cliente - Transaccion/CLIENTECODIGO'), 0)

WebUI.setText(findTestObject('Nucleo/Persona/Cliente/Cliente - Transaccion/CLIENTECODIGO'), Codigo)

WebUI.waitForPageLoad(1)

WebUI.selectOptionByValue(findTestObject('Nucleo/Persona/Cliente/Cliente - Transaccion/Persona'), TipoPersona, false)

WebUI.selectOptionByValue(findTestObject('Nucleo/Persona/Cliente/Cliente - Transaccion/Pais'), Pais, false)

WebUI.setText(findTestObject('Nucleo/Persona/Cliente/Cliente - Transaccion/NDocumento'), Documento, FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Nucleo/Persona/Cliente/Cliente - Transaccion/Nombre comercial'), NomComercial, FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Nucleo/Persona/Cliente/Cliente - Transaccion/Nombre legal'), NomLegal, FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByValue(findTestObject('Nucleo/Persona/Cliente/Cliente - Transaccion/Retiene'), AgenRet, false)

WebUI.click(findTestObject('Nucleo/Persona/Cliente/Cliente - Transaccion/CONFIRMAR'))

WebUI.delay(1, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Nucleo/Persona/Cliente/Cliente- EM/backtoWWClientes'))

WebUI.delay(1)

WebUI.setText(findTestObject('Nucleo/Persona/Cliente/Cliente - WW/BuscarCliente'), Codigo, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Nucleo/Persona/Cliente/Cliente - WW/span_UY RUT 466656442808'), 0)

