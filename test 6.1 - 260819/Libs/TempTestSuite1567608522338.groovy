import com.kms.katalon.core.logging.KeywordLogger
import com.kms.katalon.core.exception.StepFailedException
import com.kms.katalon.core.reporting.ReportUtil
import com.kms.katalon.core.main.TestCaseMain
import com.kms.katalon.core.testdata.TestDataColumn
import com.kms.katalon.core.testcase.TestCaseBinding
import com.kms.katalon.core.driver.internal.DriverCleanerCollector
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.configuration.RunConfiguration
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import internal.GlobalVariable as GlobalVariable

Map<String, String> suiteProperties = new HashMap<String, String>();


suiteProperties.put('id', 'Test Suites/Cuentas a Pagar/Documentos a Pagar/FacturaCompraServicios - Crear')

suiteProperties.put('name', 'FacturaCompraServicios - Crear')

suiteProperties.put('description', '')
 

DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())



RunConfiguration.setExecutionSettingFile("C:\\Users\\lcabrera\\Desktop\\test 6.1 - 260819\\Reports\\20190904_114731\\Cuentas a Pagar\\Documentos a Pagar\\FacturaCompraServicios - Crear\\20190904_114842\\execution.properties")

TestCaseMain.beforeStart()

TestCaseMain.startTestSuite('Test Suites/Cuentas a Pagar/Documentos a Pagar/FacturaCompraServicios - Crear', suiteProperties, new File("C:\\Users\\lcabrera\\Desktop\\test 6.1 - 260819\\Reports\\20190904_114731\\Cuentas a Pagar\\Documentos a Pagar\\FacturaCompraServicios - Crear\\20190904_114842\\testCaseBinding"))
