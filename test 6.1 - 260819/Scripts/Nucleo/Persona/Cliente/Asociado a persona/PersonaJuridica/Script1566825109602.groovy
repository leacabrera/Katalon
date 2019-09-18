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

WebUI.click(findTestObject('Nucleo/Persona/Cliente/Cliente - WW/AgregarCliente'))

WebUI.delay(2)

WebUI.selectOptionByValue(findTestObject('Nucleo/Persona/Cliente/Cliente - Transaccion/Persona'), TipoPersona, false)

WebUI.delay(2)

WebUI.click(findTestObject('Nucleo/Persona/Cliente/Cliente - Transaccion/a_Asociar una persona existente'))

<<<<<<< HEAD
WebUI.delay(1, FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Nucleo/Persona/Cliente/Cliente - PopUp (Asociar a persona)/Page_Cliente/input_K2 BTools Generic Search Field_vK2BTOOLSGENERICSEARCHFIELD'), 
    PersJExistente)

WebUI.delay(1)

WebUI.click(findTestObject('Nucleo/Persona/Cliente/Cliente - PopUp (Asociar a persona)/Page_Cliente/a_aldo 08'))

WebUI.delay(2)
=======
WebUI.delay(2)

WebUI.setText(findTestObject('Nucleo/Persona/Cliente/Cliente - PopUp (Asociar a persona)/BuscarPersona'), PersJExistente)

WebUI.delay(1)

WebUI.click(findTestObject('Nucleo/Persona/Cliente/Cliente - PopUp (Asociar a persona)/PersonaJ'))

WebUI.delay(1)
>>>>>>> origin/Maria

WebUI.setText(findTestObject('Nucleo/Persona/Cliente/Cliente - Transaccion/CLIENTECODIGO'), Codigo)

WebUI.delay(1)

WebUI.click(findTestObject('Nucleo/Persona/Cliente/Cliente - Transaccion/CONFIRMAR'))

WebUI.delay(2)

WebUI.click(findTestObject('Nucleo/Persona/Cliente/Cliente- EM/backtoWWClientes'))

WebUI.delay(2)

WebUI.setText(findTestObject('Nucleo/Persona/Cliente/Cliente - WW/BuscarCliente'), Codigo, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(1)

WebUI.verifyElementPresent(findTestObject('Nucleo/Persona/Cliente/Cliente - WW/span_UY RUT 466656442808'), 0)

