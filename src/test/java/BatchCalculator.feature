Feature: Calculator Rest
	Scenario:Division
		Given Rest Api "http://localhost:9440/calculator/division?firstOperand=20.0&secondOperand=10.0"
		When I invoke the given rest api
		Then the expected is 2.0
