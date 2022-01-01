package com.juaracoding.wptesting.utils;


	
	public enum TestCases {

		T1("Testing the authentication"),
		T2("Testing masuk menu Register"),
		T3("Testing masuk menu Login"),
		T4("Testing masuk menu Addcart"),
		T5("Testing masuk menu CartFinish"),
		T6("Testing masuk menu Checkout");
		
		
	
		
		
		private String testName;	

		TestCases(String value){
			this.testName = value;
		}
		
		public String getTestName() {
			return testName;
		}
	}


