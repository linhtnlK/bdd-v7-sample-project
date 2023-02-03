package operations
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase

import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import io.cucumber.java.en.When


class Minus {

	@When("{int} minus {int}")
	def minus(long firstOperand, long secondOperand) {
		WebUI.callTestCase(findTestCase("Test Cases/operations/common/Minus number"), [ ('firstOperand') : firstOperand, ('secondOperand') : secondOperand ], FailureHandling.STOP_ON_FAILURE)
	}
}